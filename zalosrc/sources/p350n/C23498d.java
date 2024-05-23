package p350n;

import android.content.Context;
import java.util.HashMap;
import java.util.List;
import p283k.AbstractC21420a;
import p375o.C23970a;
import p375o.C23971b;

/* renamed from: n.d */
/* loaded from: classes2.dex */
public final class C23498d {

    /* renamed from: a */
    private String f114084a = null;

    /* renamed from: b */
    private C23971b f114085b = null;

    /* renamed from: c */
    private List f114086c = null;

    /* renamed from: d */
    private C23970a f114087d = null;

    /* renamed from: e */
    private List f114088e = null;

    /* renamed from: f */
    private List f114089f = null;

    /* renamed from: g */
    private HashMap f114090g = null;

    /* renamed from: h */
    private HashMap f114091h = null;

    /* renamed from: i */
    private List f114092i = null;

    /* renamed from: a */
    public List m123341a() {
        return this.f114092i;
    }

    /* renamed from: b */
    public void m123342b(int i11) {
    }

    /* renamed from: c */
    public void m123343c(String str) {
        this.f114084a = str;
    }

    /* renamed from: d */
    public void m123344d(HashMap hashMap) {
        this.f114090g = hashMap;
    }

    /* renamed from: e */
    public void m123345e(List list) {
        this.f114092i = list;
    }

    /* renamed from: f */
    public void m123346f(C23970a c23970a) {
        this.f114087d = c23970a;
    }

    /* renamed from: g */
    public void m123347g(C23971b c23971b) {
        this.f114085b = c23971b;
    }

    /* renamed from: h */
    public boolean m123348h(Context context) {
        List list;
        C23970a c23970a;
        try {
            list = this.f114086c;
        } catch (Exception e11) {
            AbstractC21420a.m110922b("VASTModel", "validate", e11);
        }
        if (list != null && list.size() != 0 && (c23970a = this.f114087d) != null && c23970a.m125446i() != null) {
            if (this.f114087d.m125446i().length() != 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public String m123349i() {
        return this.f114084a;
    }

    /* renamed from: j */
    public void m123350j(HashMap hashMap) {
        this.f114091h = hashMap;
    }

    /* renamed from: k */
    public void m123351k(List list) {
        this.f114089f = list;
    }

    /* renamed from: l */
    public List m123352l() {
        return this.f114089f;
    }

    /* renamed from: m */
    public void m123353m(List list) {
        this.f114088e = list;
    }

    /* renamed from: n */
    public HashMap m123354n() {
        return this.f114090g;
    }

    /* renamed from: o */
    public void m123355o(List list) {
        this.f114086c = list;
    }

    /* renamed from: p */
    public List m123356p() {
        return this.f114088e;
    }

    /* renamed from: q */
    public C23970a m123357q() {
        return this.f114087d;
    }

    /* renamed from: r */
    public HashMap m123358r() {
        return this.f114091h;
    }

    /* renamed from: s */
    public C23971b m123359s() {
        return this.f114085b;
    }
}
