package kh0;

import android.content.Context;
import hh0.AbstractC20065c;

/* renamed from: kh0.c */
/* loaded from: classes.dex */
public class C21727c extends AbstractC20065c {

    /* renamed from: c */
    private final String f105508c;

    /* renamed from: d */
    private final String f105509d;

    /* renamed from: e */
    private final String f105510e;

    /* renamed from: f */
    private final String f105511f;

    public C21727c(Context context) {
        super(context);
        this.f105508c = "PREFERECE_KEY_URL_OAUTH";
        this.f105509d = "PREFERECE_KEY_URL_CENTRALIZED";
        this.f105510e = "PREFERECE_KEY_URL_GRAPH";
        this.f105511f = "PREFERCE_EXPIRE_TIME";
    }

    /* renamed from: f */
    public long m112139f() {
        return m104277a("PREFERCE_EXPIRE_TIME");
    }

    /* renamed from: g */
    public String m112140g() {
        return m104278b("PREFERECE_KEY_URL_CENTRALIZED");
    }

    /* renamed from: h */
    public String m112141h() {
        return m104278b("PREFERECE_KEY_URL_GRAPH");
    }

    /* renamed from: i */
    public String m112142i() {
        return m104278b("PREFERECE_KEY_URL_OAUTH");
    }

    /* renamed from: j */
    public void m112143j(long j11) {
        m104279d("PREFERCE_EXPIRE_TIME", j11);
    }

    /* renamed from: k */
    public void m112144k(String str) {
        m104280e("PREFERECE_KEY_URL_CENTRALIZED", str);
    }

    /* renamed from: l */
    public void m112145l(String str) {
        m104280e("PREFERECE_KEY_URL_GRAPH", str);
    }

    /* renamed from: m */
    public void m112146m(String str) {
        m104280e("PREFERECE_KEY_URL_OAUTH", str);
    }
}
