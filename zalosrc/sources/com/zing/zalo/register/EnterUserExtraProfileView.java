package com.zing.zalo.register;

import ae.C0766k;
import am.AbstractC0924m0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.register.EnterUserExtraProfileView;
import com.zing.zalo.register.bottomsheet.RegisterLayoutBottomSheet;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zdesign.component.inputfield.EditText;
import com.zing.zalo.zview.AbstractC17484n;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import cz.C17667v0;
import cz.C17670w0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.Callable;
import me0.AbstractC23136l9;
import me0.AbstractC23153n4;
import me0.AbstractC23216t1;
import org.json.JSONObject;
import p140ev.C18613b;
import p248iy.AbstractC20887g;
import p649xl.C29885k3;
import pm0.C24848g0;

/* loaded from: classes4.dex */
public final class EnterUserExtraProfileView extends SlidableZaloView {
    public static final C9294a Companion = new C9294a(null);

    /* renamed from: P0 */
    private C29885k3 f49275P0;

    /* renamed from: Q0 */
    private final Calendar f49276Q0;

    /* renamed from: R0 */
    private int f49277R0;

    /* renamed from: S0 */
    private int f49278S0;

    /* renamed from: T0 */
    private int f49279T0;

    /* renamed from: U0 */
    private int f49280U0;

    /* renamed from: V0 */
    private boolean f49281V0;

    /* renamed from: W0 */
    private JSONObject f49282W0;

    /* renamed from: X0 */
    private String f49283X0;

    /* renamed from: Y0 */
    private String f49284Y0;

    /* renamed from: Z0 */
    private String f49285Z0;

    /* renamed from: a1 */
    private JSONObject f49286a1;

    /* renamed from: b1 */
    private String f49287b1;

    /* renamed from: c1 */
    private int f49288c1;

    /* renamed from: d1 */
    private String f49289d1;

    /* renamed from: e1 */
    private int f49290e1;

    /* renamed from: f1 */
    private int f49291f1;

    /* renamed from: g1 */
    private boolean f49292g1;

    /* renamed from: com.zing.zalo.register.EnterUserExtraProfileView$a */
    /* loaded from: classes4.dex */
    public static final class C9294a {
        private C9294a() {
        }

        public /* synthetic */ C9294a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.register.EnterUserExtraProfileView$b */
    /* loaded from: classes4.dex */
    public static final class C9295b implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ String f49294b;

        /* renamed from: c */
        final /* synthetic */ int f49295c;

        C9295b(String str, int i11) {
            this.f49294b = str;
            this.f49295c = i11;
        }

        /* renamed from: i */
        public static final void m49847i(EnterUserExtraProfileView enterUserExtraProfileView) {
            AbstractC19074t.m100208f(enterUserExtraProfileView, "this$0");
            C29885k3 c29885k3 = enterUserExtraProfileView.f49275P0;
            if (c29885k3 == null) {
                AbstractC19074t.m100223u("binding");
                c29885k3 = null;
            }
            c29885k3.f138454r.setClickable(true);
            enterUserExtraProfileView.m78954jL();
            enterUserExtraProfileView.showDialog(1);
        }

        /* renamed from: j */
        public static final Void m49848j(EnterUserExtraProfileView enterUserExtraProfileView) {
            AbstractC19074t.m100208f(enterUserExtraProfileView, "this$0");
            enterUserExtraProfileView.mo70710wy(new Runnable() { // from class: cz.r0
                public /* synthetic */ RunnableC17655r0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    EnterUserExtraProfileView.C9295b.m49849k(EnterUserExtraProfileView.this);
                }
            });
            return null;
        }

        /* renamed from: k */
        public static final void m49849k(EnterUserExtraProfileView enterUserExtraProfileView) {
            AbstractC19074t.m100208f(enterUserExtraProfileView, "this$0");
            C29885k3 c29885k3 = enterUserExtraProfileView.f49275P0;
            if (c29885k3 == null) {
                AbstractC19074t.m100223u("binding");
                c29885k3 = null;
            }
            c29885k3.f138454r.setClickable(true);
        }

        /* renamed from: l */
        public static final void m49850l(EnterUserExtraProfileView enterUserExtraProfileView) {
            AbstractC19074t.m100208f(enterUserExtraProfileView, "this$0");
            C29885k3 c29885k3 = enterUserExtraProfileView.f49275P0;
            if (c29885k3 == null) {
                AbstractC19074t.m100223u("binding");
                c29885k3 = null;
            }
            c29885k3.f138454r.setClickable(true);
        }

        /* renamed from: m */
        public static final void m49851m(EnterUserExtraProfileView enterUserExtraProfileView, String str) {
            AbstractC19074t.m100208f(enterUserExtraProfileView, "this$0");
            AbstractC19074t.m100205c(str);
            if (str.length() > 0) {
                ToastUtils.m89276x(enterUserExtraProfileView, str);
            }
        }

        /* renamed from: n */
        public static final void m49852n(C20096c c20096c, EnterUserExtraProfileView enterUserExtraProfileView) {
            Integer num;
            AbstractC19074t.m100208f(enterUserExtraProfileView, "this$0");
            String str = null;
            if (c20096c != null) {
                num = Integer.valueOf(c20096c.m104491c());
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 2003) {
                enterUserExtraProfileView.m92639EK(2, c20096c.m104492d());
                return;
            }
            if (c20096c != null) {
                str = c20096c.m104492d();
            }
            ToastUtils.m89276x(enterUserExtraProfileView, str);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            EnterUserExtraProfileView.this.m49837RM(false);
            EnterUserExtraProfileView.this.m78954jL();
            EnterUserExtraProfileView enterUserExtraProfileView = EnterUserExtraProfileView.this;
            enterUserExtraProfileView.mo70710wy(new Runnable() { // from class: cz.m0
                public /* synthetic */ RunnableC17635m0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    EnterUserExtraProfileView.C9295b.m49850l(EnterUserExtraProfileView.this);
                }
            });
            EnterUserExtraProfileView enterUserExtraProfileView2 = EnterUserExtraProfileView.this;
            if (AbstractC23216t1.m119643h(enterUserExtraProfileView2.f72421L0, c20096c, new AbstractC23216t1.d() { // from class: cz.n0
                public /* synthetic */ C17639n0() {
                }

                @Override // me0.AbstractC23216t1.d
                /* renamed from: a */
                public final void mo68088a(String str) {
                    EnterUserExtraProfileView.C9295b.m49851m(EnterUserExtraProfileView.this, str);
                }
            })) {
                return;
            }
            EnterUserExtraProfileView enterUserExtraProfileView3 = EnterUserExtraProfileView.this;
            enterUserExtraProfileView3.mo70710wy(new Runnable() { // from class: cz.o0

                /* renamed from: q */
                public final /* synthetic */ EnterUserExtraProfileView f89631q;

                public /* synthetic */ RunnableC17643o0(EnterUserExtraProfileView enterUserExtraProfileView32) {
                    r2 = enterUserExtraProfileView32;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    EnterUserExtraProfileView.C9295b.m49852n(C20096c.this, r2);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            String str;
            JSONObject jSONObject;
            JSONObject jSONObject2;
            EnterUserExtraProfileView.this.m49837RM(false);
            try {
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                EnterUserExtraProfileView enterUserExtraProfileView = EnterUserExtraProfileView.this;
                String str2 = "";
                C24848g0 c24848g0 = null;
                if (optJSONObject != null) {
                    str = optJSONObject.optString("sessionToken", "");
                } else {
                    str = null;
                }
                if (str != null) {
                    str2 = str;
                }
                enterUserExtraProfileView.m49838SM(str2);
                long j11 = 0;
                if (optJSONObject != null) {
                    j11 = optJSONObject.optLong("sessionTTL", 0L);
                }
                EnterUserExtraProfileView enterUserExtraProfileView2 = EnterUserExtraProfileView.this;
                if (optJSONObject != null) {
                    jSONObject = optJSONObject.optJSONObject("forceGuardian");
                } else {
                    jSONObject = null;
                }
                enterUserExtraProfileView2.m49836PM(jSONObject);
                try {
                    jSONObject2 = new JSONObject(AbstractC0924m0.m4066o0());
                } catch (Exception unused) {
                    jSONObject2 = new JSONObject();
                }
                jSONObject2.put("token_birthday", EnterUserExtraProfileView.this.m49835DM());
                jSONObject2.put("timeout_token_birthday", System.currentTimeMillis() + j11);
                jSONObject2.put("day_of_birth", this.f49294b);
                jSONObject2.put("gender", this.f49295c);
                JSONObject m49840zM = EnterUserExtraProfileView.this.m49840zM();
                if (m49840zM != null) {
                    EnterUserExtraProfileView enterUserExtraProfileView3 = EnterUserExtraProfileView.this;
                    C17670w0 c17670w0 = C17670w0.f89662a;
                    c17670w0.m93656h(m49840zM.optInt("range_age", c17670w0.m93649a()));
                    jSONObject2.put("force_guardian", String.valueOf(enterUserExtraProfileView3.m49840zM()));
                    AbstractC0924m0.m3691bf(jSONObject2.toString());
                    enterUserExtraProfileView3.mo70710wy(new Runnable() { // from class: cz.p0
                        public /* synthetic */ RunnableC17647p0() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            EnterUserExtraProfileView.C9295b.m49847i(EnterUserExtraProfileView.this);
                        }
                    });
                    c24848g0 = C24848g0.f119245a;
                }
                if (c24848g0 == null) {
                    EnterUserExtraProfileView enterUserExtraProfileView4 = EnterUserExtraProfileView.this;
                    String str3 = this.f49294b;
                    int i11 = this.f49295c;
                    AbstractC0924m0.m3691bf(jSONObject2.toString());
                    AbstractC0924m0.m2972Cm(5);
                    AbstractC23153n4.m119141o(enterUserExtraProfileView4, enterUserExtraProfileView4.m49833BM(), enterUserExtraProfileView4.m49835DM(), enterUserExtraProfileView4.m49834CM(), enterUserExtraProfileView4.m49839yM(), str3, i11, enterUserExtraProfileView4.m49832AM(), new Callable() { // from class: cz.q0
                        public /* synthetic */ CallableC17651q0() {
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            Void m49848j;
                            m49848j = EnterUserExtraProfileView.C9295b.m49848j(EnterUserExtraProfileView.this);
                            return m49848j;
                        }
                    });
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public EnterUserExtraProfileView() {
        Calendar calendar = Calendar.getInstance();
        this.f49276Q0 = calendar;
        this.f49277R0 = calendar.get(5);
        this.f49278S0 = calendar.get(2) + 1;
        this.f49279T0 = calendar.get(1);
        this.f49280U0 = -1;
        this.f49282W0 = new JSONObject();
        this.f49283X0 = "";
        this.f49284Y0 = "";
        this.f49285Z0 = "";
        this.f49287b1 = "";
        this.f49289d1 = "";
        this.f49290e1 = -1;
        this.f49291f1 = -1;
    }

    /* renamed from: EM */
    private final void m49801EM() {
        C29885k3 c29885k3 = this.f49275P0;
        C29885k3 c29885k32 = null;
        if (c29885k3 == null) {
            AbstractC19074t.m100223u("binding");
            c29885k3 = null;
        }
        RelativeLayout root = c29885k3.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        root.setPadding(root.getPaddingLeft(), AbstractC17484n.Companion.m92931b(), root.getPaddingRight(), root.getPaddingBottom());
        C29885k3 c29885k33 = this.f49275P0;
        if (c29885k33 == null) {
            AbstractC19074t.m100223u("binding");
            c29885k33 = null;
        }
        c29885k33.f138453q.setOnClickListener(new View.OnClickListener() { // from class: cz.g0
            public /* synthetic */ ViewOnClickListenerC17611g0() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EnterUserExtraProfileView.m49802FM(EnterUserExtraProfileView.this, view);
            }
        });
        C29885k3 c29885k34 = this.f49275P0;
        if (c29885k34 == null) {
            AbstractC19074t.m100223u("binding");
            c29885k34 = null;
        }
        c29885k34.f138455s.getEditText().setOnClickListener(new View.OnClickListener() { // from class: cz.h0
            public /* synthetic */ ViewOnClickListenerC17615h0() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EnterUserExtraProfileView.m49803GM(EnterUserExtraProfileView.this, view);
            }
        });
        C29885k3 c29885k35 = this.f49275P0;
        if (c29885k35 == null) {
            AbstractC19074t.m100223u("binding");
            c29885k35 = null;
        }
        c29885k35.f138456t.getEditText().setOnClickListener(new View.OnClickListener() { // from class: cz.i0
            public /* synthetic */ ViewOnClickListenerC17619i0() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EnterUserExtraProfileView.m49804HM(EnterUserExtraProfileView.this, view);
            }
        });
        C29885k3 c29885k36 = this.f49275P0;
        if (c29885k36 == null) {
            AbstractC19074t.m100223u("binding");
            c29885k36 = null;
        }
        c29885k36.f138454r.setOnClickListener(new View.OnClickListener() { // from class: cz.j0
            public /* synthetic */ ViewOnClickListenerC17623j0() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EnterUserExtraProfileView.m49805IM(EnterUserExtraProfileView.this, view);
            }
        });
        if (this.f49290e1 != -1) {
            m49810NM();
            m49811OM();
            C29885k3 c29885k37 = this.f49275P0;
            if (c29885k37 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29885k32 = c29885k37;
            }
            c29885k32.f138455s.getEditText().setEnabled(false);
        }
        int i11 = this.f49291f1;
        if (i11 != -1) {
            this.f49280U0 = i11;
            m49812QM();
        }
    }

    /* renamed from: FM */
    public static final void m49802FM(EnterUserExtraProfileView enterUserExtraProfileView, View view) {
        AbstractC19074t.m100208f(enterUserExtraProfileView, "this$0");
        AbstractC20887g.m109217D(510062, null, 2, null);
        if (enterUserExtraProfileView.m49806JM()) {
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_DISPLAY_NAME", enterUserExtraProfileView.f49289d1);
            bundle.putInt("SHOW_WITH_FLAGS", 67108864);
            C17487o0 m92662fJ = enterUserExtraProfileView.m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.m93069k2(UserNamingView.class, bundle, 0, true);
                return;
            }
            return;
        }
        C17667v0.f89659a.m93647d(enterUserExtraProfileView.m92676n2());
        enterUserExtraProfileView.finish();
    }

    /* renamed from: GM */
    public static final void m49803GM(EnterUserExtraProfileView enterUserExtraProfileView, View view) {
        AbstractC19074t.m100208f(enterUserExtraProfileView, "this$0");
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_SELECTED_DAY", enterUserExtraProfileView.f49277R0);
        bundle.putInt("EXTRA_SELECTED_MONTH", enterUserExtraProfileView.f49278S0);
        bundle.putInt("EXTRA_SELECTED_YEAR", enterUserExtraProfileView.f49279T0);
        bundle.putInt("EXTRA_BOTTOM_SHEET_TAG", 2);
        C17487o0 m92662fJ = enterUserExtraProfileView.m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93066i2(RegisterLayoutBottomSheet.class, bundle, 2, 1, true);
        }
    }

    /* renamed from: HM */
    public static final void m49804HM(EnterUserExtraProfileView enterUserExtraProfileView, View view) {
        AbstractC19074t.m100208f(enterUserExtraProfileView, "this$0");
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_SELECTED_GENDER", enterUserExtraProfileView.f49280U0);
        bundle.putInt("EXTRA_BOTTOM_SHEET_TAG", 3);
        C17487o0 m92662fJ = enterUserExtraProfileView.m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93066i2(RegisterLayoutBottomSheet.class, bundle, 3, 1, true);
        }
    }

    /* renamed from: IM */
    public static final void m49805IM(EnterUserExtraProfileView enterUserExtraProfileView, View view) {
        AbstractC19074t.m100208f(enterUserExtraProfileView, "this$0");
        enterUserExtraProfileView.m49813TM(enterUserExtraProfileView.f49277R0 + "/" + enterUserExtraProfileView.f49278S0 + "/" + enterUserExtraProfileView.f49279T0, enterUserExtraProfileView.f49280U0);
    }

    /* renamed from: JM */
    private final boolean m49806JM() {
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ == null || m92662fJ.m93018M0() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: KM */
    public static final Void m49807KM(EnterUserExtraProfileView enterUserExtraProfileView) {
        AbstractC19074t.m100208f(enterUserExtraProfileView, "this$0");
        enterUserExtraProfileView.mo70710wy(new Runnable() { // from class: cz.l0
            public /* synthetic */ RunnableC17631l0() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                EnterUserExtraProfileView.m49808LM(EnterUserExtraProfileView.this);
            }
        });
        return null;
    }

    /* renamed from: LM */
    public static final void m49808LM(EnterUserExtraProfileView enterUserExtraProfileView) {
        AbstractC19074t.m100208f(enterUserExtraProfileView, "this$0");
        C29885k3 c29885k3 = enterUserExtraProfileView.f49275P0;
        if (c29885k3 == null) {
            AbstractC19074t.m100223u("binding");
            c29885k3 = null;
        }
        c29885k3.f138454r.setClickable(true);
    }

    /* renamed from: MM */
    public static final void m49809MM(EnterUserExtraProfileView enterUserExtraProfileView) {
        AbstractC19074t.m100208f(enterUserExtraProfileView, "this$0");
        C29885k3 c29885k3 = enterUserExtraProfileView.f49275P0;
        if (c29885k3 == null) {
            AbstractC19074t.m100223u("binding");
            c29885k3 = null;
        }
        c29885k3.f138454r.setClickable(false);
    }

    /* renamed from: NM */
    private final void m49810NM() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(this.f49290e1 * 1000));
        this.f49277R0 = calendar.get(5);
        this.f49278S0 = calendar.get(2) + 1;
        this.f49279T0 = calendar.get(1);
    }

    /* renamed from: OM */
    private final void m49811OM() {
        this.f49281V0 = true;
        C29885k3 c29885k3 = this.f49275P0;
        C29885k3 c29885k32 = null;
        if (c29885k3 == null) {
            AbstractC19074t.m100223u("binding");
            c29885k3 = null;
        }
        c29885k3.f138455s.getEditText().setText(this.f49277R0 + "/" + this.f49278S0 + "/" + this.f49279T0);
        C29885k3 c29885k33 = this.f49275P0;
        if (c29885k33 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29885k32 = c29885k33;
        }
        c29885k32.f138454r.setEnabled(m49825rM());
    }

    /* renamed from: QM */
    private final void m49812QM() {
        String m118743r0;
        C29885k3 c29885k3 = this.f49275P0;
        C29885k3 c29885k32 = null;
        if (c29885k3 == null) {
            AbstractC19074t.m100223u("binding");
            c29885k3 = null;
        }
        EditText editText = c29885k3.f138456t.getEditText();
        int i11 = this.f49280U0;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_register_enter_extra_profile_item_gender_title);
                } else {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.f43868x63f71d93);
                }
            } else {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_register_enter_extra_profile_select_gender_item_female);
            }
        } else {
            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_register_enter_extra_profile_select_gender_item_male);
        }
        editText.setText(m118743r0);
        C29885k3 c29885k33 = this.f49275P0;
        if (c29885k33 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29885k32 = c29885k33;
        }
        c29885k32.f138454r.setEnabled(m49825rM());
    }

    /* renamed from: TM */
    private final void m49813TM(String str, int i11) {
        if (this.f49292g1) {
            m78946bM(AbstractC23136l9.m118743r0(AbstractC8020f0.str_in_progress), Boolean.FALSE);
            return;
        }
        this.f49292g1 = true;
        C29885k3 c29885k3 = this.f49275P0;
        if (c29885k3 == null) {
            AbstractC19074t.m100223u("binding");
            c29885k3 = null;
        }
        c29885k3.f138454r.setClickable(false);
        m78946bM(AbstractC23136l9.m118743r0(AbstractC8020f0.str_in_progress), Boolean.FALSE);
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C9295b(str, i11));
        c0766k.mo1540T6(this.f49283X0, AbstractC23153n4.m119147r(), this.f49284Y0, str, i11);
    }

    /* renamed from: rM */
    private final boolean m49825rM() {
        return this.f49280U0 != -1 && this.f49281V0;
    }

    /* renamed from: sM */
    private final boolean m49826sM() {
        if (m49831xM(this.f49279T0, this.f49278S0, this.f49277R0) < 18) {
            return true;
        }
        return false;
    }

    /* renamed from: tM */
    private final KeyEventCallbackC17462c m49827tM() {
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        C16972e0.a aVar = new C16972e0.a(m92689tK);
        aVar.m90932i(C16972e0.b.DIALOG_INFORMATION);
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_register_provide_guardian_information_title);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        aVar.m90918B(m118743r0);
        String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_register_provide_guardian_information_description, Integer.valueOf(C17670w0.f89662a.m93649a()));
        AbstractC19074t.m100207e(m118746s0, "getString(...)");
        aVar.m90949z(m118746s0);
        aVar.m90922F(true);
        aVar.m90935l(AbstractC2814h.ButtonMedium_TertiaryNeutral);
        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_register_provide_guardian_information_negative_button);
        AbstractC19074t.m100207e(m118743r02, "getString(...)");
        aVar.m90934k(m118743r02, new InterfaceC17463d.d() { // from class: cz.c0
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                EnterUserExtraProfileView.m49828uM(interfaceC17463d, i11);
            }
        });
        aVar.m90945v(AbstractC2814h.ButtonMedium_Tertiary);
        String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_register_provide_guardian_information_positive_button);
        AbstractC19074t.m100207e(m118743r03, "getString(...)");
        aVar.m90943t(m118743r03, new InterfaceC17463d.d() { // from class: cz.d0
            public /* synthetic */ C17599d0() {
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                EnterUserExtraProfileView.m49829vM(EnterUserExtraProfileView.this, interfaceC17463d, i11);
            }
        });
        return aVar.m90927d();
    }

    /* renamed from: uM */
    public static final void m49828uM(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
    }

    /* renamed from: vM */
    public static final void m49829vM(EnterUserExtraProfileView enterUserExtraProfileView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(enterUserExtraProfileView, "this$0");
        interfaceC17463d.dismiss();
        JSONObject jSONObject = enterUserExtraProfileView.f49286a1;
        if (jSONObject != null) {
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_WEB_URL", jSONObject.getString("secureUrl"));
            bundle.putSerializable("EXTRA_FEATURE_ID", C18613b.f93606y);
            enterUserExtraProfileView.mo70710wy(new Runnable() { // from class: cz.k0

                /* renamed from: q */
                public final /* synthetic */ Bundle f89613q;

                public /* synthetic */ RunnableC17627k0(Bundle bundle2) {
                    r2 = bundle2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    EnterUserExtraProfileView.m49830wM(EnterUserExtraProfileView.this, r2);
                }
            });
        }
    }

    /* renamed from: wM */
    public static final void m49830wM(EnterUserExtraProfileView enterUserExtraProfileView, Bundle bundle) {
        AbstractC19074t.m100208f(enterUserExtraProfileView, "this$0");
        AbstractC19074t.m100208f(bundle, "$bundle");
        C17487o0 m92662fJ = enterUserExtraProfileView.m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93066i2(H5EkycView.class, bundle, 1, 1, true);
        }
    }

    /* renamed from: xM */
    private final int m49831xM(int i11, int i12, int i13) {
        Date date;
        try {
            date = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).parse(i13 + "/" + i12 + "/" + i11);
        } catch (Exception e11) {
            e11.printStackTrace();
            date = null;
        }
        if (date == null) {
            return 0;
        }
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(calendar.get(1), calendar.get(2) + 1, calendar.get(5));
        int i14 = calendar2.get(1) - calendar.get(1);
        if (calendar2.get(2) < calendar.get(2) || calendar2.get(6) < calendar.get(6)) {
            return i14 - 1;
        }
        return i14;
    }

    /* renamed from: AM */
    public final String m49832AM() {
        return this.f49287b1;
    }

    /* renamed from: BM */
    public final String m49833BM() {
        return this.f49283X0;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            String string = m92642L3.getString("EXTRA_PHONE_NUMBER", "");
            AbstractC19074t.m100207e(string, "getString(...)");
            this.f49283X0 = string;
            String string2 = m92642L3.getString("EXTRA_SESSION_TOKEN", "");
            AbstractC19074t.m100207e(string2, "getString(...)");
            this.f49284Y0 = string2;
            this.f49288c1 = m92642L3.getInt("EXTRA_RENEW_ACCOUNT", 0);
            String string3 = m92642L3.getString("EXTRA_DISPLAY_NAME", "");
            AbstractC19074t.m100207e(string3, "getString(...)");
            this.f49289d1 = string3;
            String string4 = m92642L3.getString("EXTRA_E_KYC_INFO");
            if (string4 != null && string4.length() != 0) {
                JSONObject jSONObject = new JSONObject(string4);
                this.f49282W0 = jSONObject;
                this.f49291f1 = jSONObject.optInt("gender", -1);
                this.f49290e1 = jSONObject.optInt("dob", -1);
            }
        }
    }

    /* renamed from: CM */
    public final int m49834CM() {
        return this.f49288c1;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        return mo49769EJ(i11, null);
    }

    /* renamed from: DM */
    public final String m49835DM() {
        return this.f49285Z0;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: EJ */
    public KeyEventCallbackC17462c mo49769EJ(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "objects");
        super.mo49769EJ(i11, Arrays.copyOf(objArr, objArr.length));
        if (i11 != 1) {
            if (i11 != 2) {
                return null;
            }
            C17667v0 c17667v0 = C17667v0.f89659a;
            Object obj = objArr[0];
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.String");
            return c17667v0.m93646b(this, (String) obj);
        }
        return m49827tM();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29885k3 m148152c = C29885k3.m148152c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148152c, "inflate(...)");
        this.f49275P0 = m148152c;
        m49801EM();
        C29885k3 c29885k3 = this.f49275P0;
        if (c29885k3 == null) {
            AbstractC19074t.m100223u("binding");
            c29885k3 = null;
        }
        RelativeLayout root = c29885k3.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    /* renamed from: PM */
    public final void m49836PM(JSONObject jSONObject) {
        this.f49286a1 = jSONObject;
    }

    /* renamed from: RM */
    public final void m49837RM(boolean z11) {
        this.f49292g1 = z11;
    }

    /* renamed from: SM */
    public final void m49838SM(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f49285Z0 = str;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "EnterUserNumberPhoneView";
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        String str;
        super.onActivityResult(i11, i12, intent);
        if (i11 == 2 && i12 == -1 && intent != null) {
            this.f49277R0 = intent.getIntExtra("EXTRA_SELECTED_DAY", this.f49276Q0.get(5));
            this.f49278S0 = intent.getIntExtra("EXTRA_SELECTED_MONTH", this.f49276Q0.get(2) + 1);
            this.f49279T0 = intent.getIntExtra("EXTRA_SELECTED_YEAR", this.f49276Q0.get(1));
            C19067n0 c19067n0 = C19067n0.f94947a;
            Object[] objArr = new Object[1];
            if (m49826sM()) {
                str = "1";
            } else {
                str = "0";
            }
            objArr[0] = str;
            String format = String.format("{age_range : %s}", Arrays.copyOf(objArr, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            AbstractC20887g.m109248z(510060, format);
            m49811OM();
            return;
        }
        if (i11 == 3 && i12 == -1 && intent != null) {
            int intExtra = intent.getIntExtra("EXTRA_SELECTED_GENDER", -1);
            this.f49280U0 = intExtra;
            C19067n0 c19067n02 = C19067n0.f94947a;
            String format2 = String.format("{type : %s}", Arrays.copyOf(new Object[]{Integer.valueOf(intExtra)}, 1));
            AbstractC19074t.m100207e(format2, "format(...)");
            AbstractC20887g.m109248z(510061, format2);
            m49812QM();
            return;
        }
        if (i11 == 1 && i12 == -1 && intent != null) {
            this.f49287b1 = String.valueOf(intent.getStringExtra("EXTRA_GUARDIAN_TOKEN"));
            AbstractC0924m0.m2972Cm(5);
            mo70710wy(new Runnable() { // from class: cz.e0
                public /* synthetic */ RunnableC17603e0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    EnterUserExtraProfileView.m49809MM(EnterUserExtraProfileView.this);
                }
            });
            AbstractC23153n4.m119141o(this, this.f49283X0, this.f49285Z0, this.f49288c1, this.f49289d1, this.f49277R0 + "/" + this.f49278S0 + "/" + this.f49279T0, this.f49280U0, this.f49287b1, new Callable() { // from class: cz.f0
                public /* synthetic */ CallableC17607f0() {
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Void m49807KM;
                    m49807KM = EnterUserExtraProfileView.m49807KM(EnterUserExtraProfileView.this);
                    return m49807KM;
                }
            });
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4 && m49806JM()) {
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_DISPLAY_NAME", this.f49289d1);
            bundle.putInt("SHOW_WITH_FLAGS", 67108864);
            C17487o0 m92662fJ = m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.m93069k2(UserNamingView.class, bundle, 0, false);
            }
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    /* renamed from: yM */
    public final String m49839yM() {
        return this.f49289d1;
    }

    /* renamed from: zM */
    public final JSONObject m49840zM() {
        return this.f49286a1;
    }
}
