package com.tonikelope.megabasterd;

/**
 *
 * @author tonikelope
 */
public class MegaCrypterAPIException extends APIException {

    private static final long serialVersionUID = 1L;

    public MegaCrypterAPIException(int code) {
        super(code, "MEGACRYPTER API ERROR: " + String.valueOf(code));
        _code = code;
    }
}
