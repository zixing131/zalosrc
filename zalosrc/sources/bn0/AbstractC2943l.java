package bn0;

import fn0.AbstractC19074t;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;

/* renamed from: bn0.l */
/* loaded from: classes7.dex */
public abstract class AbstractC2943l {
    /* renamed from: a */
    public static final long m13929a(Reader reader, Writer writer, int i11) {
        AbstractC19074t.m100208f(reader, "<this>");
        AbstractC19074t.m100208f(writer, "out");
        char[] cArr = new char[i11];
        int read = reader.read(cArr);
        long j11 = 0;
        while (read >= 0) {
            writer.write(cArr, 0, read);
            j11 += read;
            read = reader.read(cArr);
        }
        return j11;
    }

    /* renamed from: b */
    public static /* synthetic */ long m13930b(Reader reader, Writer writer, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 8192;
        }
        return m13929a(reader, writer, i11);
    }

    /* renamed from: c */
    public static final String m13931c(Reader reader) {
        AbstractC19074t.m100208f(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        m13930b(reader, stringWriter, 0, 2, null);
        String stringWriter2 = stringWriter.toString();
        AbstractC19074t.m100207e(stringWriter2, "toString(...)");
        return stringWriter2;
    }
}
