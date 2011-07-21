package slaurent.jdbcperflogger;

public class SqlTypedValue {
    final Object value;
    final int sqlType;
    final String setter;

    SqlTypedValue(final Object value, final int sqlType) {
        this.value = value;
        this.sqlType = sqlType;
        setter = null;
    }

    SqlTypedValue(final Object value, final String setter) {
        this.value = value;
        sqlType = -1;
        this.setter = setter;
    }

}
