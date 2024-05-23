package p498s;

import org.json.JSONObject;
import p467r.AbstractC25579b;
import p467r.C25589l;
import p512t.C26440f;
import p562v.AbstractC27389b;
import p562v.AbstractC27392e;

/* renamed from: s.a */
/* loaded from: classes2.dex */
public final class C26055a {

    /* renamed from: a */
    private final C25589l f124212a;

    private C26055a(C25589l c25589l) {
        this.f124212a = c25589l;
    }

    /* renamed from: a */
    public static C26055a m134148a(AbstractC25579b abstractC25579b) {
        C25589l c25589l = (C25589l) abstractC25579b;
        AbstractC27392e.m140336b(abstractC25579b, "AdSession is null");
        AbstractC27392e.m140346l(c25589l);
        AbstractC27392e.m140340f(c25589l);
        AbstractC27392e.m140341g(c25589l);
        AbstractC27392e.m140344j(c25589l);
        C26055a c26055a = new C26055a(c25589l);
        c25589l.m132176u().m146285l(c26055a);
        return c26055a;
    }

    /* renamed from: c */
    private void m134149c(float f11) {
        if (f11 <= 0.0f) {
            throw new IllegalArgumentException("Invalid Media duration");
        }
    }

    /* renamed from: f */
    private void m134150f(float f11) {
        if (f11 < 0.0f || f11 > 1.0f) {
            throw new IllegalArgumentException("Invalid Media volume");
        }
    }

    /* renamed from: b */
    public void m134151b() {
        AbstractC27392e.m140342h(this.f124212a);
        this.f124212a.m132176u().m146277d("complete");
    }

    /* renamed from: d */
    public void m134152d(float f11, float f12) {
        m134149c(f11);
        m134150f(f12);
        AbstractC27392e.m140342h(this.f124212a);
        JSONObject jSONObject = new JSONObject();
        AbstractC27389b.m140321f(jSONObject, "duration", Float.valueOf(f11));
        AbstractC27389b.m140321f(jSONObject, "mediaPlayerVolume", Float.valueOf(f12));
        AbstractC27389b.m140321f(jSONObject, "deviceVolume", Float.valueOf(C26440f.m136313b().m136318g()));
        this.f124212a.m132176u().m146279f("start", jSONObject);
    }

    /* renamed from: e */
    public void m134153e() {
        AbstractC27392e.m140342h(this.f124212a);
        this.f124212a.m132176u().m146277d("firstQuartile");
    }

    /* renamed from: g */
    public void m134154g() {
        AbstractC27392e.m140342h(this.f124212a);
        this.f124212a.m132176u().m146277d("midpoint");
    }

    /* renamed from: h */
    public void m134155h(float f11) {
        m134150f(f11);
        AbstractC27392e.m140342h(this.f124212a);
        JSONObject jSONObject = new JSONObject();
        AbstractC27389b.m140321f(jSONObject, "mediaPlayerVolume", Float.valueOf(f11));
        AbstractC27389b.m140321f(jSONObject, "deviceVolume", Float.valueOf(C26440f.m136313b().m136318g()));
        this.f124212a.m132176u().m146279f("volumeChange", jSONObject);
    }

    /* renamed from: i */
    public void m134156i() {
        AbstractC27392e.m140342h(this.f124212a);
        this.f124212a.m132176u().m146277d("pause");
    }

    /* renamed from: j */
    public void m134157j() {
        AbstractC27392e.m140342h(this.f124212a);
        this.f124212a.m132176u().m146277d("resume");
    }

    /* renamed from: k */
    public void m134158k() {
        AbstractC27392e.m140342h(this.f124212a);
        this.f124212a.m132176u().m146277d("skipped");
    }

    /* renamed from: l */
    public void m134159l() {
        AbstractC27392e.m140342h(this.f124212a);
        this.f124212a.m132176u().m146277d("thirdQuartile");
    }
}
