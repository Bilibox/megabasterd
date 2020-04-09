package com.tonikelope.megabasterd;

/**
 *
 * @author tonikelope
 */
public class MegaAPIException extends APIException {

    private static final long serialVersionUID = 1L;

    public MegaAPIException(int code) {
        super(code, "MEGA API ERROR: " + String.valueOf(code));
        _code = code;
    }
}
