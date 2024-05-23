package s00;

import am.AbstractC0924m0;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.adtima.Adtima;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.settingreminder.SettingReminderZinstantBanner;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import gg0.AbstractC19444a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import p320ld.C22447s;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import p716zh.C31877d;
import sd.C26231b;
import t00.C26446c;
import th.AbstractC26681b;
import th.AbstractC26683d;
import th.AbstractC26684e;
import th.C26680a;
import vg.C28119l3;

/* renamed from: s00.s */
/* loaded from: classes.dex */
public abstract class AbstractC26084s {

    /* renamed from: s00.s$a */
    /* loaded from: classes4.dex */
    public class a extends AbstractC26072g {

        /* renamed from: b */
        final /* synthetic */ WeakReference f124285b;

        a(WeakReference weakReference) {
            this.f124285b = weakReference;
        }

        @Override // s00.AbstractC26072g
        /* renamed from: e */
        public void mo87419e(C26071f c26071f, String str, String str2) {
            ZaloView zaloView;
            super.mo87419e(c26071f, str, str2);
            try {
                WeakReference weakReference = this.f124285b;
                if (weakReference != null && (zaloView = (ZaloView) weakReference.get()) != null && (zaloView instanceof SlidableZaloView) && zaloView.m92674mJ() && !zaloView.m92681pJ()) {
                    ((SlidableZaloView) zaloView).m78959pL(str, str2, 4, new C31877d());
                }
                if (c26071f != null) {
                    AbstractC26084s.m134269q(0, c26071f.f124227b);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("SettingReminderUtils", e11);
            }
        }
    }

    /* renamed from: C */
    public static boolean m134246C(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !TextUtils.isDigitsOnly(str) || !TextUtils.isDigitsOnly(str2) || Long.parseLong(str2) <= Long.parseLong(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: D */
    public static void m134247D(C23744a.c cVar) {
        if (cVar == null) {
            return;
        }
        try {
            C23744a.m124114c().m124117e(cVar, 6000);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SettingReminderUtils", e11);
        }
    }

    /* renamed from: E */
    private static void m134248E(ViewGroup viewGroup, ImageView imageView, C26071f c26071f) {
        FrameLayout.LayoutParams layoutParams;
        if (!(viewGroup instanceof ActionBarMenuItem) || imageView == null || c26071f == null || (layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams()) == null) {
            return;
        }
        int m118742r = AbstractC23136l9.m118742r(5.0f);
        int m118742r2 = AbstractC23136l9.m118742r(5.0f);
        if (c26071f.f124228c == 0) {
            m118742r = AbstractC23136l9.m118742r(11.0f);
            m118742r2 = AbstractC23136l9.m118742r(11.0f);
        }
        layoutParams.topMargin = m118742r;
        layoutParams.rightMargin = m118742r2;
        imageView.setLayoutParams(layoutParams);
    }

    /* renamed from: F */
    public static void m134249F(ZaloView zaloView, int i11, InterfaceC26070e interfaceC26070e) {
        m134250G(zaloView, i11, interfaceC26070e, null, AbstractC6918a0.zinstant_banner);
    }

    /* renamed from: G */
    public static void m134250G(ZaloView zaloView, int i11, InterfaceC26070e interfaceC26070e, AbstractC26072g abstractC26072g, int i12) {
        if (i11 < 0) {
            return;
        }
        if (interfaceC26070e == null) {
            try {
                View m92656bJ = zaloView.m92656bJ();
                if (m92656bJ == null) {
                    return;
                }
                interfaceC26070e = (InterfaceC26070e) m92656bJ.findViewById(i12);
                if (interfaceC26070e == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(">>>>>> This ZaloView don't support Banner template, settingId=");
                    sb2.append(i11);
                    return;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("SettingReminderUtils", e11);
                return;
            }
        }
        C26071f m134222s = C26076k.m134208q().m134222s(i11);
        if (m134222s != null && m134222s.m134176g()) {
            if (!interfaceC26070e.mo50498a(m134222s)) {
                a aVar = new a(new WeakReference(zaloView));
                aVar.m134184f(abstractC26072g);
                int m118722k0 = AbstractC23136l9.m118722k0();
                interfaceC26070e.setSettingReminderListener(aVar);
                interfaceC26070e.mo50499b(m134222s, m118722k0);
                return;
            }
            return;
        }
        interfaceC26070e.mo50500c();
    }

    /* renamed from: H */
    public static C26071f m134251H(ViewGroup viewGroup, int i11) {
        return m134252I(viewGroup, i11, AbstractC6918a0.icon_setting_reminder);
    }

    /* renamed from: I */
    private static C26071f m134252I(ViewGroup viewGroup, int i11, int i12) {
        if (i11 >= 0 && viewGroup != null) {
            try {
                ImageView imageView = (ImageView) viewGroup.findViewById(i12);
                if (imageView == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(">>>>>> viewTarget is null, settingId=");
                    sb2.append(i11);
                    return null;
                }
                C26071f m134221r = C26076k.m134208q().m134221r(i11);
                if (m134221r != null) {
                    if (m134221r.m134171a()) {
                        int m134262j = m134262j(m134221r);
                        if (m134262j == 0) {
                            imageView.setVisibility(8);
                            return null;
                        }
                        imageView.setImageResource(m134262j);
                        m134248E(viewGroup, imageView, m134221r);
                        imageView.setVisibility(0);
                        return m134221r;
                    }
                    imageView.setVisibility(8);
                } else {
                    imageView.setVisibility(8);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("SettingReminderUtils", e11);
            }
        }
        return null;
    }

    /* renamed from: d */
    public static void m134256d(C23744a.c cVar) {
        if (cVar == null) {
            return;
        }
        try {
            C23744a.m124114c().m124115b(cVar, 6000);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SettingReminderUtils", e11);
        }
    }

    /* renamed from: e */
    public static void m134257e(int i11, String str, boolean z11) {
        try {
            Object m134264l = m134264l(str);
            if (m134264l instanceof Integer) {
                m134270r(i11, ((Integer) m134264l).intValue(), z11);
            } else if (m134264l instanceof ArrayList) {
                m134268p(i11, (ArrayList) m134264l, z11);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SettingReminderUtils", e11);
        }
    }

    /* renamed from: f */
    public static void m134258f(int i11, InterfaceC26066a interfaceC26066a, int i12) {
        try {
            int mo57170bb = interfaceC26066a.mo57170bb(i12);
            if (mo57170bb != 1000) {
                m134269q(i11, mo57170bb);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: g */
    public static void m134259g(int i11, ArrayList arrayList, boolean z11) {
        if (arrayList != null && arrayList.size() != 0) {
            try {
                int size = arrayList.size();
                boolean z12 = false;
                for (int i12 = 0; i12 < size; i12++) {
                    z12 |= m134260h(i11, ((Integer) arrayList.get(i12)).intValue(), false);
                }
                if (z11 && z12) {
                    C26076k.m134208q().m134217J();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("SettingReminderUtils", e11);
            }
        }
    }

    /* renamed from: h */
    public static boolean m134260h(int i11, int i12, boolean z11) {
        boolean z12;
        boolean z13;
        if (i12 == -10) {
            return false;
        }
        try {
            boolean m134223v = C26076k.m134208q().m134223v(i11, i12);
            if (i11 == 2) {
                z12 = C26076k.m134208q().m134214A(i12);
            } else {
                z12 = false;
            }
            if (!m134223v && !z12) {
                z13 = false;
                if (z11 && z13) {
                    C26076k.m134208q().m134217J();
                }
                return z13;
            }
            z13 = true;
            if (z11) {
                C26076k.m134208q().m134217J();
            }
            return z13;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SettingReminderUtils", e11);
            return false;
        }
    }

    /* renamed from: i */
    private static boolean m134261i(List list, boolean z11) {
        if (z11) {
            return true;
        }
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (list.get(i11) != null && ((View) list.get(i11)).getVisibility() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: j */
    public static int m134262j(C26071f c26071f) {
        int i11;
        if (c26071f != null && (i11 = c26071f.f124228c) >= 0) {
            int[] iArr = AbstractC26080o.f124273c;
            if (i11 < iArr.length) {
                return iArr[i11];
            }
            return 0;
        }
        return 0;
    }

    /* renamed from: k */
    public static ArrayList m134263k(InterfaceC26066a interfaceC26066a, Object[] objArr, View view) {
        InterfaceC26070e interfaceC26070e;
        if (objArr != null) {
            try {
                if (objArr.length != 0 && interfaceC26066a != null) {
                    ArrayList arrayList = new ArrayList(objArr.length);
                    for (Object obj : objArr) {
                        int intValue = ((Integer) obj).intValue();
                        int mo57170bb = interfaceC26066a.mo57170bb(intValue);
                        if (mo57170bb != -10 && !arrayList.contains(Integer.valueOf(mo57170bb))) {
                            arrayList.add(Integer.valueOf(mo57170bb));
                        } else if (view != null && intValue == AbstractC6918a0.zinstant_banner && (interfaceC26070e = (InterfaceC26070e) view.findViewById(intValue)) != null && interfaceC26070e.getCurrentData() != null) {
                            int i11 = interfaceC26070e.getCurrentData().f124227b;
                            if (!arrayList.contains(Integer.valueOf(i11))) {
                                arrayList.add(Integer.valueOf(i11));
                            }
                        }
                    }
                    return arrayList;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("SettingReminderUtils", e11);
            }
        }
        return null;
    }

    /* renamed from: l */
    public static Object m134264l(String str) {
        try {
            Object obj = AbstractC26080o.f124271a.get(str);
            if (obj == null) {
                return -10;
            }
            return obj;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SettingReminderUtils", e11);
            return -10;
        }
    }

    /* renamed from: m */
    public static View m134265m(View view) {
        return view.findViewById(AbstractC6918a0.zinstant_banner);
    }

    /* renamed from: n */
    public static boolean m134266n(int i11) {
        if (i11 != 18 && i11 != 19) {
            if (i11 != 86 && i11 != 87) {
                if (i11 != 91) {
                    if (i11 != 92) {
                        switch (i11) {
                            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                            case 103:
                                return AbstractC23309i.m121234Ng();
                            case 21:
                                boolean z11 = AbstractC26684e.f126408a;
                                return false;
                            case 24:
                                if (AbstractC23309i.m121256O1() != 1) {
                                    return false;
                                }
                                return true;
                            case 52:
                                if (AbstractC23309i.m121965h1() != 1) {
                                    return false;
                                }
                                return true;
                            case 56:
                                return AbstractC23309i.m121529Vf();
                            case 63:
                                return AbstractC26683d.f126399r;
                            case Adtima.SDK_PRODUCT_VERSION_CODE /* 67 */:
                                if (ZMediaPlayerSettings.getVideoConfig(0).getPlayInline() != 1) {
                                    return false;
                                }
                                return true;
                            case 89:
                                return C26446c.m136326b().m136330e();
                            case 94:
                                if (AbstractC23309i.m121377Rb() == 0) {
                                    return false;
                                }
                                return true;
                            case 97:
                                return AbstractC23309i.m122376s();
                            case 112:
                                return AbstractC23309i.m121640Yf();
                            case 126:
                                if (AbstractC0924m0.m3530W0() != 1) {
                                    return false;
                                }
                                return true;
                            case 128:
                                return C22447s.m116020V();
                            case 143:
                                if (C26680a.m137023g() != 1) {
                                    return false;
                                }
                                return true;
                            case 147:
                                return C26231b.m134867m();
                            default:
                                switch (i11) {
                                    case 73:
                                        if (!AbstractC23309i.m121565We() || ZMediaPlayerSettings.getVideoConfig(1).getPlayInline() != 1) {
                                            return false;
                                        }
                                        return true;
                                    case 74:
                                    case 75:
                                    case 76:
                                        return AbstractC0924m0.m4105p9();
                                    default:
                                        switch (i11) {
                                            case 117:
                                            case 118:
                                            case 119:
                                                return AbstractC0924m0.m4075o9();
                                            case 120:
                                                if (AbstractC0924m0.m4332x0() != 1) {
                                                    return false;
                                                }
                                                return true;
                                            default:
                                                return true;
                                        }
                                }
                        }
                    }
                    if (!AbstractC23309i.m122004i2() || !AbstractC26681b.f126356a) {
                        return false;
                    }
                    return true;
                }
                return AbstractC23306f.m120676j().m128395L();
            }
            return !"my".equals(C28119l3.m141601c().m141603b());
        }
        if (AbstractC23309i.m121929g3() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public static void m134267o(InterfaceC26070e interfaceC26070e) {
        if (interfaceC26070e != null) {
            try {
                if (interfaceC26070e.getCurrentData() != null && (interfaceC26070e instanceof SettingReminderZinstantBanner)) {
                    ((SettingReminderZinstantBanner) interfaceC26070e).m50504j();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("SettingReminderUtils", e11);
            }
        }
    }

    /* renamed from: p */
    public static void m134268p(int i11, ArrayList arrayList, boolean z11) {
        if (arrayList != null) {
            try {
                if (arrayList.size() != 0) {
                    if (!AbstractC19444a.m101693a()) {
                        m134259g(i11, arrayList, z11);
                    } else if (C26076k.m134208q().m134220p() != null) {
                        C26076k.m134208q().m134220p().execute(new Runnable() { // from class: s00.p

                            /* renamed from: p */
                            public final /* synthetic */ int f124276p;

                            /* renamed from: q */
                            public final /* synthetic */ ArrayList f124277q;

                            /* renamed from: r */
                            public final /* synthetic */ boolean f124278r;

                            public /* synthetic */ RunnableC26081p(int i112, ArrayList arrayList2, boolean z112) {
                                r1 = i112;
                                r2 = arrayList2;
                                r3 = z112;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                AbstractC26084s.m134259g(r1, r2, r3);
                            }
                        });
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("SettingReminderUtils", e11);
            }
        }
    }

    /* renamed from: q */
    public static void m134269q(int i11, int i12) {
        m134270r(i11, i12, true);
    }

    /* renamed from: r */
    public static void m134270r(int i11, int i12, boolean z11) {
        if (i12 == -10) {
            return;
        }
        try {
            if (!AbstractC19444a.m101693a()) {
                m134260h(i11, i12, z11);
            } else if (C26076k.m134208q().m134220p() != null) {
                C26076k.m134208q().m134220p().execute(new Runnable() { // from class: s00.q

                    /* renamed from: p */
                    public final /* synthetic */ int f124279p;

                    /* renamed from: q */
                    public final /* synthetic */ int f124280q;

                    /* renamed from: r */
                    public final /* synthetic */ boolean f124281r;

                    public /* synthetic */ RunnableC26082q(int i112, int i122, boolean z112) {
                        r1 = i112;
                        r2 = i122;
                        r3 = z112;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC26084s.m134260h(r1, r2, r3);
                    }
                });
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SettingReminderUtils", e11);
        }
    }

    /* renamed from: s */
    public static void m134271s(int i11, int i12, boolean z11) {
        try {
            C26076k.m134208q().m134220p().execute(new Runnable() { // from class: s00.r

                /* renamed from: p */
                public final /* synthetic */ int f124282p;

                /* renamed from: q */
                public final /* synthetic */ int f124283q;

                /* renamed from: r */
                public final /* synthetic */ boolean f124284r;

                public /* synthetic */ RunnableC26083r(int i112, int i122, boolean z112) {
                    r1 = i112;
                    r2 = i122;
                    r3 = z112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC26084s.m134260h(r1, r2, r3);
                }
            });
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SettingReminderUtils", e11);
        }
    }

    /* renamed from: t */
    public static void m134272t() {
        m134268p(2, AbstractC26080o.f124272b, true);
    }

    /* renamed from: u */
    private static int m134273u(ImageView imageView, C26071f c26071f) {
        if (imageView == null || c26071f == null) {
            return -1;
        }
        int i11 = c26071f.f124228c;
        int[] iArr = AbstractC26080o.f124273c;
        if (i11 >= iArr.length) {
            return -1;
        }
        if (i11 == -1) {
            imageView.setVisibility(8);
        } else if (i11 == 1) {
            imageView.setImageResource(iArr[i11]);
            imageView.setVisibility(0);
        } else if (i11 == 0) {
            imageView.setVisibility(8);
        }
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004b A[Catch: Exception -> 0x0038, TRY_LEAVE, TryCatch #0 {Exception -> 0x0038, blocks: (B:6:0x0004, B:8:0x0010, B:10:0x0016, B:12:0x001b, B:14:0x0021, B:16:0x0028, B:18:0x002e, B:20:0x003a, B:24:0x004b, B:27:0x003d, B:29:0x0043), top: B:5:0x0004 }] */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m134274v(int i11, ImageView imageView, List list, boolean z11) {
        int i12;
        if (imageView == null) {
            return -1;
        }
        try {
            C26071f m134221r = C26076k.m134208q().m134221r(i11);
            if (m134221r != null && m134221r.m134171a()) {
                if (m134221r.f124229d >= 1) {
                    i12 = m134273u(imageView, m134221r);
                    if (i12 >= 0) {
                        int size = list.size();
                        for (int i13 = 0; i13 < size; i13++) {
                            if (list.get(i13) != null) {
                                ((View) list.get(i13)).setVisibility(8);
                            }
                        }
                    }
                } else if (!m134261i(list, z11)) {
                    i12 = m134273u(imageView, m134221r);
                }
                if (i12 == -1) {
                    imageView.setVisibility(8);
                }
                return i12;
            }
            i12 = -1;
            if (i12 == -1) {
            }
            return i12;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SettingReminderUtils", e11);
            return -1;
        }
    }

    /* renamed from: w */
    public static boolean m134275w(int i11) {
        return i11 == 0 || i11 == 1;
    }

    /* renamed from: x */
    public static boolean m134276x(int i11) {
        return i11 <= 1;
    }

    /* renamed from: y */
    public static boolean m134277y(View view) {
        try {
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SettingReminderUtils", e11);
        }
        if (!view.isShown()) {
            return false;
        }
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            if (rect.bottom - rect.top < view.getHeight()) {
                return false;
            }
            return true;
        }
        return false;
    }
}
