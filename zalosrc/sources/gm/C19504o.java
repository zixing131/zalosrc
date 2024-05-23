package gm;

import ho0.AbstractC20110a;
import java.nio.charset.StandardCharsets;
import p602w9.C28825a;

/* renamed from: gm.o */
/* loaded from: classes3.dex */
public class C19504o extends C28825a {
    public C19504o(int i11) {
        super(i11);
    }

    @Override // p602w9.C28825a
    /* renamed from: o */
    public int mo101957o(CharSequence charSequence) {
        try {
            return super.mo101957o(charSequence);
        } catch (Exception e11) {
            if (charSequence instanceof String) {
                AbstractC20110a.m104539h(e11);
                return super.mo101957o(new String(((String) charSequence).getBytes(StandardCharsets.UTF_8)));
            }
            throw e11;
        }
    }
}
