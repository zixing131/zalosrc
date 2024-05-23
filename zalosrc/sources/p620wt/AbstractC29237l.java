package p620wt;

import ho0.AbstractC20110a;
import java.io.Closeable;
import java.io.IOException;

/* renamed from: wt.l */
/* loaded from: classes4.dex */
public abstract class AbstractC29237l {
    /* renamed from: a */
    public static final void m145996a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }
}
