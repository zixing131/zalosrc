package is;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import bi0.AbstractC2814h;
import bo.AbstractC2959d;
import bo.C2954c;
import bo.C3000l0;
import bo.C3003l3;
import bo.C3013n3;
import bo.C3020p0;
import bo.C3025q0;
import bo.C3039t0;
import bo.C3047v0;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC7307b0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.feed.components.FeedItemBaseModuleView;
import com.zing.zalo.feed.components.FeedItemSocialAlbumHeader;
import com.zing.zalo.p077ui.widget.C13778s1;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p304ks.AbstractC21935u;
import p304ks.C21912a;
import p348mi.C23307g;
import p588vw.C28652r;
import p716zh.C31845ac;
import p716zh.C31890dc;
import ti0.C26703b;
import ti0.C26705d;
import ti0.C26708g;
import tj.C26712d;
import vg.C28227x3;

/* renamed from: is.n */
/* loaded from: classes4.dex */
public abstract class AbstractC20809n {
    /* renamed from: A */
    public static int m108558A(int i11) {
        int m118742r = AbstractC23136l9.m118742r(110.0f);
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2 && i11 != 3) {
                    if (i11 != 4) {
                        if (i11 == 6) {
                            return AbstractC23136l9.m118655I(AbstractC16802y.sticker_size_feed_chat);
                        }
                        return m118742r;
                    }
                    return AbstractC23136l9.m118655I(AbstractC16802y.sticker_size_feed_detail);
                }
                return AbstractC20814p0.m108611J();
            }
            return AbstractC23136l9.m118655I(AbstractC16802y.sticker_size_timeline_group);
        }
        return AbstractC23136l9.m118655I(AbstractC16802y.sticker_size_timeline);
    }

    /* renamed from: B */
    public static SpannableString m108559B(String str, String str2, boolean z11, boolean z12, boolean z13) {
        String str3;
        if (z13) {
            str3 = str2;
        } else {
            str3 = " " + str2;
        }
        int length = str.length();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        if (z11) {
            str3 = "..." + str2;
        }
        sb2.append(str3);
        SpannableString spannableString = new SpannableString(sb2.toString());
        if (z12) {
            spannableString.setSpan(new StyleSpan(1), 0, length, 33);
        }
        return spannableString;
    }

    /* renamed from: C */
    public static int m108560C(String str, int i11, int i12, int i13) {
        if (!TextUtils.isEmpty(str)) {
            try {
                RobotoTextView robotoTextView = new RobotoTextView(MainApplication.getAppContext());
                robotoTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                robotoTextView.setTextSize(1, i11);
                robotoTextView.setMaxLines(i12);
                robotoTextView.setText(str);
                robotoTextView.measure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                return robotoTextView.getLineCount();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
        return 0;
    }

    /* renamed from: D */
    public static int m108561D(C3000l0 c3000l0) {
        if (c3000l0 == null) {
            return 0;
        }
        int size = c3000l0.f11899s.size();
        if (size > 2 && !c3000l0.f11911y) {
            return Math.min(2, size);
        }
        return size;
    }

    /* renamed from: E */
    public static SpannableString m108562E(String str, String str2, int i11, boolean z11, int i12, int i13) {
        return m108563F(str, str2, i11, z11, i12, i13, true);
    }

    /* renamed from: F */
    public static SpannableString m108563F(String str, String str2, int i11, boolean z11, int i12, int i13, boolean z12) {
        RobotoTextView robotoTextView = new RobotoTextView(MainApplication.getAppContext());
        robotoTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        robotoTextView.mo75850g(!z12);
        robotoTextView.setTextSize(1, i13);
        robotoTextView.setMaxLines(i12);
        SpannableString m108585s = m108585s(str, str2, false, z11);
        robotoTextView.setText(m108585s);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        robotoTextView.measure(makeMeasureSpec, makeMeasureSpec2);
        while (robotoTextView.getLineCount() > i12 && str2.length() > 1) {
            str2 = TextUtils.substring(str2, 0, str2.length() - 1);
            m108585s = m108585s(str, str2, true, z11);
            robotoTextView.setText(m108585s);
            robotoTextView.measure(makeMeasureSpec, makeMeasureSpec2);
        }
        return m108585s;
    }

    /* renamed from: G */
    public static SpannableString m108564G(String str, String str2, String str3, int i11, boolean z11, boolean z12, int i12, int i13) {
        return m108565H(str, str2, str3, i11, z11, z12, i12, i13, true);
    }

    /* renamed from: H */
    public static SpannableString m108565H(String str, String str2, String str3, int i11, boolean z11, boolean z12, int i12, int i13, boolean z13) {
        RobotoTextView robotoTextView = new RobotoTextView(MainApplication.getAppContext());
        robotoTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        robotoTextView.mo75850g(!z13);
        robotoTextView.setTextSize(1, i13);
        robotoTextView.setMaxLines(i12);
        SpannableString m108590x = m108590x(str, str2, str3, false, z11, z12);
        robotoTextView.setText(m108590x);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        robotoTextView.measure(makeMeasureSpec, makeMeasureSpec2);
        SpannableString spannableString = m108590x;
        String str4 = str2;
        while (robotoTextView.getLineCount() > i12 && str4.length() > 1) {
            str4 = TextUtils.substring(str4, 0, str4.length() - 1);
            spannableString = m108590x(str, str4, str3, true, z11, z12);
            robotoTextView.setText(spannableString);
            robotoTextView.measure(makeMeasureSpec, makeMeasureSpec2);
        }
        return spannableString;
    }

    /* renamed from: I */
    public static SpannableString m108566I(String str, String str2, int i11, boolean z11, boolean z12, int i12, int i13) {
        RobotoTextView robotoTextView = new RobotoTextView(MainApplication.getAppContext());
        robotoTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        robotoTextView.setTextSize(1, i13);
        robotoTextView.setMaxLines(i12);
        SpannableString m108559B = m108559B(str, str2, false, z11, z12);
        robotoTextView.setText(m108559B);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        robotoTextView.measure(makeMeasureSpec, makeMeasureSpec2);
        while (robotoTextView.getLineCount() > i12 && str.length() > 1) {
            str = TextUtils.substring(str, 0, str.length() - 1);
            m108559B = m108559B(str, str2, true, z11, z12);
            robotoTextView.setText(m108559B);
            robotoTextView.measure(makeMeasureSpec, makeMeasureSpec2);
        }
        return m108559B;
    }

    /* renamed from: a */
    public static int m108567a(C3020p0 c3020p0, int i11, float f11, float f12, float f13) {
        int i12;
        if (c3020p0 != null) {
            try {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.round((f11 - (f12 * 2.0f)) - (f13 * 2.0f)), Integer.MIN_VALUE);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                RobotoTextView robotoTextView = new RobotoTextView(MainApplication.getAppContext());
                robotoTextView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                robotoTextView.setTextSize(0, AbstractC23136l9.m118655I(AbstractC16802y.f85297f4));
                if (c3020p0.f12058q == 6) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.round(((f11 - f12) - m108558A(1)) - (FeedItemBaseModuleView.f44318d0 * 2)), Integer.MIN_VALUE);
                }
                int i13 = c3020p0.f12037Q;
                robotoTextView.setMaxLines(i13);
                if (!TextUtils.isEmpty(c3020p0.m14528u())) {
                    CharSequence m14528u = c3020p0.m14528u();
                    if (i11 == 2) {
                        CharSequence m108587u = m108587u(c3020p0, m14528u, i13, makeMeasureSpec, makeMeasureSpec2, 0);
                        if (!TextUtils.isEmpty(m108587u)) {
                            c3020p0.f12023C.f12112c = m108587u;
                        }
                    }
                }
                CharSequence m14528u2 = c3020p0.m14528u();
                if (TextUtils.isEmpty(m14528u2)) {
                    return 0;
                }
                C31890dc m153036O = C31845ac.m152996J().m153036O(String.valueOf(c3020p0.f12023C.f12096E));
                C3013n3 c3013n3 = c3020p0.f12023C.f12097F;
                if (m153036O != null && m153036O.m153250u() && m153036O.m153248s()) {
                    C31890dc m153044X = C31845ac.m152996J().m153044X();
                    C31845ac.m152996J().m153074y0(robotoTextView, m153044X, false);
                    if (m153044X.m153249t()) {
                        i12 = C31890dc.f146485E;
                    } else {
                        i12 = m153044X.f146497c;
                    }
                    robotoTextView.setText(C28652r.m143349v().m143356G(new SpannableStringBuilder(m14528u2), AbstractC23136l9.m118742r(i12)));
                    robotoTextView.measure(makeMeasureSpec, makeMeasureSpec2);
                    return robotoTextView.getMeasuredHeight();
                }
                if (c3013n3 != null) {
                    return (int) f11;
                }
                robotoTextView.setText(m14528u2);
                robotoTextView.measure(makeMeasureSpec, makeMeasureSpec2);
                return robotoTextView.getMeasuredHeight();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
        return 0;
    }

    /* renamed from: b */
    public static float m108568b(C3020p0 c3020p0) {
        boolean z11;
        float f11;
        if (c3020p0 == null) {
            return 0.0f;
        }
        float m118742r = AbstractC23136l9.m118742r(56.0f);
        float m118742r2 = AbstractC23136l9.m118742r(12.0f);
        int i11 = 1;
        if (c3020p0.f12022B != null && C21912a.m114159g().m114169j(c3020p0.f12022B.f12280b)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c3020p0.m14489T()) {
            int i12 = 2;
            if (c3020p0.f12021A.m129384d() && c3020p0.f12021A.m129382b()) {
                if (!z11) {
                    i12 = 3;
                }
                f11 = i12;
            } else if (c3020p0.f12021A.m129384d() && !c3020p0.f12021A.m129382b()) {
                if (!z11) {
                    i11 = 2;
                }
                f11 = i11;
            } else {
                if (!c3020p0.f12021A.m129384d() && c3020p0.f12021A.m129382b()) {
                    f11 = 2.0f;
                }
                return m118742r + m118742r2;
            }
        } else {
            f11 = 3.0f;
        }
        m118742r *= f11;
        return m118742r + m118742r2;
    }

    /* renamed from: c */
    public static float m108569c(float f11) {
        return m108588v() + f11;
    }

    /* renamed from: d */
    public static float m108570d(float f11, C3020p0 c3020p0) {
        int i11;
        if (c3020p0 != null) {
            try {
                if (c3020p0.m14475F(true)) {
                    if (c3020p0.m14487R()) {
                        c3020p0.m14523p0();
                    }
                    return ((int) (c3020p0.m14524q() * (((f11 - c3020p0.m14520o()) * 1.0f) / 320.0f))) + c3020p0.m14522p();
                }
                C3025q0 c3025q0 = c3020p0.f12023C;
                float f12 = c3025q0.f12121l;
                float f13 = c3025q0.f12120k;
                if (!C23278z2.m120139l1()) {
                    f12 = 0.0f;
                }
                ArrayList arrayList = c3020p0.f12023C.f12122m;
                if (arrayList != null) {
                    i11 = arrayList.size();
                } else {
                    i11 = 0;
                }
                if (f12 == 0.0f || i11 != c3020p0.f12023C.f12118i.size()) {
                    int size = c3020p0.f12023C.f12118i.size();
                    if (AbstractC20826v0.m108824n0(1)) {
                        size = Math.min(size, 9);
                    }
                    Pair m108589w = m108589w(size);
                    f12 = ((Integer) m108589w.first).intValue();
                    f13 = ((Integer) m108589w.second).intValue();
                }
                return Math.round(f11 * ((f13 * 1.0f) / f12));
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
        return 0.0f;
    }

    /* renamed from: e */
    public static float m108571e(float f11, float f12) {
        if (!C23278z2.m120139l1()) {
            return AbstractC23136l9.m118655I(AbstractC16802y.feed_single_photo_size_small) + f12;
        }
        return f11;
    }

    /* renamed from: f */
    public static float m108572f(float f11, C3020p0 c3020p0) {
        C3025q0 c3025q0;
        ArrayList arrayList;
        int round;
        AbstractC2959d abstractC2959d;
        int i11;
        int i12;
        C28227x3 c28227x3 = null;
        if (c3020p0 != null) {
            c3025q0 = c3020p0.f12023C;
        } else {
            c3025q0 = null;
        }
        if (c3025q0 != null) {
            arrayList = c3025q0.f12107P;
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            return 0.0f;
        }
        float f12 = 1.0f;
        int i13 = 0;
        if (arrayList.size() == 1 && arrayList.get(0) != null && ((C2954c) arrayList.get(0)).m13988c() == 1) {
            float m118655I = (f11 - (AbstractC23136l9.m118655I(AbstractC16802y.feed_social_album_margin_lr) * 2)) - (AbstractC23136l9.m118655I(AbstractC16802y.feed_social_album_content_margin) * 2);
            C2954c c2954c = (C2954c) arrayList.get(0);
            if (c2954c != null) {
                abstractC2959d = c2954c.m13986a();
            } else {
                abstractC2959d = null;
            }
            if (abstractC2959d != null) {
                c28227x3 = abstractC2959d.m14010a();
            }
            if (c28227x3 != null && (i11 = c28227x3.f131648a) > 0 && (i12 = c28227x3.f131649b) > 0) {
                f12 = m108592z(i11, i12);
            }
            return m118655I / f12;
        }
        float m118655I2 = (f11 - (AbstractC23136l9.m118655I(AbstractC16802y.feed_social_album_margin_lr) * 2)) - (AbstractC23136l9.m118655I(AbstractC16802y.feed_social_album_content_margin) * 2);
        if (c3020p0.m14473E()) {
            if (c3020p0.m14487R()) {
                c3020p0.m14521o0();
            }
            round = (int) (c3020p0.m14519n() * ((m118655I2 * 1.0f) / 320.0f));
        } else {
            C3025q0 c3025q02 = c3020p0.f12023C;
            float f13 = c3025q02.f12121l;
            float f14 = c3025q02.f12120k;
            if (!C23278z2.m120139l1()) {
                f13 = 0.0f;
            }
            ArrayList arrayList2 = c3020p0.f12023C.f12122m;
            if (arrayList2 != null) {
                i13 = arrayList2.size();
            }
            if (f13 == 0.0f || i13 != c3020p0.f12023C.f12107P.size()) {
                int size = c3020p0.f12023C.f12107P.size();
                if (AbstractC20826v0.m108824n0(1)) {
                    size = Math.min(size, 9);
                }
                Pair m108589w = m108589w(size);
                f13 = ((Integer) m108589w.first).intValue();
                f14 = ((Integer) m108589w.second).intValue();
            }
            round = Math.round(m118655I2 * ((f14 * 1.0f) / f13));
        }
        return round;
    }

    /* renamed from: g */
    public static float m108573g(float f11) {
        float f12;
        try {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.round(f11 - (AbstractC23136l9.m118655I(AbstractC16802y.feed_social_album_margin_lr) * 2)), Integer.MIN_VALUE);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            FeedItemSocialAlbumHeader feedItemSocialAlbumHeader = new FeedItemSocialAlbumHeader(MainApplication.getAppContext(), null);
            feedItemSocialAlbumHeader.m44026c0(MainApplication.getAppContext());
            feedItemSocialAlbumHeader.measure(makeMeasureSpec, makeMeasureSpec2);
            return feedItemSocialAlbumHeader.getMeasuredHeight();
        } catch (Exception e11) {
            e11.printStackTrace();
            if (C13778s1.m76962c() <= 1.0f) {
                f12 = 58.0f;
            } else {
                f12 = 76.0f;
            }
            return AbstractC23136l9.m118742r(f12);
        }
    }

    /* renamed from: h */
    public static float m108574h(float f11, C3020p0 c3020p0) {
        return m108573g(f11) + m108572f(f11, c3020p0);
    }

    /* renamed from: i */
    public static float m108575i() {
        return m108558A(1);
    }

    /* renamed from: j */
    public static float m108576j(C3020p0 c3020p0, float f11) {
        int i11;
        int i12;
        float f12;
        float f13;
        if (c3020p0 != null) {
            try {
                float m118742r = AbstractC23136l9.m118742r(28.0f);
                int m118742r2 = AbstractC23136l9.m118742r(16.0f);
                int m118742r3 = AbstractC23136l9.m118742r(16.0f);
                if (!c3020p0.m14479H()) {
                    return 0.0f;
                }
                C26712d m14617b = c3020p0.f12024D.m14617b();
                int m118742r4 = AbstractC23136l9.m118742r(5.0f);
                RobotoTextView robotoTextView = new RobotoTextView(MainApplication.getAppContext());
                robotoTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                robotoTextView.setMinWidth(AbstractC23136l9.m118742r(70));
                robotoTextView.setTextSize(1, 11.0f);
                robotoTextView.setPadding(m118742r4, m118742r4, m118742r4, m118742r4);
                robotoTextView.setGravity(17);
                int m118742r5 = AbstractC23136l9.m118742r(26.0f);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(m118742r5, 1073741824);
                RobotoTextView robotoTextView2 = new RobotoTextView(MainApplication.getAppContext());
                robotoTextView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                robotoTextView2.setMaxLines(2);
                robotoTextView2.setTextSize(1, 11.0f);
                if (!TextUtils.isEmpty(m14617b.m137335c())) {
                    robotoTextView.setText(m14617b.m137335c());
                    robotoTextView.measure(makeMeasureSpec, makeMeasureSpec2);
                    i11 = robotoTextView.getMeasuredWidth();
                    i12 = robotoTextView.getMeasuredHeight();
                } else {
                    i11 = 0;
                    i12 = 0;
                }
                int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec((int) (((f11 - (m118742r2 * 2)) - (m118742r3 * 2)) - i11), Integer.MIN_VALUE);
                int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(0, 0);
                if (!TextUtils.isEmpty(m14617b.m137336d())) {
                    robotoTextView2.setText(m14617b.m137336d());
                    robotoTextView2.measure(makeMeasureSpec3, makeMeasureSpec4);
                    f12 = robotoTextView2.getMeasuredHeight() + 0.0f;
                } else {
                    f12 = 0.0f;
                }
                if (!TextUtils.isEmpty(m14617b.m137343k())) {
                    f13 = AbstractC23136l9.m118742r(15.0f);
                } else {
                    f13 = 0.0f;
                }
                float max = Math.max(f12 + f13, Math.max(m118742r, i12));
                float f14 = m118742r3;
                return max + f14 + f14;
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
        return 0.0f;
    }

    /* renamed from: k */
    public static float m108577k(C3020p0 c3020p0) {
        boolean z11;
        boolean z12;
        C3039t0 c3039t0 = c3020p0.f12025E;
        boolean z13 = false;
        if (c3039t0 != null && c3039t0.f12244b > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c3039t0 != null && c3039t0.f12243a > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c3020p0.f12064w || z11 || z12) {
            z13 = true;
        }
        return m108578l(z13);
    }

    /* renamed from: l */
    public static float m108578l(boolean z11) {
        if (!z11) {
            return AbstractC23136l9.m118655I(AbstractC16802y.feed_footer_bar_content_height);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        C26703b m137293a = C26705d.m137293a(MainApplication.getAppContext(), AbstractC2814h.t_xsmall_m);
        RobotoTextView robotoTextView = new RobotoTextView(MainApplication.getAppContext());
        robotoTextView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_reaction_only_you));
        new C26708g(robotoTextView).m137319a(m137293a);
        robotoTextView.measure(makeMeasureSpec, makeMeasureSpec2);
        return AbstractC23136l9.m118655I(AbstractC16802y.feed_footer_bar_content_height) + Math.max(robotoTextView.getMeasuredHeight(), AbstractC23222t7.f112522F) + AbstractC23222t7.f112576o;
    }

    /* renamed from: m */
    public static float m108579m(C3020p0 c3020p0) {
        float m118655I = AbstractC23136l9.m118655I(AbstractC16802y.avt_M);
        float m118655I2 = AbstractC23136l9.m118655I(AbstractC16802y.feed_content_padding);
        float m118742r = AbstractC23136l9.m118742r(4.0f);
        if (c3020p0 != null) {
            try {
                C3047v0 c3047v0 = c3020p0.f12022B;
                if (c3047v0 != null) {
                    AbstractC21935u.m114542i(c3047v0.f12280b, c3047v0.f12282d);
                    if (!TextUtils.isEmpty(c3020p0.f12022B.f12291m)) {
                        m118742r += AbstractC23136l9.m118655I(AbstractC16802y.feed_content_padding);
                    }
                    m118742r += AbstractC23136l9.m118742r(6.0f);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
        return m118655I + (m118655I2 * 2.0f) + m118742r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x016f, code lost:            if (r9 > 0) goto L232;     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00cf, code lost:            if (r9 > 0) goto L188;     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0120, code lost:            if (r15 > 2.3333333f) goto L209;     */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0133 A[Catch: Exception -> 0x009d, TryCatch #0 {Exception -> 0x009d, blocks: (B:22:0x0076, B:24:0x007d, B:27:0x0086, B:29:0x0096, B:31:0x0187, B:34:0x00a1, B:55:0x00cb, B:57:0x00d1, B:58:0x00d4, B:59:0x00d5, B:60:0x00d9, B:62:0x00df, B:63:0x00e2, B:64:0x00ed, B:67:0x00f4, B:69:0x0104, B:71:0x0108, B:74:0x010e, B:78:0x0122, B:79:0x0123, B:81:0x0133, B:82:0x013d, B:83:0x0142, B:87:0x012c, B:88:0x014b, B:90:0x0152, B:91:0x0156, B:92:0x0157, B:93:0x015a, B:95:0x0161, B:97:0x0166, B:98:0x0168, B:99:0x016a, B:101:0x0171, B:102:0x0174, B:105:0x017c, B:110:0x018d, B:112:0x019e), top: B:21:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0142 A[Catch: Exception -> 0x009d, TryCatch #0 {Exception -> 0x009d, blocks: (B:22:0x0076, B:24:0x007d, B:27:0x0086, B:29:0x0096, B:31:0x0187, B:34:0x00a1, B:55:0x00cb, B:57:0x00d1, B:58:0x00d4, B:59:0x00d5, B:60:0x00d9, B:62:0x00df, B:63:0x00e2, B:64:0x00ed, B:67:0x00f4, B:69:0x0104, B:71:0x0108, B:74:0x010e, B:78:0x0122, B:79:0x0123, B:81:0x0133, B:82:0x013d, B:83:0x0142, B:87:0x012c, B:88:0x014b, B:90:0x0152, B:91:0x0156, B:92:0x0157, B:93:0x015a, B:95:0x0161, B:97:0x0166, B:98:0x0168, B:99:0x016a, B:101:0x0171, B:102:0x0174, B:105:0x017c, B:110:0x018d, B:112:0x019e), top: B:21:0x0076 }] */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static float m108580n(C3000l0 c3000l0) {
        float f11;
        float f12;
        float m108571e;
        float f13;
        float m108575i;
        float f14;
        int i11;
        float f15;
        int m118742r;
        int i12;
        int i13;
        float f16;
        int m108534b;
        float f17;
        if (c3000l0 != null) {
            try {
                if (c3000l0.f11899s != null) {
                    float m108536d = C20801j.m108536d(c3000l0);
                    float m118655I = AbstractC23136l9.m118655I(AbstractC16802y.feed_content_padding);
                    float m118742r2 = AbstractC23136l9.m118742r(5.0f);
                    int i14 = 0;
                    int i15 = 0;
                    int i16 = 0;
                    float f18 = 0.0f;
                    int i17 = 0;
                    for (C3020p0 c3020p0 : c3000l0.f11899s) {
                        int m108567a = m108567a(c3020p0, c3000l0.f11893p, m108536d, m118655I, m118742r2);
                        int m108582p = m108582p(c3020p0, c3000l0.f11893p, m108536d, m118655I, m118742r2);
                        i14 = Math.max(i14, m108567a);
                        i15 = Math.max(i15, m108582p);
                        i16 = Math.max(i16, i14 + i15);
                        Pair m108581o = m108581o(c3020p0, m108536d, m118655I, m118742r2);
                        if (m108581o != null) {
                            f18 = Math.max(f18, ((Float) m108581o.first).floatValue());
                            i17 = Math.max(i17, ((Integer) m108581o.second).intValue());
                        }
                    }
                    float f19 = 0.0f;
                    for (C3020p0 c3020p02 : c3000l0.f11899s) {
                        try {
                            if (c3020p02 != null) {
                                float m108579m = m108579m(c3020p02);
                                float m108577k = m108577k(c3020p02);
                                int i18 = AbstractC23222t7.f112576o;
                                if (c3020p02.m14489T()) {
                                    f12 = m108568b(c3020p02);
                                } else {
                                    int i19 = c3020p02.f12058q;
                                    if (i19 != 1) {
                                        if (i19 != 2) {
                                            if (i19 != 3) {
                                                if (i19 != 6) {
                                                    if (i19 != 7) {
                                                        if (i19 != 17) {
                                                            if (i19 != 21) {
                                                                if (i19 != 100) {
                                                                    if (i19 != 23) {
                                                                        if (i19 != 24) {
                                                                            f12 = 0.0f;
                                                                        } else {
                                                                            m108534b = (int) (((int) m108536d) / 0.75f);
                                                                        }
                                                                    } else {
                                                                        f17 = m108574h(m108536d, c3020p02);
                                                                        if (i16 > 0) {
                                                                            m108579m += i16;
                                                                        }
                                                                    }
                                                                } else {
                                                                    f12 = Math.round(m108536d / 1.92f);
                                                                }
                                                            } else {
                                                                m108534b = C20801j.m108534b();
                                                                if (i16 > 0) {
                                                                    m108579m = m108579m + i16 + m118655I;
                                                                }
                                                                f17 = m108534b;
                                                            }
                                                            f12 = m108579m + f17 + m108577k;
                                                        } else {
                                                            int m118742r3 = (int) (m108536d - AbstractC23136l9.m118742r(24.0f));
                                                            C23307g c23307g = c3020p02.f12023C.f12119j;
                                                            if (c23307g != null && (i12 = c23307g.f113474a) > 0 && (i13 = c23307g.f113475b) > 0 && m118742r3 > 0) {
                                                                float f21 = i12 / (i13 * 1.0f);
                                                                float f22 = m118742r3;
                                                                i11 = (int) (f22 / f21);
                                                                if (i12 >= i13) {
                                                                    f16 = 2.3333333f;
                                                                }
                                                                f16 = 0.75f;
                                                                if (f21 <= 0.75f) {
                                                                    f14 = f22 / f16;
                                                                }
                                                                if (i16 <= 0) {
                                                                    f15 = m108579m + i16 + i11;
                                                                    m118742r = AbstractC23136l9.m118742r(64.0f);
                                                                } else {
                                                                    f15 = m108579m + i11;
                                                                    m118742r = AbstractC23136l9.m118742r(48.0f);
                                                                }
                                                                f12 = f15 + m118742r;
                                                            } else {
                                                                f14 = m108536d / 0.75f;
                                                            }
                                                            i11 = (int) f14;
                                                            if (i16 <= 0) {
                                                            }
                                                            f12 = f15 + m118742r;
                                                        }
                                                    } else {
                                                        m108575i = m108569c(0.0f);
                                                        if (i16 > 0) {
                                                            m108579m = m108579m + i16 + i18;
                                                        }
                                                    }
                                                } else {
                                                    m108575i = m108575i();
                                                    if (i16 > 0) {
                                                        float f23 = i16;
                                                        if (f23 > m108575i) {
                                                            m108579m += f23;
                                                            m108571e = i18;
                                                        }
                                                    }
                                                }
                                                f13 = m108579m + m108575i;
                                                f12 = f13 + m108577k;
                                            } else {
                                                m108571e = m108570d(m108536d, c3020p02);
                                            }
                                            f13 = m108579m + m108571e;
                                            f12 = f13 + m108577k;
                                        } else {
                                            m108571e = m108571e(m108536d, m118655I);
                                            if (i16 > 0) {
                                                m108579m += i16;
                                            }
                                            f13 = m108579m + m108571e;
                                            f12 = f13 + m108577k;
                                        }
                                    } else {
                                        f12 = (((m108579m + i16) + i18) + m108577k) - AbstractC23222t7.f112576o;
                                    }
                                    f19 = Math.max(f12, f19);
                                }
                                f19 = Math.max(f12, f19);
                            }
                        } catch (Exception e11) {
                            e = e11;
                            f11 = f19;
                        }
                    }
                    c3000l0.f11861J = i16;
                    c3000l0.f11863L = i14;
                    c3000l0.f11864M = i15;
                    c3000l0.f11862K = 0;
                    c3000l0.f11865N = 0;
                    c3000l0.f11860I = i17;
                    if (c3000l0.f11893p == 1) {
                        int m108561D = m108561D(c3000l0);
                        int size = c3000l0.f11899s.size();
                        f11 = f19 - ((m108579m(c3000l0.m14322a0()) + AbstractC23136l9.m118655I(AbstractC16802y.feed_footer_bar_content_height)) + m108576j(c3000l0.m14322a0(), m108536d));
                        for (int i21 = 0; i21 < m108561D; i21++) {
                            try {
                                f11 += AbstractC23136l9.m118742r(140.0f) + m108567a(c3000l0.m14324b0(i21), c3000l0.f11893p, m108536d, m118655I, m118742r2) + m108582p(c3000l0.m14324b0(i21), c3000l0.f11893p, m108536d, m118655I, m118742r2);
                            } catch (Exception e12) {
                                e = e12;
                                AbstractC23350e.m122778h(e);
                                return f11;
                            }
                        }
                        if (m108561D < size) {
                            return f11 + AbstractC23136l9.m118655I(AbstractC16802y.feed_item_vertical_more_item_height);
                        }
                        return f11;
                    }
                    return f19;
                }
            } catch (Exception e13) {
                e = e13;
                f11 = 0.0f;
            }
        }
        return 0.0f;
    }

    /* renamed from: o */
    public static Pair m108581o(C3020p0 c3020p0, float f11, float f12, float f13) {
        float f14;
        if (c3020p0 != null) {
            try {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.round((f11 - (f12 * 2.0f)) - f13), Integer.MIN_VALUE);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                RobotoTextView robotoTextView = new RobotoTextView(MainApplication.getAppContext());
                robotoTextView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                robotoTextView.setTextSize(0, AbstractC23136l9.m118655I(AbstractC16802y.f85297f4));
                robotoTextView.setMaxLines(2);
                C3003l3.c cVar = c3020p0.f12060s;
                if (cVar != null && !TextUtils.isEmpty(cVar.f11958c)) {
                    robotoTextView.setText(c3020p0.f12060s.f11958c);
                    robotoTextView.measure(makeMeasureSpec, makeMeasureSpec2);
                    f14 = robotoTextView.getMeasuredHeight();
                } else {
                    f14 = 0.0f;
                }
                return new Pair(Float.valueOf(f14), Integer.valueOf(robotoTextView.getLineCount()));
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return null;
            }
        }
        return null;
    }

    /* renamed from: p */
    public static int m108582p(C3020p0 c3020p0, int i11, float f11, float f12, float f13) {
        if (c3020p0 != null) {
            try {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.round((f11 - (f12 * 2.0f)) - (f13 * 2.0f)), Integer.MIN_VALUE);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                RobotoTextView robotoTextView = new RobotoTextView(MainApplication.getAppContext());
                robotoTextView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                robotoTextView.setTextSize(0, AbstractC23136l9.m118655I(AbstractC16802y.f85297f4));
                robotoTextView.setMaxLines(1);
                if (c3020p0.f12058q == 6) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.round(((f11 - f12) - m108558A(1)) - (FeedItemBaseModuleView.f44318d0 * 2)), Integer.MIN_VALUE);
                }
                if (!c3020p0.m14482K() && !c3020p0.m14477G()) {
                    return 0;
                }
                CharSequence m108586t = m108586t(c3020p0, 1, makeMeasureSpec, makeMeasureSpec2, 0.0f);
                CharSequence charSequence = "- ";
                if (c3020p0.m14482K()) {
                    charSequence = TextUtils.concat("- ", c3020p0.f12059r.f11958c);
                }
                if (c3020p0.m14477G()) {
                    if (c3020p0.m14482K()) {
                        charSequence = TextUtils.concat(charSequence, " ");
                    }
                    if (!TextUtils.isEmpty(m108586t)) {
                        c3020p0.f12023C.f12111b.m14733l(m108586t);
                        charSequence = TextUtils.concat(charSequence, m108586t);
                    } else {
                        charSequence = TextUtils.concat(charSequence, c3020p0.f12023C.f12111b.m14728g());
                    }
                }
                robotoTextView.setText(charSequence);
                robotoTextView.measure(makeMeasureSpec, makeMeasureSpec2);
                return robotoTextView.getMeasuredHeight();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
        return 0;
    }

    /* renamed from: q */
    public static void m108583q(C3000l0 c3000l0) {
        List list;
        if (c3000l0 != null && (list = c3000l0.f11899s) != null && !list.isEmpty()) {
            Iterator it = c3000l0.f11899s.iterator();
            while (it.hasNext()) {
                m108584r((C3020p0) it.next());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0019, code lost:            if (r0 == 24) goto L44;     */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m108584r(C3020p0 c3020p0) {
        int i11;
        if (c3020p0 != null) {
            int i12 = c3020p0.f12058q;
            int i13 = 1;
            if (i12 != 1) {
                if (i12 != 2 && i12 != 3) {
                    if (i12 != 6) {
                        if (i12 != 7) {
                            if (i12 != 17) {
                            }
                        }
                    }
                } else {
                    i13 = 2;
                }
                i11 = c3020p0.f12037Q;
                if (i11 > 0 || i11 > 5) {
                    c3020p0.f12037Q = i13;
                }
                return;
            }
            i13 = 3;
            i11 = c3020p0.f12037Q;
            if (i11 > 0) {
            }
            c3020p0.f12037Q = i13;
        }
    }

    /* renamed from: s */
    public static SpannableString m108585s(String str, String str2, boolean z11, boolean z12) {
        String str3 = str + " ";
        int length = str3.length();
        int length2 = str2.length();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str3);
        if (z11) {
            str2 = str2 + "...";
        }
        sb2.append(str2);
        SpannableString spannableString = new SpannableString(sb2.toString());
        if (z12) {
            spannableString.setSpan(new StyleSpan(1), length, length2 + length, 33);
        }
        return spannableString;
    }

    /* renamed from: t */
    public static CharSequence m108586t(C3020p0 c3020p0, int i11, int i12, int i13, float f11) {
        CharSequence charSequence;
        CharSequence charSequence2;
        try {
            HashSet hashSet = new HashSet();
            hashSet.add('\n');
            hashSet.add('\t');
            hashSet.add(' ');
            hashSet.add(',');
            if (!c3020p0.m14482K()) {
                charSequence = "- ";
            } else {
                charSequence = TextUtils.concat("- ", c3020p0.f12059r.f11958c);
            }
            if (c3020p0.m14477G()) {
                if (c3020p0.m14482K()) {
                    charSequence = TextUtils.concat(charSequence, " ");
                }
                charSequence = TextUtils.concat(charSequence, c3020p0.f12023C.f12111b.m14728g());
            }
            RobotoTextView robotoTextView = new RobotoTextView(MainApplication.getAppContext());
            robotoTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            robotoTextView.setTextSize(1, 13.0f);
            robotoTextView.setMaxLines(i11);
            robotoTextView.setLineSpacing(f11, 1.0f);
            robotoTextView.setText(charSequence);
            robotoTextView.measure(i12, i13);
            int lineCount = robotoTextView.getLineCount();
            if (lineCount < i11) {
                return null;
            }
            if (lineCount > i11) {
                CharSequence m14728g = c3020p0.f12023C.f12111b.m14728g();
                do {
                    int lastIndexOf = m14728g.toString().lastIndexOf(" ");
                    if (lastIndexOf > 0) {
                        m14728g = m14728g.subSequence(0, lastIndexOf);
                    } else {
                        m14728g = m14728g.subSequence(0, m14728g.length() - 5);
                    }
                    if (hashSet.contains(Character.valueOf(m14728g.charAt(m14728g.length() - 1)))) {
                        m14728g = m14728g.subSequence(0, m14728g.length() - 1);
                    }
                    if (!c3020p0.m14482K()) {
                        charSequence2 = "- ";
                    } else {
                        charSequence2 = TextUtils.concat("- ", c3020p0.f12059r.f11958c);
                    }
                    if (c3020p0.m14477G()) {
                        if (c3020p0.m14482K()) {
                            charSequence2 = TextUtils.concat(charSequence2, " ");
                        }
                        charSequence2 = TextUtils.concat(charSequence2, m14728g);
                    }
                    robotoTextView.setText(TextUtils.concat(charSequence2, "..."));
                    robotoTextView.measure(i12, i13);
                    if (robotoTextView.getLineCount() <= i11) {
                        return TextUtils.concat(m14728g, "...");
                    }
                } while (robotoTextView.getLineCount() > i11);
                return "";
            }
            return "";
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return "";
        }
    }

    /* renamed from: u */
    public static CharSequence m108587u(C3020p0 c3020p0, CharSequence charSequence, int i11, int i12, int i13, float f11) {
        try {
            HashSet hashSet = new HashSet();
            hashSet.add('\n');
            hashSet.add('\t');
            hashSet.add(' ');
            RobotoTextView robotoTextView = new RobotoTextView(MainApplication.getAppContext());
            robotoTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            robotoTextView.setTextSize(1, AbstractC23136l9.m118671Q(AbstractC7307b0.status_text_size_default));
            robotoTextView.setLineSpacing(f11, 1.0f);
            robotoTextView.setMaxLines(i11);
            robotoTextView.setText(charSequence);
            robotoTextView.measure(i12, i13);
            int lineCount = robotoTextView.getLineCount();
            if (lineCount >= i11 && lineCount > i11) {
                int lineStart = robotoTextView.getLayout().getLineStart(0);
                CharSequence subSequence = charSequence.subSequence(lineStart, robotoTextView.getLayout().getLineEnd(i11 - 1));
                if (hashSet.contains(Character.valueOf(subSequence.charAt(subSequence.length() - 1)))) {
                    subSequence = subSequence.subSequence(lineStart, subSequence.length() - 1);
                }
                CharSequence m14499c = c3020p0.m14499c();
                do {
                    robotoTextView.setText(TextUtils.concat(subSequence, m14499c));
                    robotoTextView.measure(i12, i13);
                    if (robotoTextView.getLineCount() <= i11) {
                        c3020p0.m14484N(new SpannableString(subSequence), true);
                        return TextUtils.concat(subSequence, m14499c);
                    }
                    int lastIndexOf = subSequence.toString().lastIndexOf(" ");
                    if (lastIndexOf > 0) {
                        subSequence = subSequence.subSequence(0, lastIndexOf);
                    } else {
                        subSequence = AbstractC20814p0.m108614K0(subSequence, subSequence.length() - 5);
                    }
                } while (robotoTextView.getLineCount() > i11);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        return "";
    }

    /* renamed from: v */
    public static int m108588v() {
        return ((AbstractC23136l9.m118722k0() - AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left)) - AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_right)) / 3;
    }

    /* renamed from: w */
    public static Pair m108589w(int i11) {
        int i12;
        int i13 = 4;
        if (i11 != 1) {
            i12 = 8;
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        i12 = ((int) Math.ceil(i11 / 3)) * 3;
                        i13 = 9;
                    } else {
                        i13 = 8;
                    }
                } else {
                    i13 = 9;
                    i12 = 3;
                }
                return new Pair(Integer.valueOf(i13), Integer.valueOf(i12));
            }
            i13 = 8;
        }
        i12 = 4;
        return new Pair(Integer.valueOf(i13), Integer.valueOf(i12));
    }

    /* renamed from: x */
    public static SpannableString m108590x(String str, String str2, String str3, boolean z11, boolean z12, boolean z13) {
        String str4 = str + " ";
        if (!z13) {
            str3 = " " + str3;
        }
        int length = str4.length();
        int length2 = str2.length();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str4);
        if (z11) {
            str2 = str2 + "...";
        }
        sb2.append(str2);
        sb2.append(str3);
        SpannableString spannableString = new SpannableString(sb2.toString());
        if (z12) {
            spannableString.setSpan(new StyleSpan(1), length, length2 + length, 33);
        }
        return spannableString;
    }

    /* renamed from: y */
    public static int m108591y(int i11) {
        if (i11 == 1) {
            return 1;
        }
        if (i11 != 2) {
            return (i11 == 3 || i11 != 4) ? 3 : 2;
        }
        return 2;
    }

    /* renamed from: z */
    public static float m108592z(int i11, int i12) {
        return 1.0f;
    }
}
