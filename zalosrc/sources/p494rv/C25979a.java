package p494rv;

import android.view.KeyEvent;
import android.view.View;
import androidx.core.os.AbstractC1438d;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.lottie.LottieConfig;
import com.zing.zalo.p077ui.zviews.LottieEffectFullscreenView;
import com.zing.zalo.zlottie.widget.C17291a;
import com.zing.zalo.zlottie.widget.LottieImageView;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import fn0.AbstractC19074t;
import java.util.EnumSet;
import nl0.EnumC23875e;
import nl0.EnumC23879i;
import pm0.AbstractC24866w;

/* renamed from: rv.a */
/* loaded from: classes4.dex */
public final class C25979a {

    /* renamed from: a */
    public static final C25979a f123946a = new C25979a();

    private C25979a() {
    }

    /* renamed from: a */
    public static final void m133810a(LottieImageView lottieImageView, LottieConfig lottieConfig) {
        AbstractC19074t.m100208f(lottieImageView, "imageView");
        AbstractC19074t.m100208f(lottieConfig, "config");
        if (lottieConfig.m48098a() <= -1) {
            lottieImageView.setAutoRepeatMode(C17291a.g.INFINITE);
        } else if (lottieConfig.m48098a() != 0 && lottieConfig.m48098a() != 1) {
            lottieImageView.setAutoRepeatMode(C17291a.g.LIMIT);
            lottieImageView.setMaxRepeatCount(lottieConfig.m48098a());
        } else {
            lottieImageView.setAutoRepeatMode(C17291a.g.DISABLE);
        }
        lottieImageView.m92149D(lottieConfig.m48104g(), lottieConfig.m48105h());
        lottieImageView.setLottieScale(lottieConfig.m48100c());
        C25979a c25979a = f123946a;
        lottieImageView.setLottieScaleType(c25979a.m133817h(lottieConfig.m48101d()));
        lottieImageView.m92156x(c25979a.m133816g(lottieConfig.m48102e()), c25979a.m133816g(lottieConfig.m48099b()));
    }

    /* renamed from: b */
    public static final int m133811b(int i11) {
        if (i11 < -1) {
            return -1;
        }
        return i11;
    }

    /* renamed from: c */
    public static final float m133812c(float f11) {
        if (f11 <= 0.0f || f11 > 1.0f) {
            return 1.0f;
        }
        return f11;
    }

    /* renamed from: d */
    public static final int m133813d(LottieConfig lottieConfig) {
        int i11;
        if (lottieConfig != null) {
            i11 = lottieConfig.m48103f();
        } else {
            i11 = 1;
        }
        if (i11 <= -1) {
            return Integer.MAX_VALUE;
        }
        if (i11 == 0 || i11 == 1) {
            return 1;
        }
        return i11;
    }

    /* renamed from: e */
    public static final boolean m133814e(ZaloView zaloView, int i11, KeyEvent keyEvent) {
        C17487o0 c17487o0;
        ZaloView m92996E0;
        if (zaloView != null) {
            c17487o0 = zaloView.m92662fJ();
        } else {
            c17487o0 = null;
        }
        if (c17487o0 == null || (m92996E0 = zaloView.m92649TI().m92996E0("LottieEffectFullscreenView")) == null || m92996E0.mo60294yp() || i11 != 4) {
            return false;
        }
        return m92996E0.onKeyUp(i11, keyEvent);
    }

    /* renamed from: f */
    public static final void m133815f(ZaloView zaloView, String str, String str2, LottieConfig lottieConfig) {
        AbstractC19074t.m100208f(zaloView, "zaloView");
        AbstractC19074t.m100208f(str, "effectId");
        AbstractC19074t.m100208f(str2, "effectPath");
        AbstractC19074t.m100208f(lottieConfig, "lottieConfig");
        ZaloView m93012K0 = zaloView.m92692wK().mo35579p().m93012K0();
        if (m93012K0 != null) {
            View m92656bJ = m93012K0.m92656bJ();
            if (m92656bJ != null) {
                m92656bJ.setId(AbstractC6918a0.root_to_start_lottie_fullscreen);
            }
            m93012K0.m92649TI().mo57057c2(AbstractC6918a0.root_to_start_lottie_fullscreen, LottieEffectFullscreenView.class, AbstractC1438d.m7341b(AbstractC24866w.m129235a("extra_effect_id", str), AbstractC24866w.m129235a("extra_effect_path", str2), AbstractC24866w.m129235a("extra_config", lottieConfig)), 0, "LottieEffectFullscreenView", 0, true);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0008. Please report as an issue. */
    /* renamed from: g */
    private final EnumSet m133816g(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1568783182:
                    if (str.equals("right_top")) {
                        EnumSet of2 = EnumSet.of(EnumC23875e.TOP, EnumC23875e.RIGHT);
                        AbstractC19074t.m100207e(of2, "of(...)");
                        return of2;
                    }
                    break;
                case -1514196637:
                    if (str.equals("left_bottom")) {
                        EnumSet of3 = EnumSet.of(EnumC23875e.LEFT, EnumC23875e.BOTTOM);
                        AbstractC19074t.m100207e(of3, "of(...)");
                        return of3;
                    }
                    break;
                case -1494981747:
                    if (str.equals("left_center")) {
                        EnumSet of4 = EnumSet.of(EnumC23875e.LEFT, EnumC23875e.CENTER_VERTICAL);
                        AbstractC19074t.m100207e(of4, "of(...)");
                        return of4;
                    }
                    break;
                case 26292565:
                    if (str.equals("center_bottom")) {
                        EnumSet of5 = EnumSet.of(EnumC23875e.BOTTOM, EnumC23875e.CENTER_HORIZONTAL);
                        AbstractC19074t.m100207e(of5, "of(...)");
                        return of5;
                    }
                    break;
                case 45507455:
                    if (str.equals("center_center")) {
                        EnumSet of6 = EnumSet.of(EnumC23875e.CENTER_VERTICAL, EnumC23875e.CENTER_HORIZONTAL);
                        AbstractC19074t.m100207e(of6, "of(...)");
                        return of6;
                    }
                    break;
                case 1162316395:
                    if (str.equals("center_top")) {
                        EnumSet of7 = EnumSet.of(EnumC23875e.TOP, EnumC23875e.CENTER_HORIZONTAL);
                        AbstractC19074t.m100207e(of7, "of(...)");
                        return of7;
                    }
                    break;
                case 1699249582:
                    if (str.equals("right_bottom")) {
                        EnumSet of8 = EnumSet.of(EnumC23875e.RIGHT, EnumC23875e.BOTTOM);
                        AbstractC19074t.m100207e(of8, "of(...)");
                        return of8;
                    }
                    break;
                case 1718464472:
                    if (str.equals("right_center")) {
                        EnumSet of9 = EnumSet.of(EnumC23875e.RIGHT, EnumC23875e.CENTER_VERTICAL);
                        AbstractC19074t.m100207e(of9, "of(...)");
                        return of9;
                    }
                    break;
                case 1718760733:
                    if (str.equals("left_top")) {
                        EnumSet of10 = EnumSet.of(EnumC23875e.LEFT, EnumC23875e.TOP);
                        AbstractC19074t.m100207e(of10, "of(...)");
                        return of10;
                    }
                    break;
            }
        }
        EnumSet of11 = EnumSet.of(EnumC23875e.CENTER_VERTICAL, EnumC23875e.CENTER_HORIZONTAL);
        AbstractC19074t.m100207e(of11, "of(...)");
        return of11;
    }

    /* renamed from: h */
    private final EnumC23879i m133817h(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -414963003:
                    if (str.equals("freestyle")) {
                        return EnumC23879i.SCALE_TYPE_FREE;
                    }
                    break;
                case 278928466:
                    if (str.equals("fixed_height")) {
                        return EnumC23879i.SCALE_TYPE_FIXED_HEIGHT;
                    }
                    break;
                case 592268183:
                    if (str.equals("fixed_screen")) {
                        return EnumC23879i.SCALE_TYPE_FIXED_VIEW;
                    }
                    break;
                case 1408438587:
                    if (str.equals("fixed_width")) {
                        return EnumC23879i.SCALE_TYPE_FIXED_WIDTH;
                    }
                    break;
            }
        }
        return EnumC23879i.SCALE_TYPE_FIXED_VIEW;
    }
}
