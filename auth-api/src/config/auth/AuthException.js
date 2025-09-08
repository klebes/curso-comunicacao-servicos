class AuthException extends Error {
  constructor(status, message){
    super(message);
    this.status = status;
    this.name = this.constructor.name;

    if (Error.captureStackTrace){
      Error.captureStackTrace(this, this.constructor);
    }
  }
}

export default AuthException;