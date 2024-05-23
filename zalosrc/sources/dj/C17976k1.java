package dj;

import android.text.TextUtils;
import ho0.AbstractC20110a;
import im.C20612c;
import java.io.IOException;
import p645xh.AbstractC29633j;

/* renamed from: dj.k1 */
/* loaded from: classes3.dex */
public class C17976k1 {

    /* renamed from: a */
    public byte[] f91047a;

    /* renamed from: b */
    public C20612c f91048b;

    /* renamed from: c */
    public String f91049c;

    public C17976k1(String str) {
        this.f91047a = new byte[0];
        this.f91049c = "";
        m95616a(str);
    }

    /* renamed from: a */
    public void m95616a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        AbstractC20110a.m104535d(str, new Object[0]);
        this.f91049c = str;
        try {
            this.f91047a = AbstractC29633j.m147357f(str);
        } catch (IOException e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    public C17976k1(String str, C20612c c20612c) {
        this(str);
        this.f91048b = c20612c;
    }
}
