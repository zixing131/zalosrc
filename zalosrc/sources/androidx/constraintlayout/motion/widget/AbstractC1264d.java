package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: androidx.constraintlayout.motion.widget.d */
/* loaded from: classes2.dex */
public abstract class AbstractC1264d {

    /* renamed from: f */
    public static int f5073f = -1;

    /* renamed from: a */
    int f5074a;

    /* renamed from: b */
    int f5075b;

    /* renamed from: c */
    String f5076c;

    /* renamed from: d */
    protected int f5077d;

    /* renamed from: e */
    HashMap f5078e;

    public AbstractC1264d() {
        int i11 = f5073f;
        this.f5074a = i11;
        this.f5075b = i11;
        this.f5076c = null;
    }

    /* renamed from: a */
    public abstract void mo6064a(HashMap hashMap);

    /* renamed from: b */
    public abstract AbstractC1264d mo6065b();

    /* renamed from: c */
    public AbstractC1264d mo6066c(AbstractC1264d abstractC1264d) {
        this.f5074a = abstractC1264d.f5074a;
        this.f5075b = abstractC1264d.f5075b;
        this.f5076c = abstractC1264d.f5076c;
        this.f5077d = abstractC1264d.f5077d;
        this.f5078e = abstractC1264d.f5078e;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract void mo6067d(HashSet hashSet);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract void mo6068e(Context context, AttributeSet attributeSet);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean m6069f(String str) {
        String str2 = this.f5076c;
        if (str2 != null && str != null) {
            return str.matches(str2);
        }
        return false;
    }

    /* renamed from: g */
    public void m6070g(int i11) {
        this.f5074a = i11;
    }

    /* renamed from: h */
    public void mo6071h(HashMap hashMap) {
    }

    /* renamed from: i */
    public AbstractC1264d m6072i(int i11) {
        this.f5075b = i11;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean m6073j(Object obj) {
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return Boolean.parseBoolean(obj.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public float m6074k(Object obj) {
        if (obj instanceof Float) {
            return ((Float) obj).floatValue();
        }
        return Float.parseFloat(obj.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public int m6075l(Object obj) {
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return Integer.parseInt(obj.toString());
    }
}
