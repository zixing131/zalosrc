package p106dp;

import fn0.AbstractC19074t;
import p106dp.AbstractC18038a;

/* renamed from: dp.b */
/* loaded from: classes4.dex */
public final class C18039b {

    /* renamed from: a */
    public static final C18039b f91314a = new C18039b();

    /* renamed from: b */
    private static final float f91315b = 0.75f;

    /* renamed from: c */
    private static final float f91316c = 1.0f;

    /* renamed from: d */
    private static final float f91317d = 0.75f;

    private C18039b() {
    }

    /* renamed from: a */
    public final float m95895a() {
        return f91315b;
    }

    /* renamed from: b */
    public final C18040c m95896b(AbstractC18038a abstractC18038a) {
        C18040c m95899a;
        C18040c m95899a2;
        C18040c m95899a3;
        C18040c m95899a4;
        C18040c m95899a5;
        C18040c m95899a6;
        AbstractC19074t.m100208f(abstractC18038a, "itemState");
        if (abstractC18038a instanceof AbstractC18038a.g) {
            m95899a6 = r13.m95899a((r18 & 1) != 0 ? r13.f91318a : true, (r18 & 2) != 0 ? r13.f91319b : true, (r18 & 4) != 0 ? r13.f91320c : false, (r18 & 8) != 0 ? r13.f91321d : false, (r18 & 16) != 0 ? r13.f91322e : false, (r18 & 32) != 0 ? r13.f91323f : 0.0f, (r18 & 64) != 0 ? r13.f91324g : 0, (r18 & 128) != 0 ? new C18040c(false, false, false, false, false, 0.0f, 0, false, 255, null).f91325h : false);
            return m95899a6;
        }
        if (abstractC18038a instanceof AbstractC18038a.b) {
            m95899a5 = r13.m95899a((r18 & 1) != 0 ? r13.f91318a : false, (r18 & 2) != 0 ? r13.f91319b : true, (r18 & 4) != 0 ? r13.f91320c : false, (r18 & 8) != 0 ? r13.f91321d : false, (r18 & 16) != 0 ? r13.f91322e : false, (r18 & 32) != 0 ? r13.f91323f : 0.0f, (r18 & 64) != 0 ? r13.f91324g : 0, (r18 & 128) != 0 ? new C18040c(false, false, false, false, false, 0.0f, 0, false, 255, null).f91325h : false);
            return m95899a5;
        }
        if (abstractC18038a instanceof AbstractC18038a.f) {
            m95899a4 = r13.m95899a((r18 & 1) != 0 ? r13.f91318a : false, (r18 & 2) != 0 ? r13.f91319b : false, (r18 & 4) != 0 ? r13.f91320c : true, (r18 & 8) != 0 ? r13.f91321d : false, (r18 & 16) != 0 ? r13.f91322e : false, (r18 & 32) != 0 ? r13.f91323f : 0.0f, (r18 & 64) != 0 ? r13.f91324g : 0, (r18 & 128) != 0 ? new C18040c(false, false, false, false, false, 0.0f, 0, false, 255, null).f91325h : false);
            return m95899a4;
        }
        if ((abstractC18038a instanceof AbstractC18038a.d) || AbstractC19074t.m100204b(abstractC18038a, AbstractC18038a.a.f91307a)) {
            m95899a = r13.m95899a((r18 & 1) != 0 ? r13.f91318a : true, (r18 & 2) != 0 ? r13.f91319b : false, (r18 & 4) != 0 ? r13.f91320c : false, (r18 & 8) != 0 ? r13.f91321d : true, (r18 & 16) != 0 ? r13.f91322e : false, (r18 & 32) != 0 ? r13.f91323f : 0.0f, (r18 & 64) != 0 ? r13.f91324g : 0, (r18 & 128) != 0 ? new C18040c(false, false, false, false, false, 0.0f, 0, false, 255, null).f91325h : false);
            return m95899a;
        }
        if (abstractC18038a instanceof AbstractC18038a.e) {
            m95899a3 = r13.m95899a((r18 & 1) != 0 ? r13.f91318a : false, (r18 & 2) != 0 ? r13.f91319b : false, (r18 & 4) != 0 ? r13.f91320c : false, (r18 & 8) != 0 ? r13.f91321d : true, (r18 & 16) != 0 ? r13.f91322e : false, (r18 & 32) != 0 ? r13.f91323f : 0.0f, (r18 & 64) != 0 ? r13.f91324g : 0, (r18 & 128) != 0 ? new C18040c(false, false, false, false, false, 0.0f, 0, false, 255, null).f91325h : false);
            return m95899a3;
        }
        if (abstractC18038a instanceof AbstractC18038a.c) {
            m95899a2 = r13.m95899a((r18 & 1) != 0 ? r13.f91318a : true, (r18 & 2) != 0 ? r13.f91319b : false, (r18 & 4) != 0 ? r13.f91320c : false, (r18 & 8) != 0 ? r13.f91321d : false, (r18 & 16) != 0 ? r13.f91322e : true, (r18 & 32) != 0 ? r13.f91323f : 0.0f, (r18 & 64) != 0 ? r13.f91324g : 0, (r18 & 128) != 0 ? new C18040c(false, false, false, false, false, 0.0f, 0, false, 255, null).f91325h : false);
            return m95899a2;
        }
        return new C18040c(false, false, false, false, false, 0.0f, 0, false, 255, null);
    }

    /* renamed from: c */
    public final C18040c m95897c(AbstractC18038a abstractC18038a) {
        C18040c m95899a;
        AbstractC19074t.m100208f(abstractC18038a, "itemState");
        m95899a = r1.m95899a((r18 & 1) != 0 ? r1.f91318a : false, (r18 & 2) != 0 ? r1.f91319b : false, (r18 & 4) != 0 ? r1.f91320c : false, (r18 & 8) != 0 ? r1.f91321d : false, (r18 & 16) != 0 ? r1.f91322e : false, (r18 & 32) != 0 ? r1.f91323f : 0.0f, (r18 & 64) != 0 ? r1.f91324g : 0, (r18 & 128) != 0 ? m95896b(abstractC18038a).f91325h : !r1.m95904g());
        return m95899a;
    }
}
