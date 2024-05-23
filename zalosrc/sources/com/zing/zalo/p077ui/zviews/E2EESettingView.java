package com.zing.zalo.p077ui.zviews;

import am.AbstractC0924m0;
import am.C0943w;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import androidx.appcompat.widget.ZAppCompatImageView;
import b40.C2526d;
import com.adtima.ads.ZAdsErrorCode;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.utils.ToastUtils;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23028c0;
import me0.AbstractC23136l9;
import me0.C23055e5;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23306f;
import p363nh.C23744a;
import p461qu.AbstractC25495a;
import p542ub.InterfaceC27218a;
import p649xl.AbstractC29723b3;
import p649xl.C29747c9;
import p649xl.C29759d3;
import p716zh.C31852b4;
import p716zh.C31973j5;
import p716zh.C31986k3;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import qm0.AbstractC25358n;
import qm0.AbstractC25370t;
import vg.AbstractC28207v1;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;
import zl0.AbstractC32226c;

/* loaded from: classes6.dex */
public final class E2EESettingView extends BaseZaloView implements C23744a.c {
    public static final C14223a Companion = new C14223a(null);

    /* renamed from: M0 */
    private String f73151M0;

    /* renamed from: N0 */
    private boolean f73152N0;

    /* renamed from: O0 */
    private boolean f73153O0;

    /* renamed from: P0 */
    private EnumC14224b f73154P0;

    /* renamed from: Q0 */
    private AbstractC29723b3 f73155Q0;

    /* renamed from: R0 */
    private C29759d3 f73156R0;

    /* renamed from: S0 */
    private C29747c9 f73157S0;

    /* renamed from: T0 */
    private long f73158T0;

    /* renamed from: U0 */
    private boolean f73159U0;

    /* renamed from: V0 */
    private int f73160V0;

    /* renamed from: com.zing.zalo.ui.zviews.E2EESettingView$a */
    /* loaded from: classes6.dex */
    public static final class C14223a {
        private C14223a() {
        }

        public /* synthetic */ C14223a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.zing.zalo.ui.zviews.E2EESettingView$b */
    /* loaded from: classes6.dex */
    public static final class EnumC14224b {

        /* renamed from: p */
        public static final EnumC14224b f73161p = new EnumC14224b("INTRO", 0);

        /* renamed from: q */
        public static final EnumC14224b f73162q = new EnumC14224b("ERROR", 1);

        /* renamed from: r */
        public static final EnumC14224b f73163r = new EnumC14224b("SUCCESS", 2);

        /* renamed from: s */
        public static final EnumC14224b f73164s = new EnumC14224b("UPGRADING", 3);

        /* renamed from: t */
        public static final EnumC14224b f73165t = new EnumC14224b("WAITING", 4);

        /* renamed from: u */
        private static final /* synthetic */ EnumC14224b[] f73166u;

        /* renamed from: v */
        private static final /* synthetic */ InterfaceC30165a f73167v;

        static {
            EnumC14224b[] m79316b = m79316b();
            f73166u = m79316b;
            f73167v = AbstractC30166b.m148796a(m79316b);
        }

        private EnumC14224b(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ EnumC14224b[] m79316b() {
            return new EnumC14224b[]{f73161p, f73162q, f73163r, f73164s, f73165t};
        }

        public static EnumC14224b valueOf(String str) {
            return (EnumC14224b) Enum.valueOf(EnumC14224b.class, str);
        }

        public static EnumC14224b[] values() {
            return (EnumC14224b[]) f73166u.clone();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.E2EESettingView$c */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C14225c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f73168a;

        static {
            int[] iArr = new int[EnumC14224b.values().length];
            try {
                iArr[EnumC14224b.f73162q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC14224b.f73163r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC14224b.f73164s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC14224b.f73165t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f73168a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AM */
    public static final void m79284AM(E2EESettingView e2EESettingView, View view) {
        AbstractC19074t.m100208f(e2EESettingView, "this$0");
        e2EESettingView.m79315tM();
    }

    /* renamed from: BM */
    private final void m79285BM() {
        AbstractC29723b3 abstractC29723b3 = this.f73155Q0;
        C29759d3 c29759d3 = null;
        if (abstractC29723b3 == null) {
            AbstractC19074t.m100223u("rootBinding");
            abstractC29723b3 = null;
        }
        if (!abstractC29723b3.f137295Q.m8570i()) {
            AbstractC29723b3 abstractC29723b32 = this.f73155Q0;
            if (abstractC29723b32 == null) {
                AbstractC19074t.m100223u("rootBinding");
                abstractC29723b32 = null;
            }
            ViewStub m8569h = abstractC29723b32.f137295Q.m8569h();
            if (m8569h != null) {
                m8569h.inflate();
            }
            C29759d3 c29759d32 = this.f73156R0;
            if (c29759d32 == null) {
                AbstractC19074t.m100223u("upgradeBinding");
                c29759d32 = null;
            }
            c29759d32.f137479q.setIdTracking("e2ee_setting_back_btn");
            C29759d3 c29759d33 = this.f73156R0;
            if (c29759d33 == null) {
                AbstractC19074t.m100223u("upgradeBinding");
                c29759d33 = null;
            }
            c29759d33.f137479q.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.ub
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    E2EESettingView.m79286CM(E2EESettingView.this, view);
                }
            });
            C29759d3 c29759d34 = this.f73156R0;
            if (c29759d34 == null) {
                AbstractC19074t.m100223u("upgradeBinding");
                c29759d34 = null;
            }
            c29759d34.f137484v.setIdTracking("e2ee_setting_back_btn");
            C29759d3 c29759d35 = this.f73156R0;
            if (c29759d35 == null) {
                AbstractC19074t.m100223u("upgradeBinding");
                c29759d35 = null;
            }
            c29759d35.f137484v.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.vb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    E2EESettingView.m79287DM(E2EESettingView.this, view);
                }
            });
            C29759d3 c29759d36 = this.f73156R0;
            if (c29759d36 == null) {
                AbstractC19074t.m100223u("upgradeBinding");
                c29759d36 = null;
            }
            c29759d36.f137480r.setIdTracking("e2ee_setting_retry_btn");
            C29759d3 c29759d37 = this.f73156R0;
            if (c29759d37 == null) {
                AbstractC19074t.m100223u("upgradeBinding");
            } else {
                c29759d3 = c29759d37;
            }
            c29759d3.f137480r.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.wb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    E2EESettingView.m79288EM(E2EESettingView.this, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CM */
    public static final void m79286CM(E2EESettingView e2EESettingView, View view) {
        AbstractC19074t.m100208f(e2EESettingView, "this$0");
        C23744a.Companion.m124119a().m124116d(155, new Object[0]);
        e2EESettingView.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DM */
    public static final void m79287DM(E2EESettingView e2EESettingView, View view) {
        AbstractC19074t.m100208f(e2EESettingView, "this$0");
        C23744a.Companion.m124119a().m124116d(155, new Object[0]);
        e2EESettingView.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EM */
    public static final void m79288EM(E2EESettingView e2EESettingView, View view) {
        AbstractC19074t.m100208f(e2EESettingView, "this$0");
        e2EESettingView.m79309uM();
    }

    /* renamed from: FM */
    private final void m79289FM() {
        m79313yM();
        this.f73160V0 = 3;
        C29747c9 c29747c9 = this.f73157S0;
        C29759d3 c29759d3 = null;
        if (c29747c9 == null) {
            AbstractC19074t.m100223u("oldIntroBinding");
            c29747c9 = null;
        }
        c29747c9.f137419v.setVisibility(0);
        C29759d3 c29759d32 = this.f73156R0;
        if (c29759d32 != null) {
            if (c29759d32 == null) {
                AbstractC19074t.m100223u("upgradeBinding");
            } else {
                c29759d3 = c29759d32;
            }
            c29759d3.f137483u.setVisibility(8);
        }
    }

    /* renamed from: GM */
    private final void m79290GM(EnumC14224b enumC14224b, int i11, int i12, int[] iArr) {
        if (this.f73154P0 == enumC14224b) {
            return;
        }
        this.f73154P0 = enumC14224b;
        int i13 = C14225c.f73168a[enumC14224b.ordinal()];
        if (i13 != 1 && i13 != 2 && i13 != 3 && i13 != 4) {
            m79289FM();
        } else {
            m79292IM(enumC14224b, i11, i12, iArr);
        }
    }

    /* renamed from: HM */
    static /* synthetic */ void m79291HM(E2EESettingView e2EESettingView, EnumC14224b enumC14224b, int i11, int i12, int[] iArr, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = 0;
        }
        if ((i13 & 8) != 0) {
            iArr = null;
        }
        e2EESettingView.m79290GM(enumC14224b, i11, i12, iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0253 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0234 A[SYNTHETIC] */
    /* renamed from: IM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m79292IM(EnumC14224b enumC14224b, int i11, int i12, int[] iArr) {
        String str;
        int m131511r;
        String m131214n0;
        String m118743r0;
        boolean z11;
        boolean m131388u;
        m79285BM();
        C29759d3 c29759d3 = this.f73156R0;
        C29759d3 c29759d32 = null;
        if (c29759d3 == null) {
            AbstractC19074t.m100223u("upgradeBinding");
            c29759d3 = null;
        }
        c29759d3.f137483u.setVisibility(0);
        C29747c9 c29747c9 = this.f73157S0;
        if (c29747c9 != null) {
            if (c29747c9 == null) {
                AbstractC19074t.m100223u("oldIntroBinding");
                c29747c9 = null;
            }
            c29747c9.f137419v.setVisibility(8);
        }
        int i13 = C14225c.f73168a[enumC14224b.ordinal()];
        if (i13 != 1) {
            if (i13 != 2) {
                if (i13 != 3) {
                    if (i13 == 4) {
                        C29759d3 c29759d33 = this.f73156R0;
                        if (c29759d33 == null) {
                            AbstractC19074t.m100223u("upgradeBinding");
                            c29759d33 = null;
                        }
                        c29759d33.f137482t.setImageResource(AbstractC16803z.upgrade_e2ee_pending);
                        String str2 = this.f73151M0;
                        if (str2 == null) {
                            AbstractC19074t.m100223u("ownerId");
                            str2 = null;
                        }
                        String m118086f = AbstractC23028c0.m118086f(str2, false, 0);
                        C29759d3 c29759d34 = this.f73156R0;
                        if (c29759d34 == null) {
                            AbstractC19074t.m100223u("upgradeBinding");
                            c29759d34 = null;
                        }
                        RobotoTextView robotoTextView = c29759d34.f137486x;
                        C19067n0 c19067n0 = C19067n0.f94947a;
                        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_e2ee_state_person_waiting_upgrade);
                        AbstractC19074t.m100207e(m118743r02, "getString(...)");
                        String format = String.format(m118743r02, Arrays.copyOf(new Object[]{m118086f}, 1));
                        AbstractC19074t.m100207e(format, "format(...)");
                        robotoTextView.setText(format);
                        C29759d3 c29759d35 = this.f73156R0;
                        if (c29759d35 == null) {
                            AbstractC19074t.m100223u("upgradeBinding");
                            c29759d35 = null;
                        }
                        RobotoTextView robotoTextView2 = c29759d35.f137485w;
                        robotoTextView2.setVisibility(0);
                        robotoTextView2.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_e2ee_state_person_waiting_upgrade_des));
                        C24848g0 c24848g0 = C24848g0.f119245a;
                        C29759d3 c29759d36 = this.f73156R0;
                        if (c29759d36 == null) {
                            AbstractC19074t.m100223u("upgradeBinding");
                            c29759d36 = null;
                        }
                        c29759d36.f137479q.setVisibility(0);
                        C29759d3 c29759d37 = this.f73156R0;
                        if (c29759d37 == null) {
                            AbstractC19074t.m100223u("upgradeBinding");
                        } else {
                            c29759d32 = c29759d37;
                        }
                        c29759d32.f137480r.setVisibility(8);
                        m79305pM();
                        this.f73160V0 = 7;
                        return;
                    }
                } else {
                    C29759d3 c29759d38 = this.f73156R0;
                    if (c29759d38 == null) {
                        AbstractC19074t.m100223u("upgradeBinding");
                        c29759d38 = null;
                    }
                    c29759d38.f137482t.setImageResource(AbstractC16803z.upgrade_image_e2ee);
                    C29759d3 c29759d39 = this.f73156R0;
                    if (c29759d39 == null) {
                        AbstractC19074t.m100223u("upgradeBinding");
                        c29759d39 = null;
                    }
                    c29759d39.f137486x.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_e2ee_state_upgrading));
                    C29759d3 c29759d310 = this.f73156R0;
                    if (c29759d310 == null) {
                        AbstractC19074t.m100223u("upgradeBinding");
                        c29759d310 = null;
                    }
                    c29759d310.f137481s.setVisibility(0);
                    RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
                    rotateAnimation.setDuration(2000L);
                    rotateAnimation.setInterpolator(new LinearInterpolator());
                    rotateAnimation.setRepeatCount(-1);
                    C29759d3 c29759d311 = this.f73156R0;
                    if (c29759d311 == null) {
                        AbstractC19074t.m100223u("upgradeBinding");
                        c29759d311 = null;
                    }
                    c29759d311.f137481s.startAnimation(rotateAnimation);
                    C29759d3 c29759d312 = this.f73156R0;
                    if (c29759d312 == null) {
                        AbstractC19074t.m100223u("upgradeBinding");
                        c29759d312 = null;
                    }
                    c29759d312.f137485w.setVisibility(8);
                    C29759d3 c29759d313 = this.f73156R0;
                    if (c29759d313 == null) {
                        AbstractC19074t.m100223u("upgradeBinding");
                        c29759d313 = null;
                    }
                    c29759d313.f137479q.setVisibility(8);
                    C29759d3 c29759d314 = this.f73156R0;
                    if (c29759d314 == null) {
                        AbstractC19074t.m100223u("upgradeBinding");
                    } else {
                        c29759d32 = c29759d314;
                    }
                    c29759d32.f137480r.setVisibility(8);
                    this.f73160V0 = 4;
                    C24848g0 c24848g02 = C24848g0.f119245a;
                    return;
                }
            } else {
                C29759d3 c29759d315 = this.f73156R0;
                if (c29759d315 == null) {
                    AbstractC19074t.m100223u("upgradeBinding");
                    c29759d315 = null;
                }
                c29759d315.f137482t.setImageResource(AbstractC16803z.upgrade_e2ee_success);
                C29759d3 c29759d316 = this.f73156R0;
                if (c29759d316 == null) {
                    AbstractC19074t.m100223u("upgradeBinding");
                    c29759d316 = null;
                }
                c29759d316.f137486x.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_e2ee_state_upgrade_success));
                C29759d3 c29759d317 = this.f73156R0;
                if (c29759d317 == null) {
                    AbstractC19074t.m100223u("upgradeBinding");
                    c29759d317 = null;
                }
                RobotoTextView robotoTextView3 = c29759d317.f137485w;
                robotoTextView3.setVisibility(0);
                robotoTextView3.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_e2ee_state_upgrade_success_des));
                C24848g0 c24848g03 = C24848g0.f119245a;
                C29759d3 c29759d318 = this.f73156R0;
                if (c29759d318 == null) {
                    AbstractC19074t.m100223u("upgradeBinding");
                    c29759d318 = null;
                }
                c29759d318.f137479q.setVisibility(0);
                C29759d3 c29759d319 = this.f73156R0;
                if (c29759d319 == null) {
                    AbstractC19074t.m100223u("upgradeBinding");
                } else {
                    c29759d32 = c29759d319;
                }
                c29759d32.f137480r.setVisibility(8);
                m79305pM();
                this.f73160V0 = 6;
                return;
            }
        } else {
            C29759d3 c29759d320 = this.f73156R0;
            if (c29759d320 == null) {
                AbstractC19074t.m100223u("upgradeBinding");
                c29759d320 = null;
            }
            c29759d320.f137482t.setImageResource(AbstractC16803z.upgrade_e2ee_failed);
            C29759d3 c29759d321 = this.f73156R0;
            if (c29759d321 == null) {
                AbstractC19074t.m100223u("upgradeBinding");
                c29759d321 = null;
            }
            c29759d321.f137486x.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_e2ee_state_error_upgrade));
            C29759d3 c29759d322 = this.f73156R0;
            if (c29759d322 == null) {
                AbstractC19074t.m100223u("upgradeBinding");
                c29759d322 = null;
            }
            c29759d322.f137485w.setVisibility(0);
            m79305pM();
            this.f73160V0 = 6;
            if (i11 != -101) {
                if (i11 != -5) {
                    if (i11 != -3) {
                        if (i11 != -2) {
                            switch (i11) {
                                case -11:
                                case -10:
                                    break;
                                case -9:
                                    List m153134h = C31852b4.Companion.m153134h();
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj : m153134h) {
                                        int intValue = ((Number) obj).intValue();
                                        if (iArr != null) {
                                            m131388u = AbstractC25358n.m131388u(iArr, intValue);
                                            if (!m131388u) {
                                                z11 = true;
                                                if (!(!z11)) {
                                                    arrayList.add(obj);
                                                }
                                            }
                                        }
                                        z11 = false;
                                        if (!(!z11)) {
                                        }
                                    }
                                    m131511r = AbstractC25370t.m131511r(arrayList, 10);
                                    ArrayList arrayList2 = new ArrayList(m131511r);
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        int intValue2 = ((Number) it.next()).intValue();
                                        if (intValue2 != 0) {
                                            if (intValue2 != 1) {
                                                if (intValue2 != 2) {
                                                    m118743r0 = "";
                                                } else {
                                                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zalo_pc);
                                                }
                                            } else {
                                                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zalo_on_web);
                                            }
                                        } else {
                                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zalo_on_mobile);
                                        }
                                        arrayList2.add(m118743r0);
                                    }
                                    ArrayList arrayList3 = new ArrayList();
                                    for (Object obj2 : arrayList2) {
                                        String str3 = (String) obj2;
                                        AbstractC19074t.m100205c(str3);
                                        if (str3.length() != 0) {
                                            arrayList3.add(obj2);
                                        }
                                    }
                                    m131214n0 = AbstractC25332a0.m131214n0(arrayList3, null, null, null, 0, null, null, 63, null);
                                    C29759d3 c29759d323 = this.f73156R0;
                                    if (c29759d323 == null) {
                                        AbstractC19074t.m100223u("upgradeBinding");
                                        c29759d323 = null;
                                    }
                                    c29759d323.f137485w.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_e2ee_error_sub_devices_not_submit_key, m131214n0));
                                    C29759d3 c29759d324 = this.f73156R0;
                                    if (c29759d324 == null) {
                                        AbstractC19074t.m100223u("upgradeBinding");
                                        c29759d324 = null;
                                    }
                                    c29759d324.f137480r.setVisibility(8);
                                    C29759d3 c29759d325 = this.f73156R0;
                                    if (c29759d325 == null) {
                                        AbstractC19074t.m100223u("upgradeBinding");
                                        c29759d325 = null;
                                    }
                                    c29759d325.f137479q.setVisibility(8);
                                    C29759d3 c29759d326 = this.f73156R0;
                                    if (c29759d326 == null) {
                                        AbstractC19074t.m100223u("upgradeBinding");
                                    } else {
                                        c29759d32 = c29759d326;
                                    }
                                    c29759d32.f137484v.setVisibility(0);
                                    C24848g0 c24848g04 = C24848g0.f119245a;
                                    return;
                                case ZAdsErrorCode.SDK_NO_ADS_FREQUENCY_CAPPING /* -8 */:
                                    break;
                                case ZAdsErrorCode.SDK_INVALID_ZONE /* -7 */:
                                    break;
                                default:
                                    C29759d3 c29759d327 = this.f73156R0;
                                    if (c29759d327 == null) {
                                        AbstractC19074t.m100223u("upgradeBinding");
                                        c29759d327 = null;
                                    }
                                    c29759d327.f137485w.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_e2ee_state_error_try_again));
                                    C29759d3 c29759d328 = this.f73156R0;
                                    if (c29759d328 == null) {
                                        AbstractC19074t.m100223u("upgradeBinding");
                                        c29759d328 = null;
                                    }
                                    c29759d328.f137480r.setVisibility(0);
                                    C29759d3 c29759d329 = this.f73156R0;
                                    if (c29759d329 == null) {
                                        AbstractC19074t.m100223u("upgradeBinding");
                                    } else {
                                        c29759d32 = c29759d329;
                                    }
                                    c29759d32.f137479q.setVisibility(8);
                                    break;
                            }
                        }
                        C29759d3 c29759d330 = this.f73156R0;
                        if (c29759d330 == null) {
                            AbstractC19074t.m100223u("upgradeBinding");
                            c29759d330 = null;
                        }
                        c29759d330.f137480r.setVisibility(8);
                        C29759d3 c29759d331 = this.f73156R0;
                        if (c29759d331 == null) {
                            AbstractC19074t.m100223u("upgradeBinding");
                            c29759d331 = null;
                        }
                        c29759d331.f137479q.setVisibility(8);
                        C29759d3 c29759d332 = this.f73156R0;
                        if (c29759d332 == null) {
                            AbstractC19074t.m100223u("upgradeBinding");
                            c29759d332 = null;
                        }
                        c29759d332.f137484v.setVisibility(0);
                        C29759d3 c29759d333 = this.f73156R0;
                        if (c29759d333 == null) {
                            AbstractC19074t.m100223u("upgradeBinding");
                        } else {
                            c29759d32 = c29759d333;
                        }
                        c29759d32.f137485w.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_e2ee_error_not_support_feature));
                        C24848g0 c24848g05 = C24848g0.f119245a;
                        return;
                    }
                    String str4 = this.f73151M0;
                    if (str4 == null) {
                        AbstractC19074t.m100223u("ownerId");
                        str4 = null;
                    }
                    if (AbstractC25495a.m132079d(str4)) {
                        C29759d3 c29759d334 = this.f73156R0;
                        if (c29759d334 == null) {
                            AbstractC19074t.m100223u("upgradeBinding");
                            c29759d334 = null;
                        }
                        c29759d334.f137485w.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_e2ee_state_error_group_version_not_support));
                    } else {
                        if (i12 > 0) {
                            str = String.valueOf(i12);
                        } else {
                            str = this.f73151M0;
                            if (str == null) {
                                AbstractC19074t.m100223u("ownerId");
                                str = null;
                            }
                        }
                        String m118086f2 = AbstractC23028c0.m118086f(str, false, 0);
                        C29759d3 c29759d335 = this.f73156R0;
                        if (c29759d335 == null) {
                            AbstractC19074t.m100223u("upgradeBinding");
                            c29759d335 = null;
                        }
                        RobotoTextView robotoTextView4 = c29759d335.f137485w;
                        C19067n0 c19067n02 = C19067n0.f94947a;
                        String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_e2ee_state_error_person_version_not_support);
                        AbstractC19074t.m100207e(m118743r03, "getString(...)");
                        String format2 = String.format(m118743r03, Arrays.copyOf(new Object[]{m118086f2}, 1));
                        AbstractC19074t.m100207e(format2, "format(...)");
                        robotoTextView4.setText(format2);
                    }
                    C29759d3 c29759d336 = this.f73156R0;
                    if (c29759d336 == null) {
                        AbstractC19074t.m100223u("upgradeBinding");
                        c29759d336 = null;
                    }
                    c29759d336.f137480r.setVisibility(8);
                    C29759d3 c29759d337 = this.f73156R0;
                    if (c29759d337 == null) {
                        AbstractC19074t.m100223u("upgradeBinding");
                        c29759d337 = null;
                    }
                    c29759d337.f137479q.setVisibility(8);
                    C29759d3 c29759d338 = this.f73156R0;
                    if (c29759d338 == null) {
                        AbstractC19074t.m100223u("upgradeBinding");
                    } else {
                        c29759d32 = c29759d338;
                    }
                    c29759d32.f137484v.setVisibility(0);
                    C24848g0 c24848g06 = C24848g0.f119245a;
                    return;
                }
                C29759d3 c29759d339 = this.f73156R0;
                if (c29759d339 == null) {
                    AbstractC19074t.m100223u("upgradeBinding");
                    c29759d339 = null;
                }
                c29759d339.f137485w.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_e2ee_error_need_to_update_your_pc_zalo));
                C29759d3 c29759d340 = this.f73156R0;
                if (c29759d340 == null) {
                    AbstractC19074t.m100223u("upgradeBinding");
                    c29759d340 = null;
                }
                c29759d340.f137480r.setVisibility(8);
                C29759d3 c29759d341 = this.f73156R0;
                if (c29759d341 == null) {
                    AbstractC19074t.m100223u("upgradeBinding");
                    c29759d341 = null;
                }
                c29759d341.f137479q.setVisibility(8);
                C29759d3 c29759d342 = this.f73156R0;
                if (c29759d342 == null) {
                    AbstractC19074t.m100223u("upgradeBinding");
                } else {
                    c29759d32 = c29759d342;
                }
                c29759d32.f137484v.setVisibility(0);
                C24848g0 c24848g07 = C24848g0.f119245a;
                return;
            }
            C29759d3 c29759d343 = this.f73156R0;
            if (c29759d343 == null) {
                AbstractC19074t.m100223u("upgradeBinding");
                c29759d343 = null;
            }
            c29759d343.f137485w.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_toast_msg_feature_deactived));
            C29759d3 c29759d344 = this.f73156R0;
            if (c29759d344 == null) {
                AbstractC19074t.m100223u("upgradeBinding");
                c29759d344 = null;
            }
            c29759d344.f137480r.setVisibility(8);
            C29759d3 c29759d345 = this.f73156R0;
            if (c29759d345 == null) {
                AbstractC19074t.m100223u("upgradeBinding");
                c29759d345 = null;
            }
            c29759d345.f137479q.setVisibility(8);
            C29759d3 c29759d346 = this.f73156R0;
            if (c29759d346 == null) {
                AbstractC19074t.m100223u("upgradeBinding");
            } else {
                c29759d32 = c29759d346;
            }
            c29759d32.f137484v.setVisibility(0);
            C24848g0 c24848g08 = C24848g0.f119245a;
            return;
        }
        C24848g0 c24848g09 = C24848g0.f119245a;
    }

    /* renamed from: nM */
    private final boolean m79303nM() {
        boolean z11;
        String str = null;
        if (this.f73152N0) {
            C0943w c0943w = C0943w.f3447a;
            String str2 = this.f73151M0;
            if (str2 == null) {
                AbstractC19074t.m100223u("ownerId");
            } else {
                str = str2;
            }
            C31973j5 m4472f = c0943w.m4472f(str);
            if (m4472f != null) {
                z11 = m4472f.m153742T();
            } else {
                z11 = false;
            }
            this.f73153O0 = z11;
            if (!z11) {
                return false;
            }
            return true;
        }
        if (!AbstractC0924m0.m3745d9()) {
            String str3 = this.f73151M0;
            if (str3 == null) {
                AbstractC19074t.m100223u("ownerId");
            } else {
                str = str3;
            }
            if (!AbstractC21935u.m114555v(str, false)) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oM */
    public static final void m79304oM(E2EESettingView e2EESettingView, int i11, int i12, int[] iArr) {
        AbstractC19074t.m100208f(e2EESettingView, "this$0");
        e2EESettingView.m79310vM(i11, i12, iArr);
    }

    /* renamed from: pM */
    private final void m79305pM() {
        C29759d3 c29759d3 = this.f73156R0;
        if (c29759d3 == null) {
            AbstractC19074t.m100223u("upgradeBinding");
            c29759d3 = null;
        }
        ZAppCompatImageView zAppCompatImageView = c29759d3.f137481s;
        zAppCompatImageView.clearAnimation();
        zAppCompatImageView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qM */
    public static final void m79306qM(E2EESettingView e2EESettingView, ViewStub viewStub, View view) {
        AbstractC19074t.m100208f(e2EESettingView, "this$0");
        C29759d3 m147839a = C29759d3.m147839a(view);
        AbstractC19074t.m100207e(m147839a, "bind(...)");
        e2EESettingView.f73156R0 = m147839a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rM */
    public static final void m79307rM(E2EESettingView e2EESettingView, ViewStub viewStub, View view) {
        AbstractC19074t.m100208f(e2EESettingView, "this$0");
        C29747c9 m147811a = C29747c9.m147811a(view);
        AbstractC19074t.m100207e(m147811a, "bind(...)");
        e2EESettingView.f73157S0 = m147811a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sM */
    public static final void m79308sM(E2EESettingView e2EESettingView, View view) {
        AbstractC19074t.m100208f(e2EESettingView, "this$0");
        e2EESettingView.finish();
    }

    /* renamed from: uM */
    private final void m79309uM() {
        this.f73159U0 = true;
        if (C23055e5.m118272g(true)) {
            if (!m79303nM()) {
                ToastUtils.m89266n(AbstractC8020f0.str_imp_alias_unsupport, new Object[0]);
                return;
            }
            m79291HM(this, EnumC14224b.f73164s, 0, 0, null, 14, null);
            C31986k3 c31986k3 = C31986k3.f147083a;
            String str = this.f73151M0;
            if (str == null) {
                AbstractC19074t.m100223u("ownerId");
                str = null;
            }
            c31986k3.m154113W0(str);
            this.f73158T0 = System.currentTimeMillis();
        }
    }

    /* renamed from: vM */
    private final void m79310vM(final int i11, final int i12, final int[] iArr) {
        EnumC14224b enumC14224b;
        C31986k3 c31986k3 = C31986k3.f147083a;
        String str = this.f73151M0;
        String str2 = null;
        if (str == null) {
            AbstractC19074t.m100223u("ownerId");
            str = null;
        }
        int m154140q1 = c31986k3.m154140q1(str);
        EnumC14224b enumC14224b2 = this.f73154P0;
        if (enumC14224b2 == null) {
            enumC14224b = EnumC14224b.f73161p;
        } else {
            enumC14224b = enumC14224b2;
        }
        if (m154140q1 != 3) {
            if (m154140q1 != 4) {
                if (m154140q1 != 5 && m154140q1 != 6) {
                    if (enumC14224b2 == null) {
                        enumC14224b = EnumC14224b.f73161p;
                    } else if (enumC14224b2 == EnumC14224b.f73164s || enumC14224b2 == EnumC14224b.f73165t) {
                        enumC14224b = EnumC14224b.f73162q;
                    }
                } else {
                    enumC14224b = EnumC14224b.f73163r;
                }
            } else {
                String str3 = this.f73151M0;
                if (str3 == null) {
                    AbstractC19074t.m100223u("ownerId");
                } else {
                    str2 = str3;
                }
                if (AbstractC25495a.m132079d(str2)) {
                    enumC14224b = EnumC14224b.f73163r;
                } else {
                    EnumC14224b enumC14224b3 = this.f73154P0;
                    EnumC14224b enumC14224b4 = EnumC14224b.f73165t;
                    if (enumC14224b3 != enumC14224b4) {
                        long m3124I0 = (this.f73158T0 + AbstractC0924m0.m3124I0()) - System.currentTimeMillis();
                        if (m3124I0 < 0) {
                            enumC14224b = enumC14224b4;
                        } else {
                            AbstractC19444a.m101694b(new Runnable() { // from class: com.zing.zalo.ui.zviews.pb
                                @Override // java.lang.Runnable
                                public final void run() {
                                    E2EESettingView.m79312xM(E2EESettingView.this, i11, i12, iArr);
                                }
                            }, m3124I0);
                        }
                    }
                }
            }
        } else {
            enumC14224b = EnumC14224b.f73164s;
        }
        m79290GM(enumC14224b, i11, i12, iArr);
    }

    /* renamed from: wM */
    static /* synthetic */ void m79311wM(E2EESettingView e2EESettingView, int i11, int i12, int[] iArr, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        if ((i13 & 4) != 0) {
            iArr = null;
        }
        e2EESettingView.m79310vM(i11, i12, iArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xM */
    public static final void m79312xM(E2EESettingView e2EESettingView, int i11, int i12, int[] iArr) {
        AbstractC19074t.m100208f(e2EESettingView, "this$0");
        e2EESettingView.m79310vM(i11, i12, iArr);
    }

    /* renamed from: yM */
    private final void m79313yM() {
        String str;
        AbstractC29723b3 abstractC29723b3 = this.f73155Q0;
        C29747c9 c29747c9 = null;
        if (abstractC29723b3 == null) {
            AbstractC19074t.m100223u("rootBinding");
            abstractC29723b3 = null;
        }
        if (!abstractC29723b3.f137296R.m8570i()) {
            AbstractC29723b3 abstractC29723b32 = this.f73155Q0;
            if (abstractC29723b32 == null) {
                AbstractC19074t.m100223u("rootBinding");
                abstractC29723b32 = null;
            }
            ViewStub m8569h = abstractC29723b32.f137296R.m8569h();
            if (m8569h != null) {
                m8569h.inflate();
            }
            C29747c9 c29747c92 = this.f73157S0;
            if (c29747c92 == null) {
                AbstractC19074t.m100223u("oldIntroBinding");
                c29747c92 = null;
            }
            c29747c92.f137419v.setVisibility(8);
            if (this.f73152N0) {
                if (this.f73153O0) {
                    C29747c9 c29747c93 = this.f73157S0;
                    if (c29747c93 == null) {
                        AbstractC19074t.m100223u("oldIntroBinding");
                        c29747c93 = null;
                    }
                    c29747c93.f137418u.setVisibility(0);
                    C29747c9 c29747c94 = this.f73157S0;
                    if (c29747c94 == null) {
                        AbstractC19074t.m100223u("oldIntroBinding");
                        c29747c94 = null;
                    }
                    c29747c94.f137420w.setVisibility(8);
                } else {
                    C29747c9 c29747c95 = this.f73157S0;
                    if (c29747c95 == null) {
                        AbstractC19074t.m100223u("oldIntroBinding");
                        c29747c95 = null;
                    }
                    c29747c95.f137420w.setVisibility(0);
                    C29747c9 c29747c96 = this.f73157S0;
                    if (c29747c96 == null) {
                        AbstractC19074t.m100223u("oldIntroBinding");
                        c29747c96 = null;
                    }
                    c29747c96.f137418u.setVisibility(8);
                }
            } else {
                C29747c9 c29747c97 = this.f73157S0;
                if (c29747c97 == null) {
                    AbstractC19074t.m100223u("oldIntroBinding");
                    c29747c97 = null;
                }
                c29747c97.f137420w.setVisibility(8);
                C29747c9 c29747c98 = this.f73157S0;
                if (c29747c98 == null) {
                    AbstractC19074t.m100223u("oldIntroBinding");
                    c29747c98 = null;
                }
                c29747c98.f137414q.setVisibility(0);
            }
            if (AbstractC0924m0.m2930B9()) {
                C29747c9 c29747c99 = this.f73157S0;
                if (c29747c99 == null) {
                    AbstractC19074t.m100223u("oldIntroBinding");
                    c29747c99 = null;
                }
                c29747c99.f137415r.setVisibility(0);
                C29747c9 c29747c910 = this.f73157S0;
                if (c29747c910 == null) {
                    AbstractC19074t.m100223u("oldIntroBinding");
                    c29747c910 = null;
                }
                RobotoTextView robotoTextView = c29747c910.f137416s;
                Context context = getContext();
                if (context != null) {
                    str = context.getString(AbstractC8020f0.str_e2ee_first_time_intro_slide_des_3, String.valueOf(AbstractC0924m0.m4248u3()));
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                robotoTextView.setText(str);
            } else {
                C29747c9 c29747c911 = this.f73157S0;
                if (c29747c911 == null) {
                    AbstractC19074t.m100223u("oldIntroBinding");
                    c29747c911 = null;
                }
                c29747c911.f137415r.setVisibility(8);
            }
            if (AbstractC0924m0.m3775e9()) {
                C29747c9 c29747c912 = this.f73157S0;
                if (c29747c912 == null) {
                    AbstractC19074t.m100223u("oldIntroBinding");
                    c29747c912 = null;
                }
                RobotoTextView robotoTextView2 = c29747c912.f137422y;
                C29747c9 c29747c913 = this.f73157S0;
                if (c29747c913 == null) {
                    AbstractC19074t.m100223u("oldIntroBinding");
                    c29747c913 = null;
                }
                robotoTextView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, AbstractC23136l9.m118665N(c29747c913.f137422y.getContext(), AbstractC16803z.ic_beta), (Drawable) null);
                C29747c9 c29747c914 = this.f73157S0;
                if (c29747c914 == null) {
                    AbstractC19074t.m100223u("oldIntroBinding");
                    c29747c914 = null;
                }
                c29747c914.f137422y.setCompoundDrawablePadding(AbstractC23136l9.m118742r(8.0f));
            } else {
                C29747c9 c29747c915 = this.f73157S0;
                if (c29747c915 == null) {
                    AbstractC19074t.m100223u("oldIntroBinding");
                    c29747c915 = null;
                }
                c29747c915.f137422y.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            C29747c9 c29747c916 = this.f73157S0;
            if (c29747c916 == null) {
                AbstractC19074t.m100223u("oldIntroBinding");
                c29747c916 = null;
            }
            c29747c916.f137414q.setIdTracking("e2ee_setting_upgrade_btn");
            C29747c9 c29747c917 = this.f73157S0;
            if (c29747c917 == null) {
                AbstractC19074t.m100223u("oldIntroBinding");
                c29747c917 = null;
            }
            c29747c917.f137414q.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.xb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    E2EESettingView.m79314zM(E2EESettingView.this, view);
                }
            });
            C29747c9 c29747c918 = this.f73157S0;
            if (c29747c918 == null) {
                AbstractC19074t.m100223u("oldIntroBinding");
            } else {
                c29747c9 = c29747c918;
            }
            c29747c9.f137421x.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.yb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    E2EESettingView.m79284AM(E2EESettingView.this, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zM */
    public static final void m79314zM(E2EESettingView e2EESettingView, View view) {
        AbstractC19074t.m100208f(e2EESettingView, "this$0");
        e2EESettingView.m79309uM();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        String str;
        super.mo37111CJ(bundle);
        Bundle m92642L3 = m92642L3();
        String str2 = null;
        if (m92642L3 != null) {
            str = m92642L3.getString("KEY_OWNER_ID");
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        this.f73151M0 = str;
        boolean m132079d = AbstractC25495a.m132079d(str);
        this.f73152N0 = m132079d;
        boolean z11 = false;
        if (m132079d) {
            C0943w c0943w = C0943w.f3447a;
            String str3 = this.f73151M0;
            if (str3 == null) {
                AbstractC19074t.m100223u("ownerId");
            } else {
                str2 = str3;
            }
            C31973j5 m4472f = c0943w.m4472f(str2);
            if (m4472f != null) {
                z11 = m4472f.m153742T();
            }
            this.f73153O0 = z11;
            return;
        }
        if (!AbstractC0924m0.m3745d9()) {
            String str4 = this.f73151M0;
            if (str4 == null) {
                AbstractC19074t.m100223u("ownerId");
            } else {
                str2 = str4;
            }
            if (!AbstractC21935u.m114555v(str2, false)) {
                ToastUtils.m89266n(AbstractC8020f0.str_imp_alias_unsupport, new Object[0]);
                finish();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i11;
        AbstractC29723b3 abstractC29723b3;
        AbstractC29723b3 abstractC29723b32;
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        AbstractC29723b3 m147754Q = AbstractC29723b3.m147754Q(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m147754Q, "inflate(...)");
        this.f73155Q0 = m147754Q;
        AbstractC29723b3 abstractC29723b33 = null;
        if (m147754Q == null) {
            AbstractC19074t.m100223u("rootBinding");
            m147754Q = null;
        }
        m147754Q.f137295Q.m8572k(new ViewStub.OnInflateListener() { // from class: com.zing.zalo.ui.zviews.rb
            @Override // android.view.ViewStub.OnInflateListener
            public final void onInflate(ViewStub viewStub, View view) {
                E2EESettingView.m79306qM(E2EESettingView.this, viewStub, view);
            }
        });
        AbstractC29723b3 abstractC29723b34 = this.f73155Q0;
        if (abstractC29723b34 == null) {
            AbstractC19074t.m100223u("rootBinding");
            abstractC29723b34 = null;
        }
        abstractC29723b34.f137296R.m8572k(new ViewStub.OnInflateListener() { // from class: com.zing.zalo.ui.zviews.sb
            @Override // android.view.ViewStub.OnInflateListener
            public final void onInflate(ViewStub viewStub, View view) {
                E2EESettingView.m79307rM(E2EESettingView.this, viewStub, view);
            }
        });
        AbstractC29723b3 abstractC29723b35 = this.f73155Q0;
        if (abstractC29723b35 == null) {
            AbstractC19074t.m100223u("rootBinding");
            abstractC29723b35 = null;
        }
        abstractC29723b35.f137294P.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.tb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                E2EESettingView.m79308sM(E2EESettingView.this, view);
            }
        });
        Object context = getContext();
        if (context instanceof InterfaceC27218a) {
            InterfaceC27218a interfaceC27218a = (InterfaceC27218a) context;
            if (!interfaceC27218a.mo35576n3() && !interfaceC27218a.mo35586v2()) {
                AbstractC29723b3 abstractC29723b36 = this.f73155Q0;
                if (abstractC29723b36 == null) {
                    AbstractC19074t.m100223u("rootBinding");
                    abstractC29723b36 = null;
                }
                i11 = AbstractC32226c.m155409h(abstractC29723b36.getRoot());
                abstractC29723b3 = this.f73155Q0;
                if (abstractC29723b3 == null) {
                    AbstractC19074t.m100223u("rootBinding");
                    abstractC29723b3 = null;
                }
                abstractC29723b3.getRoot().setPadding(0, i11, 0, 0);
                abstractC29723b32 = this.f73155Q0;
                if (abstractC29723b32 != null) {
                    AbstractC19074t.m100223u("rootBinding");
                } else {
                    abstractC29723b33 = abstractC29723b32;
                }
                View root = abstractC29723b33.getRoot();
                AbstractC19074t.m100207e(root, "getRoot(...)");
                return root;
            }
        }
        i11 = 0;
        abstractC29723b3 = this.f73155Q0;
        if (abstractC29723b3 == null) {
        }
        abstractC29723b3.getRoot().setPadding(0, i11, 0, 0);
        abstractC29723b32 = this.f73155Q0;
        if (abstractC29723b32 != null) {
        }
        View root2 = abstractC29723b33.getRoot();
        AbstractC19074t.m100207e(root2, "getRoot(...)");
        return root2;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        String str;
        super.mo37484JJ();
        int i11 = this.f73160V0;
        if (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) {
            if (this.f73152N0) {
                str = "2";
            } else {
                str = "1";
            }
            C2526d c2526d = C2526d.f10270a;
            String str2 = this.f73151M0;
            if (str2 == null) {
                AbstractC19074t.m100223u("ownerId");
                str2 = null;
            }
            c2526d.m12722o(str2, str, this.f73159U0, this.f73160V0);
        }
        C23744a.Companion.m124119a().m124117e(this, 152);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        C23744a.Companion.m124119a().m124115b(this, 152);
        if (!mo60294yp()) {
            m79311wM(this, 0, 0, null, 7, null);
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "E2EESettingView";
    }

    /* renamed from: tM */
    public void m79315tM() {
        AbstractC28207v1.m141994i3("action.open.inapp", 3, m92676n2(), this, AbstractC23306f.m120583H().m110204g().f110088w, null);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        boolean z11;
        Object m131364L;
        Integer num;
        final int i12;
        Object m131364L2;
        Integer num2;
        Object m131364L3;
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 == 152) {
            try {
                final int i13 = 0;
                if (objArr.length == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    String valueOf = String.valueOf(objArr[0]);
                    String str = this.f73151M0;
                    final int[] iArr = null;
                    if (str == null) {
                        AbstractC19074t.m100223u("ownerId");
                        str = null;
                    }
                    if (AbstractC19074t.m100204b(str, valueOf)) {
                        m131364L = AbstractC25358n.m131364L(objArr, 1);
                        if (m131364L instanceof Integer) {
                            num = (Integer) m131364L;
                        } else {
                            num = null;
                        }
                        if (num != null) {
                            i12 = num.intValue();
                        } else {
                            i12 = 0;
                        }
                        m131364L2 = AbstractC25358n.m131364L(objArr, 2);
                        if (m131364L2 instanceof Integer) {
                            num2 = (Integer) m131364L2;
                        } else {
                            num2 = null;
                        }
                        if (num2 != null) {
                            i13 = num2.intValue();
                        }
                        m131364L3 = AbstractC25358n.m131364L(objArr, 3);
                        if (m131364L3 instanceof int[]) {
                            iArr = (int[]) m131364L3;
                        }
                        mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.qb
                            @Override // java.lang.Runnable
                            public final void run() {
                                E2EESettingView.m79304oM(E2EESettingView.this, i12, i13, iArr);
                            }
                        });
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }
}
