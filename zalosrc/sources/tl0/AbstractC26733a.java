package tl0;

import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: tl0.a */
/* loaded from: classes7.dex */
public abstract class AbstractC26733a {

    /* renamed from: a */
    private static final List f126833a;

    static {
        ArrayList arrayList = new ArrayList();
        String[] strArr = {"UTF-8", "SJIS", "EUC_JP", "GB2312", "ISO8859_1"};
        for (int i11 = 0; i11 < 5; i11++) {
            try {
                Charset forName = Charset.forName(strArr[i11]);
                AbstractC19074t.m100207e(forName, "forName(it)");
                arrayList.add(forName);
            } catch (IllegalCharsetNameException | UnsupportedCharsetException unused) {
            }
        }
        Collection<Charset> values = Charset.availableCharsets().values();
        AbstractC19074t.m100207e(values, "availableCharsets().values");
        arrayList.addAll(values);
        Charset defaultCharset = Charset.defaultCharset();
        AbstractC19074t.m100207e(defaultCharset, "defaultCharset()");
        arrayList.add(defaultCharset);
        f126833a = arrayList;
    }

    /* renamed from: a */
    public static final String m137528a(ByteBuffer byteBuffer) {
        CharBuffer charBuffer;
        AbstractC19074t.m100208f(byteBuffer, "encodedText");
        for (Charset charset : f126833a) {
            CharsetDecoder newDecoder = charset.newDecoder();
            newDecoder.reset();
            byteBuffer.position(0);
            try {
                charBuffer = newDecoder.decode(byteBuffer);
            } catch (CharacterCodingException unused) {
                charBuffer = null;
            }
            if (charBuffer != null) {
                AbstractC20110a.f98889a.mo104548a("Detected charset: %s", charset.displayName());
                String charBuffer2 = charBuffer.toString();
                AbstractC19074t.m100207e(charBuffer2, "charBuffer.toString()");
                return charBuffer2;
            }
        }
        return "";
    }
}
