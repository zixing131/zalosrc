package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import am.AbstractC0924m0;
import am.C0943w;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.AbstractC2379w;
import b40.C2526d;
import c30.C3251l;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.adapters.C7005a5;
import com.zing.zalo.adapters.C7086h6;
import com.zing.zalo.adapters.C7163o6;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.lottie.LottieConfig;
import com.zing.zalo.p077ui.Cocos2dxAnimationActivity;
import com.zing.zalo.p077ui.showcase.C13306b;
import com.zing.zalo.p077ui.widget.RobotoEditText;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.ShareSayHiBoxView;
import com.zing.zalo.p077ui.zviews.share.ShareView;
import com.zing.zalo.zdesign.component.TooltipView;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import ed0.AbstractC18391a;
import gw.C19669z;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import me0.AbstractC23112j7;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.AbstractC23262x6;
import mm0.AbstractC23350e;
import nh0.C23793c;
import oc0.C24221a;
import org.json.JSONException;
import org.json.JSONObject;
import p056cj.C3547o;
import p142ey.C18635e;
import p142ey.C18644n;
import p207he.C20024r;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p485rj.C25809a;
import p485rj.C25810b;
import p494rv.C25979a;
import p716zh.C31973j5;
import qi0.C25297f;
import qi0.EnumC25293b;
import sx.C26406h;
import tg.C26657h;
import tg.C26674y;
import vg.AbstractC28025b8;
import vg.C28203u6;
import vg.C28212v6;
import zc0.C31784b;

/* loaded from: classes6.dex */
public class ShareSayHiBoxView extends BaseZaloView implements C7086h6.a, View.OnClickListener, InterfaceC0733x {

    /* renamed from: A1 */
    static final int f77762A1 = AbstractC23136l9.m118742r(10.0f);

    /* renamed from: B1 */
    static final int f77763B1 = AbstractC23136l9.m118742r(6.0f);

    /* renamed from: C1 */
    static final int f77764C1 = AbstractC23136l9.m118742r(3.0f);

    /* renamed from: N0 */
    View f77766N0;

    /* renamed from: O0 */
    RobotoTextView f77767O0;

    /* renamed from: P0 */
    RecyclerView f77768P0;

    /* renamed from: Q0 */
    C7163o6 f77769Q0;

    /* renamed from: T0 */
    View f77772T0;

    /* renamed from: U0 */
    View f77773U0;

    /* renamed from: V0 */
    View f77774V0;

    /* renamed from: W0 */
    View f77775W0;

    /* renamed from: b1 */
    RecyclerView f77780b1;

    /* renamed from: c1 */
    C7005a5 f77781c1;

    /* renamed from: d1 */
    ImageView f77782d1;

    /* renamed from: e1 */
    RobotoEditText f77783e1;

    /* renamed from: f1 */
    RecyclerView f77784f1;

    /* renamed from: g1 */
    LinearLayoutManager f77785g1;

    /* renamed from: h1 */
    C7086h6 f77786h1;

    /* renamed from: i1 */
    ArrayList f77787i1;

    /* renamed from: m1 */
    C3547o f77791m1;

    /* renamed from: x1 */
    View f77802x1;

    /* renamed from: y1 */
    C26674y.b f77803y1;

    /* renamed from: M0 */
    final String f77765M0 = MainApplication.getAppContext().getString(AbstractC8020f0.str_alphabe);

    /* renamed from: R0 */
    boolean f77770R0 = false;

    /* renamed from: S0 */
    int f77771S0 = 0;

    /* renamed from: X0 */
    int[] f77776X0 = new int[2];

    /* renamed from: Y0 */
    int[] f77777Y0 = new int[2];

    /* renamed from: Z0 */
    final int f77778Z0 = AbstractC23136l9.m118742r(58.0f);

    /* renamed from: a1 */
    boolean f77779a1 = true;

    /* renamed from: j1 */
    List f77788j1 = new ArrayList();

    /* renamed from: k1 */
    List f77789k1 = new ArrayList();

    /* renamed from: l1 */
    Map f77790l1 = new HashMap();

    /* renamed from: n1 */
    private C24221a f77792n1 = new C24221a();

    /* renamed from: o1 */
    HashMap f77793o1 = new HashMap();

    /* renamed from: p1 */
    private final List f77794p1 = new ArrayList();

    /* renamed from: q1 */
    private final List f77795q1 = new ArrayList();

    /* renamed from: r1 */
    C13306b f77796r1 = null;

    /* renamed from: s1 */
    TooltipView f77797s1 = null;

    /* renamed from: t1 */
    boolean f77798t1 = false;

    /* renamed from: u1 */
    ViewTreeObserver.OnGlobalLayoutListener f77799u1 = new ViewTreeObserverOnGlobalLayoutListenerC15081e();

    /* renamed from: v1 */
    Map f77800v1 = new HashMap();

    /* renamed from: w1 */
    List f77801w1 = new ArrayList();

    /* renamed from: z1 */
    String f77804z1 = "";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.ShareSayHiBoxView$a */
    /* loaded from: classes6.dex */
    public class C15077a implements C7163o6.b {
        C15077a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m84413e(View view) {
            ShareSayHiBoxView.this.m84396mM(view);
        }

        @Override // com.zing.zalo.adapters.C7163o6.b
        /* renamed from: a */
        public void mo36451a(int i11) {
            try {
                AbstractC2379w.m12430d(ShareSayHiBoxView.this.f77783e1);
                ShareSayHiBoxView.this.f77769Q0.m36450V(i11);
                ShareSayHiBoxView.this.f77769Q0.m10008p();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.adapters.C7163o6.b
        /* renamed from: b */
        public void mo36452b(final View view) {
            if (ShareSayHiBoxView.this.f77791m1.f14981e.booleanValue()) {
                ShareSayHiBoxView.this.mo78955kl(new Runnable() { // from class: com.zing.zalo.ui.zviews.wk0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ShareSayHiBoxView.C15077a.this.m84413e(view);
                    }
                }, 200L);
            }
        }

        @Override // com.zing.zalo.adapters.C7163o6.b
        /* renamed from: c */
        public void mo36453c(C3251l c3251l) {
            if (c3251l != null) {
                try {
                    if (c3251l.m16514d() != null && c3251l.m16514d().m132398F()) {
                        ShareSayHiBoxView.this.m84407nM(String.valueOf(c3251l.m16514d().m132425e()));
                        ShareSayHiBoxView.this.f77793o1.put(Integer.valueOf(c3251l.m16514d().m132429g()), Integer.valueOf(c3251l.m16514d().m132429g()));
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ShareSayHiBoxView$b */
    /* loaded from: classes6.dex */
    class C15078b extends AbstractC18391a {
        C15078b() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            int i14;
            String trim = ShareSayHiBoxView.this.f77783e1.getText().toString().trim();
            ShareSayHiBoxView.this.m84406BM(trim);
            ImageView imageView = ShareSayHiBoxView.this.f77782d1;
            if (TextUtils.isEmpty(trim)) {
                i14 = 4;
            } else {
                i14 = 0;
            }
            imageView.setVisibility(i14);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ShareSayHiBoxView$c */
    /* loaded from: classes6.dex */
    class ViewOnTouchListenerC15079c implements View.OnTouchListener {

        /* renamed from: p */
        float f77807p;

        /* renamed from: q */
        float f77808q;

        /* renamed from: r */
        boolean f77809r;

        ViewOnTouchListenerC15079c() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x000e, code lost:            if (r4 != 3) goto L21;     */
        @Override // android.view.View.OnTouchListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        if (Math.abs(motionEvent.getX() - this.f77807p) > AbstractC23136l9.m118742r(6.0f) || Math.abs(motionEvent.getY() - this.f77808q) > AbstractC23136l9.m118742r(6.0f)) {
                            this.f77809r = false;
                        }
                    }
                }
                if (this.f77809r && ShareSayHiBoxView.this.f77772T0.getTranslationY() > (-(ShareSayHiBoxView.this.f77772T0.getHeight() - ShareSayHiBoxView.this.f77773U0.getHeight()))) {
                    ShareSayHiBoxView shareSayHiBoxView = ShareSayHiBoxView.this;
                    shareSayHiBoxView.f77779a1 = false;
                    shareSayHiBoxView.f77784f1.m9845O1(0, (int) ((shareSayHiBoxView.f77772T0.getTranslationY() + ShareSayHiBoxView.this.f77772T0.getHeight()) - ShareSayHiBoxView.this.f77773U0.getHeight()));
                }
            } else {
                this.f77809r = true;
                this.f77807p = motionEvent.getX();
                this.f77808q = motionEvent.getY();
            }
            return false;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ShareSayHiBoxView$d */
    /* loaded from: classes6.dex */
    class C15080d extends RecyclerView.AbstractC1892s {
        C15080d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            super.mo952b(recyclerView, i11);
            ShareSayHiBoxView shareSayHiBoxView = ShareSayHiBoxView.this;
            RobotoEditText robotoEditText = shareSayHiBoxView.f77783e1;
            if (robotoEditText != null && shareSayHiBoxView.f77779a1) {
                AbstractC2379w.m12430d(robotoEditText);
            }
            if (i11 == 0) {
                ShareSayHiBoxView shareSayHiBoxView2 = ShareSayHiBoxView.this;
                shareSayHiBoxView2.f77779a1 = true;
                shareSayHiBoxView2.f77786h1.m36143R(false);
                ShareSayHiBoxView.this.f77786h1.m10008p();
                return;
            }
            ShareSayHiBoxView.this.f77786h1.m36143R(true);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            try {
                ShareSayHiBoxView shareSayHiBoxView = ShareSayHiBoxView.this;
                if (shareSayHiBoxView.f77798t1) {
                    shareSayHiBoxView.f77798t1 = false;
                    return;
                }
                if (i12 > 0) {
                    int translationY = ((int) shareSayHiBoxView.f77772T0.getTranslationY()) - i12;
                    if (translationY < (-(ShareSayHiBoxView.this.f77772T0.getHeight() - ShareSayHiBoxView.this.f77773U0.getHeight()))) {
                        translationY = -(ShareSayHiBoxView.this.f77772T0.getHeight() - ShareSayHiBoxView.this.f77773U0.getHeight());
                    }
                    ShareSayHiBoxView.this.f77772T0.setTranslationY(translationY);
                    return;
                }
                View mo9732P = shareSayHiBoxView.f77785g1.mo9732P(0);
                if (mo9732P != null) {
                    mo9732P.getLocationInWindow(ShareSayHiBoxView.this.f77776X0);
                    ShareSayHiBoxView shareSayHiBoxView2 = ShareSayHiBoxView.this;
                    shareSayHiBoxView2.f77772T0.getLocationInWindow(shareSayHiBoxView2.f77777Y0);
                    ShareSayHiBoxView shareSayHiBoxView3 = ShareSayHiBoxView.this;
                    int translationY2 = (shareSayHiBoxView3.f77776X0[1] - shareSayHiBoxView3.f77777Y0[1]) + ((int) shareSayHiBoxView3.f77772T0.getTranslationY());
                    if (translationY2 < (-(ShareSayHiBoxView.this.f77772T0.getHeight() - ShareSayHiBoxView.this.f77773U0.getHeight()))) {
                        translationY2 = -(ShareSayHiBoxView.this.f77772T0.getHeight() - ShareSayHiBoxView.this.f77773U0.getHeight());
                    }
                    float f11 = translationY2;
                    if (f11 > ShareSayHiBoxView.this.f77772T0.getTranslationY()) {
                        ShareSayHiBoxView.this.f77772T0.setTranslationY(f11);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ShareSayHiBoxView$e */
    /* loaded from: classes6.dex */
    class ViewTreeObserverOnGlobalLayoutListenerC15081e implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserverOnGlobalLayoutListenerC15081e() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            int height = ShareSayHiBoxView.this.f77772T0.getHeight();
            ShareSayHiBoxView shareSayHiBoxView = ShareSayHiBoxView.this;
            if (height != shareSayHiBoxView.f77771S0) {
                shareSayHiBoxView.f77771S0 = shareSayHiBoxView.f77772T0.getHeight();
                ViewGroup.LayoutParams layoutParams = ShareSayHiBoxView.this.f77774V0.getLayoutParams();
                ShareSayHiBoxView shareSayHiBoxView2 = ShareSayHiBoxView.this;
                layoutParams.height = shareSayHiBoxView2.f77771S0;
                shareSayHiBoxView2.f77774V0.setLayoutParams(layoutParams);
            }
            try {
                View mo9732P = ShareSayHiBoxView.this.f77785g1.mo9732P(0);
                if (mo9732P != null) {
                    mo9732P.getLocationInWindow(ShareSayHiBoxView.this.f77776X0);
                    ShareSayHiBoxView shareSayHiBoxView3 = ShareSayHiBoxView.this;
                    shareSayHiBoxView3.f77772T0.getLocationInWindow(shareSayHiBoxView3.f77777Y0);
                    ShareSayHiBoxView shareSayHiBoxView4 = ShareSayHiBoxView.this;
                    int translationY = (shareSayHiBoxView4.f77776X0[1] - shareSayHiBoxView4.f77777Y0[1]) + ((int) shareSayHiBoxView4.f77772T0.getTranslationY());
                    if (translationY < (-(ShareSayHiBoxView.this.f77772T0.getHeight() - ShareSayHiBoxView.this.f77773U0.getHeight()))) {
                        translationY = -(ShareSayHiBoxView.this.f77772T0.getHeight() - ShareSayHiBoxView.this.f77773U0.getHeight());
                    }
                    float f11 = translationY;
                    if (f11 > ShareSayHiBoxView.this.f77772T0.getTranslationY()) {
                        ShareSayHiBoxView.this.f77772T0.setTranslationY(f11);
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mM */
    public void m84396mM(View view) {
        if (this.f72421L0.getContext() != null && C23793c.m124316k().mo124314i() - AbstractC0924m0.m3445T2() >= 1209600000) {
            C13306b c13306b = new C13306b(this.f72421L0.getContext());
            this.f77796r1 = c13306b;
            c13306b.m74687C((ViewGroup) this.f72421L0.m92656bJ());
            final C28212v6 c28212v6 = new C28212v6(m92651WI().getString(AbstractC8020f0.str_desc_tooltip_preview_sticker));
            c28212v6.f131577c = "tip.preview.sticker";
            c28212v6.f131580f = false;
            C25297f m130959a = C25297f.Companion.m130959a(this.f72421L0.getContext());
            m130959a.m130907M(c28212v6, this.f72421L0.getContext());
            m130959a.m130925c0(view);
            m130959a.m130920Z(true);
            m130959a.m130912R(EnumC25293b.RECTANGLE);
            m130959a.m130923b0(AbstractC23222t7.f112576o);
            m130959a.m130943l0(0);
            TooltipView tooltipView = new TooltipView(this.f72421L0.getContext());
            this.f77797s1 = tooltipView;
            tooltipView.setConfigs(m130959a);
            this.f77797s1.m90734d0();
            this.f77797s1.setTooltipId(c28212v6.f131577c);
            this.f77797s1.setOnTooltipFinishedListener(new TooltipView.InterfaceC16938b() { // from class: com.zing.zalo.ui.zviews.vk0
                @Override // com.zing.zalo.zdesign.component.TooltipView.InterfaceC16938b
                /* renamed from: a */
                public final void mo66113a(TooltipView tooltipView2, int i11, int i12, boolean z11) {
                    ShareSayHiBoxView.this.m84397qM(c28212v6, tooltipView2, i11, i12, z11);
                }
            });
            this.f77797s1.setTooltipManager(this.f77796r1);
            this.f77797s1.m90733c0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qM */
    public /* synthetic */ void m84397qM(C28212v6 c28212v6, TooltipView tooltipView, int i11, int i12, boolean z11) {
        if (tooltipView == this.f77797s1) {
            this.f77797s1 = null;
        }
        this.f77796r1 = null;
        AbstractC0924m0.m3404Rj(C23793c.m124316k().mo124314i());
        AbstractC28025b8.m141463s(c28212v6, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rM */
    public /* synthetic */ void m84398rM(String str, int i11, String str2, C26657h c26657h) {
        boolean z11;
        int i12;
        boolean z12;
        try {
            if (!TextUtils.isEmpty(this.f77804z1) && TextUtils.equals(this.f77804z1, str)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.f72421L0.m92674mJ() && !this.f72421L0.m92681pJ() && this.f72421L0.m92648SI() != null && z11 && this.f72421L0.m92672lJ()) {
                if (i11 == 0 && str2 != null && c26657h != null && (i12 = c26657h.f126157b) > 0) {
                    if (i12 == 14) {
                        LottieConfig lottieConfig = c26657h.f126162g;
                        if (lottieConfig != null) {
                            C25979a.m133815f(this.f72421L0, str, str2, lottieConfig);
                            return;
                        }
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("extra_asset_path", str2);
                    bundle.putString("extra_metadata_name", "metadata");
                    bundle.putInt("extra_effect_type", c26657h.f126157b);
                    if (!C20024r.m103941j() && !C7853b.m40052a0().m40133i0()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    bundle.putString("extra_play_params", Cocos2dxView.m78846iM(1, z12, null, null));
                    bundle.putBoolean("extra_preview", true);
                    if (Math.abs(AbstractC23309i.m122378s1() - System.currentTimeMillis()) > 86400000 && Math.abs(AbstractC23309i.m121186M5() - System.currentTimeMillis()) > 86400000) {
                        AbstractC23309i.m120756Aj(System.currentTimeMillis());
                        this.f72421L0.m92662fJ().m93069k2(Cocos2dxLoadingView.class, bundle, 0, true);
                        return;
                    } else {
                        Intent intent = new Intent(this.f72421L0.m92648SI(), (Class<?>) Cocos2dxAnimationActivity.class);
                        intent.putExtras(bundle);
                        this.f72421L0.m92641HK(intent);
                        return;
                    }
                }
                this.f77804z1 = "";
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sM */
    public /* synthetic */ void m84399sM(final int i11, final String str, final String str2, final C26657h c26657h) {
        mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.uk0
            @Override // java.lang.Runnable
            public final void run() {
                ShareSayHiBoxView.this.m84398rM(str, i11, str2, c26657h);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tM */
    public /* synthetic */ void m84400tM() {
        List list;
        if (this.f77780b1 != null && (list = this.f77801w1) != null && !list.isEmpty()) {
            this.f77780b1.mo9854S1(this.f77801w1.size() - 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uM */
    public /* synthetic */ void m84401uM(View view) {
        this.f77783e1.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vM */
    public /* synthetic */ void m84402vM(RecyclerView recyclerView, int i11, View view) {
        try {
            String str = ((InviteContactProfile) this.f77801w1.get(i11)).f42434r;
            if (!TextUtils.isEmpty(str)) {
                AbstractC2379w.m12430d(this.f77783e1);
                if (!TextUtils.isEmpty(this.f77783e1.getText().toString().trim())) {
                    this.f77783e1.setText("");
                }
                this.f77786h1.f38736w = str;
                if (!m84405AM(str, true)) {
                    if (this.f77792n1 != null) {
                        Iterator it = this.f77795q1.iterator();
                        while (it.hasNext()) {
                            if (str.equals(((ContactProfile) it.next()).f42434r)) {
                                this.f77792n1.m126336K(true);
                                m84411zM();
                                m84405AM(str, false);
                                return;
                            }
                        }
                    }
                    List list = this.f77788j1;
                    if (list != null) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            if (str.equals(((ContactProfile) it2.next()).f42434r)) {
                                this.f77792n1.m126335J(true);
                                m84411zM();
                                m84405AM(str, false);
                                return;
                            }
                        }
                    }
                    List list2 = this.f77789k1;
                    if (list2 != null) {
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            if (str.equals(((ContactProfile) it3.next()).f42434r)) {
                                this.f77792n1.m126334I(true);
                                m84411zM();
                                m84405AM(str, false);
                                return;
                            }
                        }
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wM */
    public /* synthetic */ void m84403wM(int i11) {
        try {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f77773U0.getLocationInWindow(iArr);
            View mo9732P = this.f77785g1.mo9732P(i11);
            if (mo9732P != null) {
                mo9732P.getLocationInWindow(iArr2);
                if (iArr2[1] < iArr[1] + this.f77773U0.getHeight()) {
                    this.f77798t1 = true;
                    this.f77784f1.scrollBy(0, (iArr2[1] - iArr[1]) - this.f77773U0.getHeight());
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xM */
    public /* synthetic */ void m84404xM(final int i11) {
        LinearLayoutManager linearLayoutManager = this.f77785g1;
        if (linearLayoutManager != null && this.f77784f1 != null) {
            linearLayoutManager.mo9756v1(i11);
            this.f77784f1.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.tk0
                @Override // java.lang.Runnable
                public final void run() {
                    ShareSayHiBoxView.this.m84403wM(i11);
                }
            }, 16L);
        }
    }

    /* renamed from: AM */
    boolean m84405AM(String str, boolean z11) {
        try {
            List m36138M = this.f77786h1.m36138M();
            if (m36138M != null) {
                for (int i11 = 0; i11 < m36138M.size(); i11++) {
                    if (str.equals(((InviteContactProfile) m36138M.get(i11)).f42434r)) {
                        if (z11) {
                            this.f77786h1.m10008p();
                        }
                        final int i12 = i11 + 1;
                        this.f77784f1.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.qk0
                            @Override // java.lang.Runnable
                            public final void run() {
                                ShareSayHiBoxView.this.m84404xM(i12);
                            }
                        }, 50L);
                        return true;
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return false;
    }

    /* renamed from: BM */
    void m84406BM(String str) {
        if (TextUtils.isEmpty(str)) {
            m84410yM();
            return;
        }
        List<ContactProfile> m120006s = AbstractC23262x6.m120006s(str, this.f77792n1.m126366p(), this.f77790l1, false);
        ArrayList arrayList = new ArrayList();
        for (ContactProfile contactProfile : m120006s) {
            if (ShareView.m87465QN(contactProfile, this.f77792n1)) {
                arrayList.add(new InviteContactProfile(contactProfile));
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new InviteContactProfile("-9", null, null));
        }
        ViewGroup.LayoutParams layoutParams = this.f77775W0.getLayoutParams();
        int height = (this.f77784f1.getHeight() - this.f77773U0.getHeight()) - (this.f77778Z0 * arrayList.size());
        layoutParams.height = height;
        layoutParams.height = Math.max(height, 0);
        this.f77775W0.setLayoutParams(layoutParams);
        this.f77786h1.m36142Q(arrayList);
        this.f77786h1.m10008p();
        if (!arrayList.isEmpty() && this.f77784f1 != null) {
            int abs = Math.abs((int) this.f77772T0.getTranslationY());
            this.f77784f1.m9837K1(0);
            this.f77784f1.scrollBy(0, abs);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        JSONObject jSONObject;
        super.mo37111CJ(bundle);
        try {
            m92637BK(true);
            Bundle m92642L3 = this.f72421L0.m92642L3();
            String string = m92642L3.getString("extra_say_hi_box_json");
            if (TextUtils.isEmpty(string)) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(string);
            }
            this.f77791m1 = new C3547o(jSONObject);
            this.f77770R0 = m92642L3.getBoolean("extra_is_filtering_sticker", true);
            if (jSONObject.has("config")) {
                C24221a c24221a = new C24221a(jSONObject.getJSONObject("config"));
                this.f77792n1 = c24221a;
                this.f77794p1.addAll(c24221a.m126352b());
                this.f77795q1.addAll(this.f77792n1.m126353c());
            } else {
                this.f77792n1.m126330E(false);
                this.f77792n1.m126341P(false);
                this.f77792n1.m126344S(true);
                this.f77792n1.m126350Y(this.f77791m1.f14980d);
                this.f77792n1.m126337L(false);
                this.f77792n1.m126343R(true);
                this.f77792n1.m126349X(AbstractC23136l9.m118743r0(AbstractC8020f0.str_share_title_recent));
                this.f77792n1.m126339N(false);
                this.f77792n1.m126342Q(true);
                this.f77792n1.m126348W(AbstractC23136l9.m118743r0(AbstractC8020f0.str_share_title_group));
                this.f77792n1.m126338M(true);
                this.f77792n1.m126340O(true);
                this.f77792n1.m126346U(AbstractC23136l9.m118743r0(AbstractC8020f0.str_share_title_contact));
                this.f77792n1.m126333H(true);
            }
            C2526d.f10270a.m12734y0("0");
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f72421L0.finish();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        super.mo37482FJ(actionBarMenu);
        actionBarMenu.m92750r();
        C24221a c24221a = this.f77792n1;
        if (c24221a != null && c24221a.m126360j() && this.f88760a0 != null) {
            int i11 = AbstractC16803z.action_menu_white_send_icon_selector;
            this.f77802x1 = actionBarMenu.m92738e(i11, i11);
            m84408oM();
            this.f88760a0.setSubtitle(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_selected_muti_share), Integer.valueOf(this.f77800v1.size())));
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.share_say_hi_box_view, viewGroup, false);
        this.f77766N0 = inflate;
        RobotoTextView robotoTextView = (RobotoTextView) inflate.findViewById(AbstractC6918a0.hint);
        this.f77767O0 = robotoTextView;
        robotoTextView.setText(this.f77791m1.f14978b);
        RecyclerView recyclerView = (RecyclerView) this.f77766N0.findViewById(AbstractC6918a0.sticker_list);
        this.f77768P0 = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        C7163o6 c7163o6 = new C7163o6(m92689tK(), new C15077a());
        this.f77769Q0 = c7163o6;
        this.f77768P0.setAdapter(c7163o6);
        ImageView imageView = (ImageView) this.f77766N0.findViewById(AbstractC6918a0.clear);
        this.f77782d1 = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.ok0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShareSayHiBoxView.this.m84401uM(view);
            }
        });
        RobotoEditText robotoEditText = (RobotoEditText) this.f77766N0.findViewById(AbstractC6918a0.edit_search);
        this.f77783e1 = robotoEditText;
        robotoEditText.setHint(this.f77791m1.f14979c);
        this.f77783e1.addTextChangedListener(new C15078b());
        this.f77783e1.setOnTouchListener(new ViewOnTouchListenerC15079c());
        this.f77787i1 = new ArrayList();
        RecyclerView recyclerView2 = (RecyclerView) this.f77766N0.findViewById(AbstractC6918a0.rv_bubbles);
        this.f77780b1 = recyclerView2;
        recyclerView2.setLayoutManager(new LinearLayoutManager(this.f72421L0.m92648SI(), 0, false));
        C7005a5 c7005a5 = new C7005a5();
        this.f77781c1 = c7005a5;
        c7005a5.f38320t = true;
        this.f77780b1.setAdapter(c7005a5);
        C31784b.m152808a(this.f77780b1).m152809b(new C31784b.d() { // from class: com.zing.zalo.ui.zviews.pk0
            @Override // zc0.C31784b.d
            /* renamed from: i0 */
            public final void mo17458i0(RecyclerView recyclerView3, int i11, View view) {
                ShareSayHiBoxView.this.m84402vM(recyclerView3, i11, view);
            }
        });
        View view = new View(this.f72421L0.m92648SI());
        this.f77774V0 = view;
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, 0));
        View view2 = new View(this.f72421L0.m92648SI());
        this.f77775W0 = view2;
        view2.setLayoutParams(new ViewGroup.LayoutParams(-1, 0));
        this.f77773U0 = this.f77766N0.findViewById(AbstractC6918a0.layout_search);
        View findViewById = this.f77766N0.findViewById(AbstractC6918a0.layout_content);
        this.f77772T0 = findViewById;
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(this.f77799u1);
        this.f77784f1 = (RecyclerView) this.f77766N0.findViewById(AbstractC6918a0.recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.f77785g1 = linearLayoutManager;
        this.f77784f1.setLayoutManager(linearLayoutManager);
        C7086h6 c7086h6 = new C7086h6(this, this.f77774V0, this.f77775W0);
        this.f77786h1 = c7086h6;
        c7086h6.m36141P(this.f72421L0.m92642L3().getStringArrayList("extra_completed_contact_ids"));
        this.f77786h1.f38735v = this.f77792n1.m126360j();
        this.f77784f1.m9826E(new C15080d());
        this.f77784f1.setAdapter(this.f77786h1);
        this.f77766N0.setOnClickListener(this);
        m84409pM(this.f77770R0);
        m84410yM();
        return this.f77766N0;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        try {
            this.f77772T0.getViewTreeObserver().removeOnGlobalLayoutListener(this.f77799u1);
            C2526d.f10270a.m12718l(this.f77793o1.size(), "0", "quick_action");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        super.mo37484JJ();
    }

    @Override // com.zing.zalo.adapters.C7086h6.a
    /* renamed from: P */
    public void mo36144P(ContactProfile contactProfile) {
        ActionBar actionBar;
        if (contactProfile != null) {
            try {
                int i11 = 8;
                if (this.f77800v1.containsKey(contactProfile.f42434r)) {
                    this.f77800v1.remove(contactProfile.f42434r);
                    int size = this.f77801w1.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        if (((InviteContactProfile) this.f77801w1.get(size)).f42434r.equals(contactProfile.f42434r)) {
                            this.f77801w1.remove(size);
                            break;
                        }
                        size--;
                    }
                    this.f77786h1.f38736w = "";
                    RecyclerView recyclerView = this.f77780b1;
                    if (!this.f77801w1.isEmpty()) {
                        i11 = 0;
                    }
                    recyclerView.setVisibility(i11);
                    this.f77781c1.m35846M(this.f77801w1);
                    this.f77781c1.m10008p();
                } else {
                    this.f77786h1.f38736w = "";
                    this.f77800v1.put(contactProfile.f42434r, contactProfile);
                    this.f77801w1.add(new InviteContactProfile(contactProfile));
                    RecyclerView recyclerView2 = this.f77780b1;
                    if (!this.f77801w1.isEmpty()) {
                        i11 = 0;
                    }
                    recyclerView2.setVisibility(i11);
                    this.f77781c1.m35846M(this.f77801w1);
                    this.f77781c1.m10008p();
                    this.f77780b1.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.sk0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ShareSayHiBoxView.this.m84400tM();
                        }
                    });
                }
                C7086h6 c7086h6 = this.f77786h1;
                if (c7086h6 != null) {
                    c7086h6.m10008p();
                }
                m84408oM();
                RobotoEditText robotoEditText = this.f77783e1;
                if (robotoEditText != null && !TextUtils.isEmpty(robotoEditText.getText())) {
                    this.f77783e1.setText("");
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        C24221a c24221a = this.f77792n1;
        if (c24221a != null && c24221a.m126360j() && (actionBar = this.f88760a0) != null) {
            actionBar.setSubtitle(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_selected_muti_share), Integer.valueOf(this.f77800v1.size())));
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        try {
            if (i11 == 16908332) {
                AbstractC2379w.m12430d(this.f77783e1);
            } else if (i11 == AbstractC16803z.action_menu_white_send_icon_selector) {
                AbstractC2379w.m12430d(this.f77783e1);
                Iterator it = this.f77801w1.iterator();
                while (it.hasNext()) {
                    mo36146Z1((ContactProfile) it.next());
                }
                this.f72421L0.finish();
                return true;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return super.mo37491QJ(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        Bundle m92642L3 = this.f72421L0.m92642L3();
        m92642L3.putBoolean("extra_is_filtering_sticker", this.f77770R0);
        m92642L3.putStringArrayList("extra_completed_contact_ids", this.f77786h1.m36137L());
        m92642L3.putInt("extra_selected_position", this.f77769Q0.m36445O());
    }

    @Override // com.zing.zalo.adapters.C7086h6.a
    /* renamed from: T1 */
    public boolean mo36145T1(String str) {
        Map map = this.f77800v1;
        if (map != null) {
            return map.containsKey(str);
        }
        return false;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            actionBar.setBackButtonImage(AbstractC16803z.ic_theme_close);
            this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
            C3547o c3547o = this.f77791m1;
            if (c3547o != null) {
                this.f88760a0.setTitle(c3547o.f14977a);
            }
        }
    }

    @Override // com.zing.zalo.adapters.C7086h6.a
    /* renamed from: Z1 */
    public void mo36146Z1(ContactProfile contactProfile) {
        C25809a m16511a;
        C25810b c25810b;
        AbstractC2379w.m12430d(this.f77783e1);
        C3251l m36446P = this.f77769Q0.m36446P();
        if (m36446P != null) {
            if (m36446P.m16519i()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("source", 16);
                    jSONObject.put("keyword", "");
                } catch (JSONException e11) {
                    AbstractC23350e.m122778h(e11);
                }
                C26406h c26406h = new C26406h();
                c26406h.m136191o(jSONObject);
                AbstractC23112j7.m118530g0(contactProfile.f42434r, m36446P.m16514d(), c26406h, "chat_send");
                return;
            }
            if (m36446P.m16518h()) {
                String str = contactProfile.f42434r;
                if (m36446P.m16513c() != null) {
                    c25810b = m36446P.m16513c().m133089a();
                } else {
                    c25810b = null;
                }
                AbstractC23112j7.m118512V(str, c25810b, null, "chat_send");
                return;
            }
            if (m36446P.m16517g() && (m16511a = m36446P.m16511a()) != null) {
                AbstractC23112j7.m118511U(contactProfile.f42434r, m16511a.m133079a(), m16511a.m133084f(), "", m16511a.m133085g(), m16511a.m133080b(), m16511a.m133081c(), m16511a.m133083e(), false, null, "chat_send");
            }
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ShareSayHiBoxView";
    }

    /* renamed from: nM */
    public synchronized void m84407nM(String str) {
        try {
            if (AbstractC23309i.m122610yb() && !TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(this.f77804z1)) {
                    if (TextUtils.equals(this.f77804z1, str + "")) {
                    }
                }
                if (!(!TextUtils.isEmpty(this.f77804z1))) {
                    this.f77804z1 = str;
                    if (this.f77803y1 == null) {
                        this.f77803y1 = new C26674y.b() { // from class: com.zing.zalo.ui.zviews.rk0
                            @Override // tg.C26674y.b
                            /* renamed from: a */
                            public final void mo15759a(int i11, String str2, String str3, C26657h c26657h) {
                                ShareSayHiBoxView.this.m84399sM(i11, str2, str3, c26657h);
                            }
                        };
                    }
                    C26674y.m136865t().m136877n(str, "preview_sayhibox_id_" + str, this.f77803y1, (byte) 9);
                }
            }
        } finally {
        }
    }

    /* renamed from: oM */
    void m84408oM() {
        try {
            this.f77802x1.setEnabled(!this.f77800v1.isEmpty());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == 12346 && i12 == -1) {
            try {
                if (intent.hasExtra("groupId")) {
                    String stringExtra = intent.getStringExtra("groupId");
                    if (!TextUtils.isEmpty(stringExtra)) {
                        mo36146Z1(new ContactProfile("group_" + stringExtra));
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f77766N0) {
            AbstractC2379w.m12430d(this.f77783e1);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        this.f77804z1 = "";
    }

    /* renamed from: pM */
    void m84409pM(boolean z11) {
        this.f77770R0 = z11;
        ArrayList arrayList = new ArrayList(this.f77791m1.f14983g);
        arrayList.addAll(this.f77791m1.f14984h);
        this.f77769Q0.m36449U(arrayList);
    }

    @Override // com.zing.zalo.adapters.C7086h6.a
    /* renamed from: w */
    public void mo36147w(ContactProfile contactProfile) {
        C17487o0 c17487o0;
        try {
            AbstractC2379w.m12430d(this.f77783e1);
            if (contactProfile.f42434r.startsWith("-")) {
                if (contactProfile.f42434r.equals("-1")) {
                    AbstractC23647d.m123906p("13691");
                    AbstractC23647d.m123893c();
                    Bundle bundle = new Bundle();
                    bundle.putShort("SHORT_EXTRA_CREATE_SOURCE", (short) 3);
                    if (this.f72421L0.m92676n2() != null) {
                        c17487o0 = this.f72421L0.m92676n2().mo35579p();
                    } else {
                        c17487o0 = null;
                    }
                    C17487o0 c17487o02 = c17487o0;
                    if (c17487o02 != null) {
                        c17487o02.m93066i2(QuickCreateGroupView.class, bundle, 12346, 1, true);
                        return;
                    }
                    return;
                }
                if (contactProfile.f42434r.equals("-4")) {
                    AbstractC23647d.m123906p("136920");
                    AbstractC23647d.m123893c();
                    C24221a c24221a = this.f77792n1;
                    if (c24221a != null) {
                        c24221a.m126336K(true);
                    }
                    m84411zM();
                    return;
                }
                if (contactProfile.f42434r.equals("-5")) {
                    AbstractC23647d.m123906p("136921");
                    AbstractC23647d.m123893c();
                    C24221a c24221a2 = this.f77792n1;
                    if (c24221a2 != null) {
                        c24221a2.m126335J(true);
                    }
                    m84411zM();
                    return;
                }
                if (contactProfile.f42434r.equals("-6")) {
                    AbstractC23647d.m123906p("136922");
                    AbstractC23647d.m123893c();
                    C24221a c24221a3 = this.f77792n1;
                    if (c24221a3 != null) {
                        c24221a3.m126334I(true);
                    }
                    m84411zM();
                    return;
                }
                if (contactProfile.f42434r.equals("-7")) {
                    C24221a c24221a4 = this.f77792n1;
                    if (c24221a4 != null) {
                        c24221a4.m126333H(true);
                    }
                    m84411zM();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: yM */
    void m84410yM() {
        this.f77787i1.clear();
        this.f77789k1.clear();
        this.f77788j1.clear();
        if (this.f77791m1 != null && this.f77795q1.isEmpty() && this.f77791m1.f14982f.size() > 0) {
            for (int i11 = 0; i11 < this.f77791m1.f14982f.size(); i11++) {
                ContactProfile m141809c = C28203u6.f131407a.m141809c((String) this.f77791m1.f14982f.get(i11));
                if (m141809c != null) {
                    this.f77795q1.add(new InviteContactProfile(m141809c));
                }
            }
        }
        for (ContactProfile contactProfile : C19669z.m103146Y().m103199P()) {
            if (ShareView.m87465QN(contactProfile, this.f77792n1)) {
                this.f77788j1.add(new InviteContactProfile(contactProfile));
            }
        }
        if (this.f77792n1.m126368r()) {
            for (C31973j5 c31973j5 : C0943w.m4462l().m4475i()) {
                if (c31973j5 != null && !TextUtils.isEmpty(c31973j5.m153781r())) {
                    ContactProfile contactProfile2 = new ContactProfile("group_" + c31973j5.m153781r());
                    contactProfile2.f42437s = c31973j5.m153793y();
                    if (c31973j5.m153786t0()) {
                        contactProfile2.f42446v = c31973j5.m153756e();
                    }
                    this.f77789k1.add(new InviteContactProfile(contactProfile2));
                }
            }
        }
        int m122127lb = AbstractC23309i.m122127lb();
        C18635e mo98465a = C18644n.m98531l().mo98465a(null, false);
        int size = mo98465a.size();
        int i12 = -1;
        int i13 = 0;
        boolean z11 = false;
        for (int i14 = 0; i14 < size; i14++) {
            InviteContactProfile inviteContactProfile = new InviteContactProfile((ContactProfile) mo98465a.get(i14));
            if ((m122127lb != 1 || inviteContactProfile.f42382U0 != 0) && ShareView.m87465QN(inviteContactProfile, this.f77792n1)) {
                String str = "" + inviteContactProfile.f42440t.trim().charAt(0);
                Locale locale = Locale.ENGLISH;
                char charAt = str.toUpperCase(locale).charAt(0);
                i12++;
                if (i12 != 0) {
                    try {
                        char charAt2 = ("" + ((ContactProfile) mo98465a.get(i13)).f42440t.trim().charAt(0)).toUpperCase(locale).charAt(0);
                        if (this.f77765M0.indexOf(charAt2) != -1) {
                            if (charAt > charAt2) {
                                if (this.f77765M0.indexOf(charAt) != -1) {
                                    InviteContactProfile inviteContactProfile2 = new InviteContactProfile();
                                    inviteContactProfile2.f42437s = "" + charAt;
                                    inviteContactProfile2.m40403e1(false);
                                    if (!z11) {
                                        inviteContactProfile2.f42407e1 = true;
                                        z11 = true;
                                    }
                                    int size2 = this.f77787i1.size();
                                    if (size2 > 0) {
                                        int i15 = size2 - 1;
                                        if (((InviteContactProfile) this.f77787i1.get(i15)).m40366G0()) {
                                            ((InviteContactProfile) this.f77787i1.get(i15)).f42405d1 = true;
                                        }
                                    }
                                    this.f77787i1.add(inviteContactProfile2);
                                } else {
                                    InviteContactProfile inviteContactProfile3 = new InviteContactProfile();
                                    if (this.f77765M0.indexOf(charAt) == -1) {
                                        inviteContactProfile3.f42437s = "##";
                                    } else {
                                        inviteContactProfile3.f42437s = "" + charAt;
                                    }
                                    inviteContactProfile3.m40403e1(false);
                                    if (!z11) {
                                        inviteContactProfile3.f42407e1 = true;
                                        z11 = true;
                                    }
                                    this.f77787i1.add(inviteContactProfile3);
                                }
                            }
                        } else if (this.f77765M0.indexOf(charAt) != -1) {
                            InviteContactProfile inviteContactProfile4 = new InviteContactProfile();
                            inviteContactProfile4.f42437s = "" + charAt;
                            inviteContactProfile4.m40403e1(false);
                            if (!z11) {
                                inviteContactProfile4.f42407e1 = true;
                                z11 = true;
                            }
                            int size3 = this.f77787i1.size();
                            if (size3 > 0) {
                                int i16 = size3 - 1;
                                if (((InviteContactProfile) this.f77787i1.get(i16)).m40366G0()) {
                                    ((InviteContactProfile) this.f77787i1.get(i16)).f42405d1 = true;
                                }
                            }
                            this.f77787i1.add(inviteContactProfile4);
                        }
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                } else {
                    InviteContactProfile inviteContactProfile5 = new InviteContactProfile();
                    if (this.f77765M0.indexOf(charAt) == -1) {
                        inviteContactProfile5.f42437s = "#";
                    } else {
                        inviteContactProfile5.f42437s = "" + charAt;
                    }
                    inviteContactProfile5.m40403e1(false);
                    if (!z11) {
                        inviteContactProfile5.f42407e1 = true;
                        z11 = true;
                    }
                    this.f77787i1.add(inviteContactProfile5);
                }
                inviteContactProfile.f42399a1.clear();
                this.f77787i1.add(inviteContactProfile);
                i13 = i14;
            }
        }
        ViewGroup.LayoutParams layoutParams = this.f77775W0.getLayoutParams();
        layoutParams.height = 0;
        this.f77775W0.setLayoutParams(layoutParams);
        m84411zM();
        if (this.f77784f1 != null) {
            int abs = Math.abs((int) this.f77772T0.getTranslationY());
            this.f77784f1.m9837K1(0);
            this.f77784f1.scrollBy(0, abs);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ef A[Catch: Exception -> 0x004d, TryCatch #0 {Exception -> 0x004d, blocks: (B:2:0x0000, B:4:0x0009, B:6:0x0013, B:7:0x0019, B:9:0x001f, B:12:0x002f, B:14:0x0037, B:15:0x0050, B:16:0x0065, B:20:0x0072, B:21:0x007b, B:23:0x0083, B:24:0x0098, B:26:0x00a6, B:28:0x00ae, B:31:0x00b7, B:33:0x00cb, B:35:0x00d3, B:36:0x00dd, B:38:0x00e5, B:41:0x00ef, B:42:0x00f8, B:44:0x0100, B:45:0x0115, B:47:0x0123, B:49:0x012b, B:52:0x0134, B:54:0x0143, B:56:0x014b, B:57:0x0155, B:59:0x015d, B:62:0x0167, B:63:0x0170, B:65:0x0178, B:66:0x018d, B:68:0x019b, B:70:0x01a3, B:73:0x01ac, B:75:0x01bb, B:77:0x01c3, B:78:0x01cd, B:80:0x01d5, B:83:0x01df, B:84:0x01e7, B:86:0x01ef, B:87:0x0204, B:89:0x020c, B:91:0x0213, B:93:0x021b, B:95:0x022c, B:103:0x0237, B:99:0x023a, B:101:0x0242, B:109:0x024c), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0100 A[Catch: Exception -> 0x004d, TryCatch #0 {Exception -> 0x004d, blocks: (B:2:0x0000, B:4:0x0009, B:6:0x0013, B:7:0x0019, B:9:0x001f, B:12:0x002f, B:14:0x0037, B:15:0x0050, B:16:0x0065, B:20:0x0072, B:21:0x007b, B:23:0x0083, B:24:0x0098, B:26:0x00a6, B:28:0x00ae, B:31:0x00b7, B:33:0x00cb, B:35:0x00d3, B:36:0x00dd, B:38:0x00e5, B:41:0x00ef, B:42:0x00f8, B:44:0x0100, B:45:0x0115, B:47:0x0123, B:49:0x012b, B:52:0x0134, B:54:0x0143, B:56:0x014b, B:57:0x0155, B:59:0x015d, B:62:0x0167, B:63:0x0170, B:65:0x0178, B:66:0x018d, B:68:0x019b, B:70:0x01a3, B:73:0x01ac, B:75:0x01bb, B:77:0x01c3, B:78:0x01cd, B:80:0x01d5, B:83:0x01df, B:84:0x01e7, B:86:0x01ef, B:87:0x0204, B:89:0x020c, B:91:0x0213, B:93:0x021b, B:95:0x022c, B:103:0x0237, B:99:0x023a, B:101:0x0242, B:109:0x024c), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0134 A[Catch: Exception -> 0x004d, LOOP:2: B:51:0x0132->B:52:0x0134, LOOP_END, TryCatch #0 {Exception -> 0x004d, blocks: (B:2:0x0000, B:4:0x0009, B:6:0x0013, B:7:0x0019, B:9:0x001f, B:12:0x002f, B:14:0x0037, B:15:0x0050, B:16:0x0065, B:20:0x0072, B:21:0x007b, B:23:0x0083, B:24:0x0098, B:26:0x00a6, B:28:0x00ae, B:31:0x00b7, B:33:0x00cb, B:35:0x00d3, B:36:0x00dd, B:38:0x00e5, B:41:0x00ef, B:42:0x00f8, B:44:0x0100, B:45:0x0115, B:47:0x0123, B:49:0x012b, B:52:0x0134, B:54:0x0143, B:56:0x014b, B:57:0x0155, B:59:0x015d, B:62:0x0167, B:63:0x0170, B:65:0x0178, B:66:0x018d, B:68:0x019b, B:70:0x01a3, B:73:0x01ac, B:75:0x01bb, B:77:0x01c3, B:78:0x01cd, B:80:0x01d5, B:83:0x01df, B:84:0x01e7, B:86:0x01ef, B:87:0x0204, B:89:0x020c, B:91:0x0213, B:93:0x021b, B:95:0x022c, B:103:0x0237, B:99:0x023a, B:101:0x0242, B:109:0x024c), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014b A[Catch: Exception -> 0x004d, TryCatch #0 {Exception -> 0x004d, blocks: (B:2:0x0000, B:4:0x0009, B:6:0x0013, B:7:0x0019, B:9:0x001f, B:12:0x002f, B:14:0x0037, B:15:0x0050, B:16:0x0065, B:20:0x0072, B:21:0x007b, B:23:0x0083, B:24:0x0098, B:26:0x00a6, B:28:0x00ae, B:31:0x00b7, B:33:0x00cb, B:35:0x00d3, B:36:0x00dd, B:38:0x00e5, B:41:0x00ef, B:42:0x00f8, B:44:0x0100, B:45:0x0115, B:47:0x0123, B:49:0x012b, B:52:0x0134, B:54:0x0143, B:56:0x014b, B:57:0x0155, B:59:0x015d, B:62:0x0167, B:63:0x0170, B:65:0x0178, B:66:0x018d, B:68:0x019b, B:70:0x01a3, B:73:0x01ac, B:75:0x01bb, B:77:0x01c3, B:78:0x01cd, B:80:0x01d5, B:83:0x01df, B:84:0x01e7, B:86:0x01ef, B:87:0x0204, B:89:0x020c, B:91:0x0213, B:93:0x021b, B:95:0x022c, B:103:0x0237, B:99:0x023a, B:101:0x0242, B:109:0x024c), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0167 A[Catch: Exception -> 0x004d, TryCatch #0 {Exception -> 0x004d, blocks: (B:2:0x0000, B:4:0x0009, B:6:0x0013, B:7:0x0019, B:9:0x001f, B:12:0x002f, B:14:0x0037, B:15:0x0050, B:16:0x0065, B:20:0x0072, B:21:0x007b, B:23:0x0083, B:24:0x0098, B:26:0x00a6, B:28:0x00ae, B:31:0x00b7, B:33:0x00cb, B:35:0x00d3, B:36:0x00dd, B:38:0x00e5, B:41:0x00ef, B:42:0x00f8, B:44:0x0100, B:45:0x0115, B:47:0x0123, B:49:0x012b, B:52:0x0134, B:54:0x0143, B:56:0x014b, B:57:0x0155, B:59:0x015d, B:62:0x0167, B:63:0x0170, B:65:0x0178, B:66:0x018d, B:68:0x019b, B:70:0x01a3, B:73:0x01ac, B:75:0x01bb, B:77:0x01c3, B:78:0x01cd, B:80:0x01d5, B:83:0x01df, B:84:0x01e7, B:86:0x01ef, B:87:0x0204, B:89:0x020c, B:91:0x0213, B:93:0x021b, B:95:0x022c, B:103:0x0237, B:99:0x023a, B:101:0x0242, B:109:0x024c), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0178 A[Catch: Exception -> 0x004d, TryCatch #0 {Exception -> 0x004d, blocks: (B:2:0x0000, B:4:0x0009, B:6:0x0013, B:7:0x0019, B:9:0x001f, B:12:0x002f, B:14:0x0037, B:15:0x0050, B:16:0x0065, B:20:0x0072, B:21:0x007b, B:23:0x0083, B:24:0x0098, B:26:0x00a6, B:28:0x00ae, B:31:0x00b7, B:33:0x00cb, B:35:0x00d3, B:36:0x00dd, B:38:0x00e5, B:41:0x00ef, B:42:0x00f8, B:44:0x0100, B:45:0x0115, B:47:0x0123, B:49:0x012b, B:52:0x0134, B:54:0x0143, B:56:0x014b, B:57:0x0155, B:59:0x015d, B:62:0x0167, B:63:0x0170, B:65:0x0178, B:66:0x018d, B:68:0x019b, B:70:0x01a3, B:73:0x01ac, B:75:0x01bb, B:77:0x01c3, B:78:0x01cd, B:80:0x01d5, B:83:0x01df, B:84:0x01e7, B:86:0x01ef, B:87:0x0204, B:89:0x020c, B:91:0x0213, B:93:0x021b, B:95:0x022c, B:103:0x0237, B:99:0x023a, B:101:0x0242, B:109:0x024c), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ac A[Catch: Exception -> 0x004d, LOOP:3: B:72:0x01aa->B:73:0x01ac, LOOP_END, TryCatch #0 {Exception -> 0x004d, blocks: (B:2:0x0000, B:4:0x0009, B:6:0x0013, B:7:0x0019, B:9:0x001f, B:12:0x002f, B:14:0x0037, B:15:0x0050, B:16:0x0065, B:20:0x0072, B:21:0x007b, B:23:0x0083, B:24:0x0098, B:26:0x00a6, B:28:0x00ae, B:31:0x00b7, B:33:0x00cb, B:35:0x00d3, B:36:0x00dd, B:38:0x00e5, B:41:0x00ef, B:42:0x00f8, B:44:0x0100, B:45:0x0115, B:47:0x0123, B:49:0x012b, B:52:0x0134, B:54:0x0143, B:56:0x014b, B:57:0x0155, B:59:0x015d, B:62:0x0167, B:63:0x0170, B:65:0x0178, B:66:0x018d, B:68:0x019b, B:70:0x01a3, B:73:0x01ac, B:75:0x01bb, B:77:0x01c3, B:78:0x01cd, B:80:0x01d5, B:83:0x01df, B:84:0x01e7, B:86:0x01ef, B:87:0x0204, B:89:0x020c, B:91:0x0213, B:93:0x021b, B:95:0x022c, B:103:0x0237, B:99:0x023a, B:101:0x0242, B:109:0x024c), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c3 A[Catch: Exception -> 0x004d, TryCatch #0 {Exception -> 0x004d, blocks: (B:2:0x0000, B:4:0x0009, B:6:0x0013, B:7:0x0019, B:9:0x001f, B:12:0x002f, B:14:0x0037, B:15:0x0050, B:16:0x0065, B:20:0x0072, B:21:0x007b, B:23:0x0083, B:24:0x0098, B:26:0x00a6, B:28:0x00ae, B:31:0x00b7, B:33:0x00cb, B:35:0x00d3, B:36:0x00dd, B:38:0x00e5, B:41:0x00ef, B:42:0x00f8, B:44:0x0100, B:45:0x0115, B:47:0x0123, B:49:0x012b, B:52:0x0134, B:54:0x0143, B:56:0x014b, B:57:0x0155, B:59:0x015d, B:62:0x0167, B:63:0x0170, B:65:0x0178, B:66:0x018d, B:68:0x019b, B:70:0x01a3, B:73:0x01ac, B:75:0x01bb, B:77:0x01c3, B:78:0x01cd, B:80:0x01d5, B:83:0x01df, B:84:0x01e7, B:86:0x01ef, B:87:0x0204, B:89:0x020c, B:91:0x0213, B:93:0x021b, B:95:0x022c, B:103:0x0237, B:99:0x023a, B:101:0x0242, B:109:0x024c), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01df A[Catch: Exception -> 0x004d, TryCatch #0 {Exception -> 0x004d, blocks: (B:2:0x0000, B:4:0x0009, B:6:0x0013, B:7:0x0019, B:9:0x001f, B:12:0x002f, B:14:0x0037, B:15:0x0050, B:16:0x0065, B:20:0x0072, B:21:0x007b, B:23:0x0083, B:24:0x0098, B:26:0x00a6, B:28:0x00ae, B:31:0x00b7, B:33:0x00cb, B:35:0x00d3, B:36:0x00dd, B:38:0x00e5, B:41:0x00ef, B:42:0x00f8, B:44:0x0100, B:45:0x0115, B:47:0x0123, B:49:0x012b, B:52:0x0134, B:54:0x0143, B:56:0x014b, B:57:0x0155, B:59:0x015d, B:62:0x0167, B:63:0x0170, B:65:0x0178, B:66:0x018d, B:68:0x019b, B:70:0x01a3, B:73:0x01ac, B:75:0x01bb, B:77:0x01c3, B:78:0x01cd, B:80:0x01d5, B:83:0x01df, B:84:0x01e7, B:86:0x01ef, B:87:0x0204, B:89:0x020c, B:91:0x0213, B:93:0x021b, B:95:0x022c, B:103:0x0237, B:99:0x023a, B:101:0x0242, B:109:0x024c), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ef A[Catch: Exception -> 0x004d, TryCatch #0 {Exception -> 0x004d, blocks: (B:2:0x0000, B:4:0x0009, B:6:0x0013, B:7:0x0019, B:9:0x001f, B:12:0x002f, B:14:0x0037, B:15:0x0050, B:16:0x0065, B:20:0x0072, B:21:0x007b, B:23:0x0083, B:24:0x0098, B:26:0x00a6, B:28:0x00ae, B:31:0x00b7, B:33:0x00cb, B:35:0x00d3, B:36:0x00dd, B:38:0x00e5, B:41:0x00ef, B:42:0x00f8, B:44:0x0100, B:45:0x0115, B:47:0x0123, B:49:0x012b, B:52:0x0134, B:54:0x0143, B:56:0x014b, B:57:0x0155, B:59:0x015d, B:62:0x0167, B:63:0x0170, B:65:0x0178, B:66:0x018d, B:68:0x019b, B:70:0x01a3, B:73:0x01ac, B:75:0x01bb, B:77:0x01c3, B:78:0x01cd, B:80:0x01d5, B:83:0x01df, B:84:0x01e7, B:86:0x01ef, B:87:0x0204, B:89:0x020c, B:91:0x0213, B:93:0x021b, B:95:0x022c, B:103:0x0237, B:99:0x023a, B:101:0x0242, B:109:0x024c), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x020c A[Catch: Exception -> 0x004d, TryCatch #0 {Exception -> 0x004d, blocks: (B:2:0x0000, B:4:0x0009, B:6:0x0013, B:7:0x0019, B:9:0x001f, B:12:0x002f, B:14:0x0037, B:15:0x0050, B:16:0x0065, B:20:0x0072, B:21:0x007b, B:23:0x0083, B:24:0x0098, B:26:0x00a6, B:28:0x00ae, B:31:0x00b7, B:33:0x00cb, B:35:0x00d3, B:36:0x00dd, B:38:0x00e5, B:41:0x00ef, B:42:0x00f8, B:44:0x0100, B:45:0x0115, B:47:0x0123, B:49:0x012b, B:52:0x0134, B:54:0x0143, B:56:0x014b, B:57:0x0155, B:59:0x015d, B:62:0x0167, B:63:0x0170, B:65:0x0178, B:66:0x018d, B:68:0x019b, B:70:0x01a3, B:73:0x01ac, B:75:0x01bb, B:77:0x01c3, B:78:0x01cd, B:80:0x01d5, B:83:0x01df, B:84:0x01e7, B:86:0x01ef, B:87:0x0204, B:89:0x020c, B:91:0x0213, B:93:0x021b, B:95:0x022c, B:103:0x0237, B:99:0x023a, B:101:0x0242, B:109:0x024c), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0212  */
    /* renamed from: zM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m84411zM() {
        boolean z11;
        int size;
        int i11;
        int size2;
        int i12;
        try {
            ArrayList arrayList = new ArrayList();
            if (this.f77792n1 != null) {
                if (!this.f77794p1.isEmpty()) {
                    for (ContactProfile contactProfile : this.f77794p1) {
                        if (contactProfile.f42434r.equals("-1")) {
                            if (this.f77792n1.m126370t()) {
                                InviteContactProfile inviteContactProfile = new InviteContactProfile();
                                inviteContactProfile.f42437s = this.f77792n1.m126356f();
                                inviteContactProfile.m40403e1(false);
                                inviteContactProfile.f42407e1 = true;
                                arrayList.add(inviteContactProfile);
                            }
                            ((ContactProfile) this.f77794p1.get(0)).f42407e1 = true;
                            arrayList.add(new InviteContactProfile(contactProfile));
                            z11 = true;
                            if (!this.f77795q1.isEmpty()) {
                                if (z11) {
                                    arrayList.add(new InviteContactProfile("-8", null, null));
                                    z11 = false;
                                }
                                if (this.f77792n1.m126373w()) {
                                    InviteContactProfile inviteContactProfile2 = new InviteContactProfile();
                                    inviteContactProfile2.f42437s = this.f77792n1.m126359i();
                                    inviteContactProfile2.m40403e1(false);
                                    inviteContactProfile2.f42407e1 = true;
                                    arrayList.add(inviteContactProfile2);
                                }
                                int size3 = this.f77795q1.size();
                                if (!this.f77792n1.m126365o() && size3 > this.f77792n1.m126354d()) {
                                    size3 = this.f77792n1.m126354d();
                                }
                                int i13 = 0;
                                while (i13 < size3) {
                                    arrayList.add(new InviteContactProfile((ContactProfile) this.f77795q1.get(i13)));
                                    i13++;
                                    z11 = true;
                                }
                                if (size3 < this.f77795q1.size()) {
                                    arrayList.add(new InviteContactProfile("-4", null, null));
                                }
                            }
                            if (!this.f77788j1.isEmpty() && this.f77792n1.m126366p()) {
                                if (z11) {
                                    arrayList.add(new InviteContactProfile("-8", null, null));
                                    z11 = false;
                                }
                                if (this.f77792n1.m126372v()) {
                                    InviteContactProfile inviteContactProfile3 = new InviteContactProfile();
                                    inviteContactProfile3.f42437s = this.f77792n1.m126358h();
                                    inviteContactProfile3.m40403e1(false);
                                    inviteContactProfile3.f42407e1 = true;
                                    arrayList.add(inviteContactProfile3);
                                }
                                size2 = this.f77788j1.size();
                                if (!this.f77792n1.m126364n() && size2 > this.f77792n1.m126354d()) {
                                    size2 = this.f77792n1.m126354d();
                                }
                                i12 = 0;
                                while (i12 < size2) {
                                    arrayList.add((InviteContactProfile) this.f77788j1.get(i12));
                                    i12++;
                                    z11 = true;
                                }
                                if (size2 < this.f77788j1.size()) {
                                    arrayList.add(new InviteContactProfile("-5", null, null));
                                }
                            }
                            if (!this.f77789k1.isEmpty() && this.f77792n1.m126368r()) {
                                if (z11) {
                                    arrayList.add(new InviteContactProfile("-8", null, null));
                                    z11 = false;
                                }
                                if (this.f77792n1.m126371u()) {
                                    InviteContactProfile inviteContactProfile4 = new InviteContactProfile();
                                    inviteContactProfile4.f42437s = this.f77792n1.m126357g();
                                    inviteContactProfile4.m40403e1(false);
                                    inviteContactProfile4.f42407e1 = true;
                                    arrayList.add(inviteContactProfile4);
                                }
                                size = this.f77789k1.size();
                                if (!this.f77792n1.m126363m() && size > this.f77792n1.m126354d()) {
                                    size = this.f77792n1.m126354d();
                                }
                                i11 = 0;
                                while (i11 < size) {
                                    arrayList.add((InviteContactProfile) this.f77789k1.get(i11));
                                    i11++;
                                    z11 = true;
                                }
                                if (size < this.f77789k1.size()) {
                                    arrayList.add(new InviteContactProfile("-6", null, null));
                                }
                            }
                            if (!this.f77787i1.isEmpty() && this.f77792n1.m126367q()) {
                                if (z11) {
                                    arrayList.add(new InviteContactProfile("-8", null, null));
                                }
                                if (this.f77792n1.m126369s()) {
                                    InviteContactProfile inviteContactProfile5 = new InviteContactProfile();
                                    inviteContactProfile5.f42437s = this.f77792n1.m126355e();
                                    inviteContactProfile5.m40403e1(false);
                                    inviteContactProfile5.f42407e1 = true;
                                    arrayList.add(inviteContactProfile5);
                                }
                                if (!this.f77792n1.m126362l()) {
                                    arrayList.addAll(this.f77787i1);
                                } else {
                                    int i14 = 0;
                                    for (int i15 = 0; i15 < this.f77787i1.size(); i15++) {
                                        InviteContactProfile inviteContactProfile6 = (InviteContactProfile) this.f77787i1.get(i15);
                                        arrayList.add(inviteContactProfile6);
                                        if (inviteContactProfile6.m40366G0() && (i14 = i14 + 1) >= this.f77792n1.m126354d()) {
                                            break;
                                        }
                                    }
                                    if (i14 < this.f77787i1.size()) {
                                        arrayList.add(new InviteContactProfile("-7", null, null));
                                    }
                                }
                            }
                        }
                    }
                }
                z11 = false;
                if (!this.f77795q1.isEmpty()) {
                }
                if (!this.f77788j1.isEmpty()) {
                    if (z11) {
                    }
                    if (this.f77792n1.m126372v()) {
                    }
                    size2 = this.f77788j1.size();
                    if (!this.f77792n1.m126364n()) {
                        size2 = this.f77792n1.m126354d();
                    }
                    i12 = 0;
                    while (i12 < size2) {
                    }
                    if (size2 < this.f77788j1.size()) {
                    }
                }
                if (!this.f77789k1.isEmpty()) {
                    if (z11) {
                    }
                    if (this.f77792n1.m126371u()) {
                    }
                    size = this.f77789k1.size();
                    if (!this.f77792n1.m126363m()) {
                        size = this.f77792n1.m126354d();
                    }
                    i11 = 0;
                    while (i11 < size) {
                    }
                    if (size < this.f77789k1.size()) {
                    }
                }
                if (!this.f77787i1.isEmpty()) {
                    if (z11) {
                    }
                    if (this.f77792n1.m126369s()) {
                    }
                    if (!this.f77792n1.m126362l()) {
                    }
                }
            }
            this.f77786h1.m36142Q(arrayList);
            this.f77786h1.m10008p();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
