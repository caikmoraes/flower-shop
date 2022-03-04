package br.com.flowers.shop.exception

import br.com.flowers.shop.dto.ExceptionDTO
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice
import javax.servlet.http.HttpServletRequest

@RestControllerAdvice
class ExceptionHandler {

    @ExceptionHandler(NotFoundException::class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    fun notFoundException(
        exception: NotFoundException,
        request: HttpServletRequest,
    ): ExceptionDTO = ExceptionDTO(
        status = HttpStatus.NOT_FOUND.value(),
        error = HttpStatus.NOT_FOUND.name,
        message = exception.message,
        path = request.servletPath,
    )

    @ExceptionHandler(Exception::class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    fun serverErrorException(
        exception: Exception,
        request: HttpServletRequest,
    ): ExceptionDTO = ExceptionDTO(
        status = HttpStatus.INTERNAL_SERVER_ERROR.value(),
        error = HttpStatus.INTERNAL_SERVER_ERROR.name,
        message = exception.message,
        path = request.servletPath,
    )
}