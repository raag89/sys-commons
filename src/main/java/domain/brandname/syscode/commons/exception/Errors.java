package domain.brandname.syscode.commons.exception;

import org.apache.commons.lang.StringUtils;

import domain.brandname.syscode.commons.utilities.EnumUtility;
import domain.brandname.syscode.commons.utilities.PropertyReader;

public enum Errors {

	CORRUPT_FILE("err.file.corrupt"), DB_CONN_UNAVB("err.db.conn"), EMPTY_FILE("err.file.empty"), NA(
			StringUtils.EMPTY), NOT_FOUND("err.not.found"), NULL_OR_EMPTY("err.null.or.empty");

	private String errorCode;

	private Errors(final String errCode) {
		errorCode = errCode;
	}

	public static Errors enumFor(String errCode) {
		return EnumUtility.getEnum(Errors.class, errCode);
	}

	public String getErrorCode() {
		return errorCode;
	}

	public String getErrorDesc() {
		return PropertyReader.get(errorCode);
	}

	@Override
	public String toString() {
		return getErrorCode();
	}

}
