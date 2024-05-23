package kotlinx.serialization;

/* loaded from: classes7.dex */
public final class UnknownFieldException extends SerializationException {
    public UnknownFieldException(String str) {
        super(str);
    }

    public UnknownFieldException(int i11) {
        this("An unknown field for index " + i11);
    }
}
