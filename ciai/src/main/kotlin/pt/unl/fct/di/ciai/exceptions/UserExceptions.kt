package pt.unl.fct.di.ciai.exceptions

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

class UserNotFoundException : Exception()

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "User already exists")
class UserAlreadyExistsException : Exception()