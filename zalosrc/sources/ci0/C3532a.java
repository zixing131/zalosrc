package ci0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import androidx.core.content.AbstractC1388a;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import bi0.AbstractC2809c;
import bi0.AbstractC2810d;
import bi0.AbstractC2816j;
import com.zing.zalo.zdesign.component.C16974f;
import com.zing.zalo.zdesign.component.EnumC16980h;
import com.zing.zalo.zdesign.component.EnumC16991i;
import fn0.AbstractC19074t;
import pm0.C24860q;
import sj0.C26277b;
import ui0.C27276c;
import ui0.C27280g;

/* renamed from: ci0.a */
/* loaded from: classes7.dex */
public final class C3532a {

    /* renamed from: a */
    private boolean f14850a;

    /* renamed from: b */
    private boolean f14851b;

    /* renamed from: c */
    private int f14852c;

    /* renamed from: d */
    private int f14853d;

    /* renamed from: e */
    private int f14854e;

    /* renamed from: f */
    private CharSequence f14855f;

    /* renamed from: g */
    private Drawable f14856g;

    /* renamed from: h */
    private int f14857h;

    /* renamed from: i */
    private int f14858i;

    /* renamed from: j */
    private int f14859j;

    /* renamed from: k */
    private boolean f14860k;

    /* renamed from: l */
    private C16974f f14861l;

    /* renamed from: m */
    private boolean f14862m;

    /* renamed from: n */
    private C26277b f14863n;

    /* renamed from: o */
    private Paint f14864o;

    /* renamed from: p */
    private int f14865p;

    /* renamed from: q */
    private int f14866q;

    /* renamed from: r */
    private int f14867r;

    /* renamed from: s */
    private int f14868s;

    /* renamed from: t */
    private float f14869t;

    /* renamed from: u */
    private boolean f14870u;

    /* renamed from: v */
    private a f14871v;

    /* renamed from: w */
    private Drawable f14872w;

    /* renamed from: x */
    private boolean f14873x;

    /* renamed from: ci0.a$a */
    /* loaded from: classes7.dex */
    public interface a {
    }

    public C3532a(a aVar) {
        AbstractC19074t.m100208f(aVar, "listener");
        this.f14853d = EnumC16980h.SIZE_10.m90985c();
        this.f14854e = EnumC16991i.FEATURE_NUMBER.m91021c();
        this.f14855f = "";
        this.f14864o = new Paint();
        this.f14871v = aVar;
        this.f14873x = true;
    }

    /* renamed from: f */
    private final void m17895f(Context context) {
        C16974f c16974f = new C16974f(context);
        c16974f.m90974x(m17905k(this.f14854e));
        c16974f.m90971u(m17904j(this.f14853d));
        c16974f.m90972v(this.f14855f);
        c16974f.m90967q(this.f14856g);
        c16974f.m90969s(this.f14850a);
        c16974f.m90973w(this.f14857h);
        c16974f.m90968r(this.f14858i);
        c16974f.m90966p(this.f14859j);
        c16974f.m90965o(this.f14852c);
        c16974f.m90970t(this.f14851b);
        c16974f.m90975y(this.f14860k);
        this.f14861l = c16974f;
    }

    /* renamed from: a */
    public final C24860q m17896a(Context context) {
        Drawable drawable;
        int i11;
        int i12;
        int i13;
        int i14;
        AbstractC19074t.m100208f(context, "context");
        int i15 = this.f14854e;
        boolean z11 = true;
        if (i15 == EnumC16991i.SYSTEM_STATUS_WARNING.m91021c()) {
            if (this.f14851b) {
                int i16 = this.f14853d;
                if (i16 != 12) {
                    if (i16 != 16) {
                        if (i16 != 24) {
                            i14 = AbstractC2810d.bg_badge_warning_triangle_border_16;
                        } else {
                            i14 = AbstractC2810d.bg_badge_warning_triangle_border_24;
                        }
                    } else {
                        i14 = AbstractC2810d.bg_badge_warning_triangle_border_16;
                    }
                } else {
                    i14 = AbstractC2810d.bg_badge_warning_triangle_border_12;
                }
                drawable = C27280g.m139658a(context, i14);
            } else {
                int i17 = this.f14853d;
                if (i17 != 12) {
                    if (i17 != 16) {
                        if (i17 != 24) {
                            i13 = AbstractC2810d.bg_badge_triangle_16;
                        } else {
                            i13 = AbstractC2810d.bg_badge_triangle_24;
                        }
                    } else {
                        i13 = AbstractC2810d.bg_badge_triangle_16;
                    }
                } else {
                    i13 = AbstractC2810d.bg_badge_triangle_12;
                }
                drawable = C27280g.m139660c(context, i13, AbstractC2807a.badge_background_warning);
            }
        } else if (i15 == EnumC16991i.SYSTEM_STATUS_DANGER.m91021c()) {
            if (this.f14851b) {
                int i18 = this.f14853d;
                if (i18 != 12) {
                    if (i18 != 16) {
                        if (i18 != 24) {
                            i12 = AbstractC2810d.bg_badge_danger_triangle_border_16;
                        } else {
                            i12 = AbstractC2810d.bg_badge_danger_triangle_border_24;
                        }
                    } else {
                        i12 = AbstractC2810d.bg_badge_danger_triangle_border_16;
                    }
                } else {
                    i12 = AbstractC2810d.bg_badge_danger_triangle_border_12;
                }
                drawable = C27280g.m139658a(context, i12);
            } else {
                int i19 = this.f14853d;
                if (i19 != 12) {
                    if (i19 != 16) {
                        if (i19 != 24) {
                            i11 = AbstractC2810d.bg_badge_triangle_16;
                        } else {
                            i11 = AbstractC2810d.bg_badge_triangle_24;
                        }
                    } else {
                        i11 = AbstractC2810d.bg_badge_triangle_16;
                    }
                } else {
                    i11 = AbstractC2810d.bg_badge_triangle_12;
                }
                drawable = C27280g.m139660c(context, i11, AbstractC2807a.badge_background_red);
            }
        } else {
            if (i15 == EnumC16991i.OA.m91021c()) {
                drawable = C27280g.m139658a(context, AbstractC2810d.zds_oic_oa_star_check_color_24);
            } else {
                GradientDrawable gradientDrawable = new GradientDrawable();
                float dimensionPixelSize = context.getResources().getDimensionPixelSize(AbstractC2809c.corner_100);
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadii(new float[]{dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize});
                gradientDrawable.setColor(this.f14852c);
                if (this.f14851b) {
                    gradientDrawable.setStroke(C27276c.m139649b(context, 2), this.f14859j);
                }
                drawable = gradientDrawable;
            }
            z11 = false;
        }
        this.f14872w = drawable;
        return new C24860q(drawable, Boolean.valueOf(z11));
    }

    /* renamed from: b */
    public final void m17897b(Canvas canvas, int i11, int i12) {
        AbstractC19074t.m100208f(canvas, "canvas");
        if (this.f14862m && i11 > 0 && i12 > 0) {
            float f11 = 2;
            float f12 = (i11 * 1.0f) / f11;
            float f13 = (i12 * 1.0f) / f11;
            if (this.f14863n != null && this.f14869t > 0.0f && this.f14870u) {
                canvas.save();
                canvas.translate(f12, f13);
                C26277b c26277b = this.f14863n;
                AbstractC19074t.m100205c(c26277b);
                c26277b.draw(canvas);
                canvas.restore();
            }
            if (this.f14867r > 0) {
                canvas.save();
                this.f14864o.setColor(this.f14865p);
                canvas.drawCircle(f12, f13, (this.f14867r * 1.0f) / f11, this.f14864o);
                canvas.restore();
            }
            if (this.f14868s > 0) {
                canvas.save();
                this.f14864o.setColor(this.f14866q);
                canvas.drawCircle(f12, f13, (this.f14868s * 1.0f) / f11, this.f14864o);
                canvas.restore();
            }
        }
    }

    /* renamed from: c */
    public final C16974f m17898c() {
        return this.f14861l;
    }

    /* renamed from: d */
    public final int m17899d(Context context) {
        AbstractC19074t.m100208f(context, "context");
        int m139649b = C27276c.m139649b(context, this.f14853d);
        if (this.f14851b) {
            m139649b += C27276c.m139649b(context, 4);
        }
        if (this.f14862m) {
            return m139649b + C27276c.m139649b(context, 10);
        }
        return m139649b;
    }

    /* renamed from: e */
    public final void m17900e(Context context, int i11, int i12, boolean z11) {
        AbstractC19074t.m100208f(context, "context");
        if (i11 != EnumC16991i.CUSTOM.m91021c()) {
            int i13 = this.f14860k ? AbstractC2807a.legacy_whtA100 : AbstractC2807a.badge_content_2;
            AbstractC2816j.a aVar = AbstractC2816j.Companion;
            this.f14857h = aVar.m13592a(context, i13);
            this.f14858i = aVar.m13592a(context, i13);
            this.f14859j = aVar.m13592a(context, AbstractC2807a.badge_border);
        }
        if (i11 == EnumC16991i.FEATURE_NUMBER.m91021c()) {
            this.f14853d = 16;
            this.f14852c = AbstractC2816j.Companion.m13592a(context, AbstractC2807a.badge_background_red);
        } else if (i11 == EnumC16991i.FEATURE_DOT.m91021c()) {
            this.f14853d = 10;
            this.f14855f = "";
            this.f14852c = AbstractC2816j.Companion.m13592a(context, AbstractC2807a.badge_background_red);
        } else if (i11 == EnumC16991i.CHAT_DOT.m91021c()) {
            this.f14853d = 10;
            this.f14855f = "";
            this.f14852c = AbstractC2816j.Companion.m13592a(context, z11 ? AbstractC2807a.chat_tab_chat_badge_mute : AbstractC2807a.chat_tab_chat_badge_notification);
        } else if (i11 == EnumC16991i.CHAT_NUMBER.m91021c()) {
            this.f14853d = 16;
            this.f14852c = AbstractC2816j.Companion.m13592a(context, z11 ? AbstractC2807a.chat_tab_chat_badge_mute : AbstractC2807a.chat_tab_chat_badge_notification);
        } else if (i11 == EnumC16991i.CHAT_MENTION.m91021c()) {
            this.f14853d = 16;
            this.f14855f = "";
            this.f14852c = AbstractC2816j.Companion.m13592a(context, AbstractC2807a.chat_tab_chat_badge_mention);
            this.f14856g = C27280g.m139658a(context, AbstractC2810d.zds_ic_at_solid_16);
        } else if (i11 == EnumC16991i.NEW_TEXT.m91021c()) {
            this.f14853d = 16;
            this.f14852c = AbstractC2816j.Companion.m13592a(context, AbstractC2807a.badge_background_green);
        } else if (i11 == EnumC16991i.NEW_DOT.m91021c()) {
            this.f14855f = "";
            if (i12 != 8 && i12 != 10) {
                i12 = 10;
            }
            this.f14853d = i12;
            this.f14852c = AbstractC2816j.Companion.m13592a(context, AbstractC2807a.badge_background_blue);
        } else if (i11 == EnumC16991i.SYSTEM_STATUS_SUCCESS.m91021c()) {
            this.f14855f = "";
            if (i12 != 12 && i12 != 16 && i12 != 24) {
                i12 = 16;
            }
            this.f14853d = i12;
            this.f14852c = AbstractC2816j.Companion.m13592a(context, AbstractC2807a.badge_background_green);
            this.f14856g = C27280g.m139658a(context, AbstractC2810d.zds_ic_check_solid_16);
        } else if (i11 == EnumC16991i.SYSTEM_STATUS_WARNING.m91021c()) {
            this.f14855f = "";
            if (i12 != 12 && i12 != 16 && i12 != 24) {
                i12 = 16;
            }
            this.f14853d = i12;
            AbstractC2816j.a aVar2 = AbstractC2816j.Companion;
            this.f14858i = aVar2.m13592a(context, AbstractC2807a.badge_content_1);
            this.f14852c = aVar2.m13592a(context, AbstractC2807a.badge_background_warning);
            this.f14856g = C27280g.m139658a(context, AbstractC2810d.zds_ic_exclamation_solid_16);
        } else if (i11 == EnumC16991i.SYSTEM_STATUS_DANGER.m91021c()) {
            this.f14855f = "";
            if (i12 != 12 && i12 != 16 && i12 != 24) {
                i12 = 16;
            }
            this.f14853d = i12;
            this.f14852c = AbstractC2816j.Companion.m13592a(context, AbstractC2807a.badge_background_red);
            this.f14856g = C27280g.m139658a(context, AbstractC2810d.zds_ic_exclamation_solid_16);
        } else if (i11 == EnumC16991i.USER_STATUS_ONLINE.m91021c()) {
            this.f14855f = "";
            this.f14853d = 10;
            this.f14852c = AbstractC2816j.Companion.m13592a(context, AbstractC2807a.badge_background_green);
        } else if (i11 == EnumC16991i.USER_STATUS_BLOCKED.m91021c()) {
            this.f14855f = "";
            this.f14853d = 12;
            this.f14852c = AbstractC1388a.m6961c(context, AbstractC2808b.f150830r60);
            this.f14856g = C27280g.m139658a(context, AbstractC2810d.zds_ic_ban_solid_16);
            this.f14858i = this.f14859j;
        } else if (i11 == EnumC16991i.USER_STATUS_VERIFIED.m91021c()) {
            this.f14855f = "";
            this.f14853d = 12;
            AbstractC2816j.a aVar3 = AbstractC2816j.Companion;
            this.f14852c = aVar3.m13592a(context, AbstractC2807a.badge_background_warning);
            this.f14858i = aVar3.m13592a(context, AbstractC2807a.badge_content_1);
            this.f14856g = C27280g.m139658a(context, AbstractC2810d.zds_ic_check_solid_16);
        } else if (i11 == EnumC16991i.USER_STATUS_OWNER.m91021c()) {
            this.f14855f = "";
            this.f14853d = 16;
            AbstractC2816j.a aVar4 = AbstractC2816j.Companion;
            this.f14852c = aVar4.m13592a(context, AbstractC2807a.badge_background_warning);
            this.f14856g = C27280g.m139658a(context, AbstractC2810d.zds_ic_key_solid_16);
            this.f14858i = aVar4.m13592a(context, AbstractC2807a.badge_content_1);
        } else if (i11 == EnumC16991i.USER_STATUS_ADMIN.m91021c()) {
            this.f14855f = "";
            this.f14853d = 16;
            this.f14852c = AbstractC2816j.Companion.m13592a(context, AbstractC2807a.badge_background_muted);
            this.f14856g = C27280g.m139658a(context, AbstractC2810d.zds_ic_key_solid_16);
        } else if (i11 == EnumC16991i.SOURCE.m91021c()) {
            this.f14853d = 16;
            AbstractC2816j.a aVar5 = AbstractC2816j.Companion;
            this.f14852c = aVar5.m13592a(context, AbstractC2807a.badge_background_source);
            this.f14858i = 0;
            this.f14857h = aVar5.m13592a(context, AbstractC2807a.badge_content_source);
        } else if (i11 == EnumC16991i.OA.m91021c()) {
            this.f14855f = "";
            if (i12 != 12 && i12 != 16 && i12 != 24) {
                i12 = 16;
            }
            this.f14853d = i12;
        }
        m17895f(context);
    }

    /* renamed from: g */
    public final void m17901g(CharSequence charSequence) {
        AbstractC19074t.m100208f(charSequence, "text");
        int i11 = this.f14854e;
        if (i11 != EnumC16991i.FEATURE_DOT.m91021c() && i11 != EnumC16991i.CHAT_DOT.m91021c() && i11 != EnumC16991i.CHAT_MENTION.m91021c() && i11 != EnumC16991i.NEW_DOT.m91021c() && i11 != EnumC16991i.SYSTEM_STATUS_SUCCESS.m91021c() && i11 != EnumC16991i.SYSTEM_STATUS_WARNING.m91021c() && i11 != EnumC16991i.SYSTEM_STATUS_DANGER.m91021c() && i11 != EnumC16991i.USER_STATUS_ONLINE.m91021c() && i11 != EnumC16991i.USER_STATUS_BLOCKED.m91021c() && i11 != EnumC16991i.USER_STATUS_OWNER.m91021c() && i11 != EnumC16991i.USER_STATUS_ADMIN.m91021c() && i11 != EnumC16991i.USER_STATUS_VERIFIED.m91021c()) {
            this.f14855f = charSequence;
        }
        C16974f c16974f = this.f14861l;
        if (c16974f != null) {
            c16974f.m90972v(this.f14855f);
        }
    }

    /* renamed from: h */
    public final void m17902h(Context context, boolean z11) {
        int i11;
        int m13592a;
        int i12;
        AbstractC19074t.m100208f(context, "context");
        int i13 = this.f14854e;
        if (i13 == EnumC16991i.CHAT_NUMBER.m91021c()) {
            AbstractC2816j.a aVar = AbstractC2816j.Companion;
            if (z11) {
                i12 = AbstractC2807a.badge_background_muted;
            } else {
                i12 = AbstractC2807a.badge_background_blue;
            }
            m13592a = aVar.m13592a(context, i12);
        } else if (i13 == EnumC16991i.CHAT_MENTION.m91021c()) {
            AbstractC2816j.a aVar2 = AbstractC2816j.Companion;
            if (z11) {
                i11 = AbstractC2807a.badge_background_muted;
            } else {
                i11 = AbstractC2807a.badge_background_blue;
            }
            m13592a = aVar2.m13592a(context, i11);
        } else {
            return;
        }
        this.f14852c = m13592a;
        m17896a(context);
    }

    /* renamed from: i */
    public final void m17903i(Context context, C16974f c16974f) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(c16974f, "config");
        this.f14861l = c16974f;
        this.f14854e = c16974f.m90961k().m91021c();
        this.f14853d = c16974f.m90956f().m90985c();
        this.f14855f = c16974f.m90957g();
        this.f14856g = c16974f.m90954d();
        this.f14850a = c16974f.m90963m();
        this.f14857h = c16974f.m90958h();
        this.f14858i = c16974f.m90955e();
        this.f14859j = c16974f.m90952b();
        this.f14852c = c16974f.m90951a();
        this.f14851b = c16974f.m90964n();
        this.f14860k = c16974f.m90962l();
        m17900e(context, this.f14854e, this.f14853d, this.f14850a);
    }

    /* renamed from: j */
    public final EnumC16980h m17904j(int i11) {
        EnumC16980h enumC16980h = EnumC16980h.SIZE_12;
        for (EnumC16980h enumC16980h2 : EnumC16980h.values()) {
            if (enumC16980h2.m90985c() == i11) {
                enumC16980h = enumC16980h2;
            }
        }
        return enumC16980h;
    }

    /* renamed from: k */
    public final EnumC16991i m17905k(int i11) {
        EnumC16991i enumC16991i = EnumC16991i.FEATURE_NUMBER;
        for (EnumC16991i enumC16991i2 : EnumC16991i.values()) {
            if (enumC16991i2.m91021c() == i11) {
                enumC16991i = enumC16991i2;
            }
        }
        return enumC16991i;
    }
}
