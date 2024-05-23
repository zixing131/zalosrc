package org.webrtc;

import java.util.Iterator;

/* renamed from: org.webrtc.o */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC24534o {
    /* renamed from: a */
    public static /* synthetic */ String m127869a(CharSequence charSequence, Iterable iterable) {
        if (charSequence == null) {
            throw new NullPointerException("delimiter");
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            while (true) {
                sb2.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb2.append(charSequence);
            }
        }
        return sb2.toString();
    }
}
