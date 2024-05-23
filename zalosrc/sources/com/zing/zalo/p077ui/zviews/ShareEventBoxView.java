package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ag0.AbstractC0837p0;
import am.C0943w;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.AbstractC1579n0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.AbstractC2379w;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.adapters.C7005a5;
import com.zing.zalo.adapters.C7201s0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.lottie.LottieConfig;
import com.zing.zalo.p077ui.Cocos2dxAnimationActivity;
import com.zing.zalo.p077ui.custom.PhotoToggleButton;
import com.zing.zalo.p077ui.widget.RobotoEditText;
import com.zing.zalo.p077ui.widget.StickerSuggestView;
import com.zing.zalo.p077ui.zviews.ShareEventBoxView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.p077ui.zviews.share.ShareView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.AbstractC17484n;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import ed0.AbstractC18391a;
import gg0.AbstractC19444a;
import gw.C19669z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import me0.AbstractC23112j7;
import me0.AbstractC23136l9;
import me0.AbstractC23262x6;
import mm0.AbstractC23350e;
import oc0.C24221a;
import org.json.JSONObject;
import p142ey.C18635e;
import p142ey.C18644n;
import p304ks.C21927m;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p471r3.C25630b;
import p494rv.C25979a;
import p500s1.C26087b;
import p500s1.C26088c;
import p716zh.C31973j5;
import p716zh.C32131u4;
import sx.C26406h;
import tg.C26657h;
import tg.C26674y;
import zc0.C31784b;
import zl0.AbstractC32226c;

/* loaded from: classes6.dex */
public class ShareEventBoxView extends ZaloView implements C23744a.c, C7201s0.a, InterfaceC0733x {

    /* renamed from: A0 */
    View f77630A0;

    /* renamed from: B0 */
    RecyclingImageView f77631B0;

    /* renamed from: C0 */
    RecyclingImageView f77632C0;

    /* renamed from: D0 */
    RecyclingImageView f77633D0;

    /* renamed from: E0 */
    TextView f77634E0;

    /* renamed from: F0 */
    TextView f77635F0;

    /* renamed from: G0 */
    StickerSuggestView f77636G0;

    /* renamed from: H0 */
    TextView f77637H0;

    /* renamed from: I0 */
    ImageButton f77638I0;

    /* renamed from: J0 */
    RecyclerView f77639J0;

    /* renamed from: K0 */
    C7005a5 f77640K0;

    /* renamed from: L0 */
    RecyclerView f77641L0;

    /* renamed from: M0 */
    LinearLayoutManager f77642M0;

    /* renamed from: N0 */
    C7201s0 f77643N0;

    /* renamed from: O0 */
    MultiStateView f77644O0;

    /* renamed from: P0 */
    RobotoEditText f77645P0;

    /* renamed from: Q0 */
    ImageView f77646Q0;

    /* renamed from: R0 */
    View f77647R0;

    /* renamed from: S0 */
    View f77648S0;

    /* renamed from: T0 */
    View f77649T0;

    /* renamed from: U0 */
    int f77650U0;

    /* renamed from: j1 */
    String f77665j1;

    /* renamed from: w0 */
    C32131u4 f77669w0;

    /* renamed from: x0 */
    C23528a f77670x0;

    /* renamed from: y0 */
    StickerSuggestView.AbstractC13540b f77671y0;

    /* renamed from: z0 */
    Handler f77672z0;

    /* renamed from: V0 */
    int f77651V0 = 0;

    /* renamed from: W0 */
    boolean f77652W0 = true;

    /* renamed from: X0 */
    Map f77653X0 = new HashMap();

    /* renamed from: Y0 */
    LinkedHashMap f77654Y0 = new LinkedHashMap();

    /* renamed from: Z0 */
    volatile ArrayList f77655Z0 = new ArrayList();

    /* renamed from: a1 */
    ArrayList f77656a1 = new ArrayList();

    /* renamed from: b1 */
    final String f77657b1 = MainApplication.getAppContext().getString(AbstractC8020f0.str_alphabe);

    /* renamed from: c1 */
    private C24221a f77658c1 = null;

    /* renamed from: d1 */
    private final List f77659d1 = new ArrayList();

    /* renamed from: e1 */
    private final List f77660e1 = new ArrayList();

    /* renamed from: f1 */
    final int f77661f1 = AbstractC23136l9.m118742r(60.0f);

    /* renamed from: g1 */
    boolean f77662g1 = false;

    /* renamed from: h1 */
    Runnable f77663h1 = new RunnableC15054a();

    /* renamed from: i1 */
    boolean f77664i1 = false;

    /* renamed from: k1 */
    List f77666k1 = new ArrayList();

    /* renamed from: l1 */
    List f77667l1 = new ArrayList();

    /* renamed from: m1 */
    List f77668m1 = new ArrayList();

    /* renamed from: com.zing.zalo.ui.zviews.ShareEventBoxView$a */
    /* loaded from: classes6.dex */
    class RunnableC15054a implements Runnable {
        RunnableC15054a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ShareEventBoxView.this.f77636G0.m75920d();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ShareEventBoxView$b */
    /* loaded from: classes6.dex */
    class C15055b extends StickerSuggestView.AbstractC13540b {
        C15055b() {
        }

        @Override // com.zing.zalo.p077ui.widget.StickerSuggestView.AbstractC13540b
        /* renamed from: a */
        public void mo75924a(PhotoToggleButton photoToggleButton, boolean z11) {
            ShareEventBoxView.this.m84322tL();
        }

        @Override // com.zing.zalo.p077ui.widget.StickerSuggestView.AbstractC13540b
        /* renamed from: b */
        public void mo75925b(C25630b c25630b) {
            if (c25630b.m132425e() > 0) {
                ShareEventBoxView.this.m84315YK(c25630b.m132425e() + "");
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ShareEventBoxView$c */
    /* loaded from: classes6.dex */
    class C15056c extends RecyclerView.AbstractC1892s {

        /* renamed from: a */
        final int[] f77675a = new int[2];

        /* renamed from: b */
        final int[] f77676b = new int[2];

        C15056c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            super.mo952b(recyclerView, i11);
            try {
                ShareEventBoxView shareEventBoxView = ShareEventBoxView.this;
                RobotoEditText robotoEditText = shareEventBoxView.f77645P0;
                if (robotoEditText != null && shareEventBoxView.f77652W0) {
                    AbstractC2379w.m12430d(robotoEditText);
                }
                if (i11 == 0) {
                    ShareEventBoxView shareEventBoxView2 = ShareEventBoxView.this;
                    shareEventBoxView2.f77652W0 = true;
                    C7201s0 c7201s0 = shareEventBoxView2.f77643N0;
                    c7201s0.f39468s = false;
                    c7201s0.m10008p();
                    return;
                }
                ShareEventBoxView.this.f77643N0.f39468s = true;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            super.mo10176d(recyclerView, i11, i12);
            try {
                ShareEventBoxView shareEventBoxView = ShareEventBoxView.this;
                if (shareEventBoxView.f77664i1) {
                    shareEventBoxView.f77664i1 = false;
                    return;
                }
                if (i12 > 0) {
                    int translationY = ((int) shareEventBoxView.f77648S0.getTranslationY()) - i12;
                    if (translationY < (-(ShareEventBoxView.this.f77648S0.getHeight() - ShareEventBoxView.this.f77647R0.getHeight()))) {
                        translationY = -(ShareEventBoxView.this.f77648S0.getHeight() - ShareEventBoxView.this.f77647R0.getHeight());
                    }
                    ShareEventBoxView.this.f77648S0.setTranslationY(translationY);
                    return;
                }
                View mo9732P = shareEventBoxView.f77642M0.mo9732P(0);
                if (mo9732P != null) {
                    mo9732P.getLocationInWindow(this.f77675a);
                    ShareEventBoxView.this.f77648S0.getLocationInWindow(this.f77676b);
                    int translationY2 = (this.f77675a[1] - this.f77676b[1]) + ((int) ShareEventBoxView.this.f77648S0.getTranslationY());
                    if (translationY2 < (-(ShareEventBoxView.this.f77648S0.getHeight() - ShareEventBoxView.this.f77647R0.getHeight()))) {
                        translationY2 = -(ShareEventBoxView.this.f77648S0.getHeight() - ShareEventBoxView.this.f77647R0.getHeight());
                    }
                    float f11 = translationY2;
                    if (f11 > ShareEventBoxView.this.f77648S0.getTranslationY()) {
                        ShareEventBoxView.this.f77648S0.setTranslationY(f11);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ShareEventBoxView$d */
    /* loaded from: classes6.dex */
    class C15057d extends AbstractC18391a {
        C15057d() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                if (editable.toString().trim().length() > 0) {
                    new C15061h(editable.toString().trim());
                    ShareEventBoxView.this.f77646Q0.setVisibility(0);
                    return;
                }
                ShareEventBoxView.this.f77646Q0.setVisibility(4);
                if (ShareEventBoxView.this.f77668m1.isEmpty()) {
                    new C15060g().start();
                } else {
                    ShareEventBoxView.this.m84317oL();
                    ShareEventBoxView.this.m84321sL(AbstractC8020f0.invitetalk01);
                    ShareEventBoxView.this.m84319qL(false);
                }
                ViewGroup.LayoutParams layoutParams = ShareEventBoxView.this.f77649T0.getLayoutParams();
                layoutParams.height = 0;
                ShareEventBoxView.this.f77649T0.setLayoutParams(layoutParams);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ShareEventBoxView$e */
    /* loaded from: classes6.dex */
    class ViewOnTouchListenerC15058e implements View.OnTouchListener {

        /* renamed from: p */
        float f77679p;

        /* renamed from: q */
        float f77680q;

        /* renamed from: r */
        boolean f77681r;

        ViewOnTouchListenerC15058e() {
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
                        if (Math.abs(motionEvent.getX() - this.f77679p) > AbstractC23136l9.m118742r(6.0f) || Math.abs(motionEvent.getY() - this.f77680q) > AbstractC23136l9.m118742r(6.0f)) {
                            this.f77681r = false;
                        }
                    }
                }
                if (this.f77681r && ShareEventBoxView.this.f77648S0.getTranslationY() > (-(ShareEventBoxView.this.f77648S0.getHeight() - ShareEventBoxView.this.f77647R0.getHeight()))) {
                    ShareEventBoxView shareEventBoxView = ShareEventBoxView.this;
                    shareEventBoxView.f77652W0 = false;
                    shareEventBoxView.f77641L0.m9845O1(0, (int) ((shareEventBoxView.f77648S0.getTranslationY() + ShareEventBoxView.this.f77648S0.getHeight()) - ShareEventBoxView.this.f77647R0.getHeight()));
                }
            } else {
                this.f77681r = true;
                this.f77679p = motionEvent.getX();
                this.f77680q = motionEvent.getY();
            }
            return false;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ShareEventBoxView$f */
    /* loaded from: classes6.dex */
    class C15059f extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ Runnable f77683p;

        C15059f(Runnable runnable) {
            this.f77683p = runnable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            Runnable runnable = this.f77683p;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.ShareEventBoxView$g */
    /* loaded from: classes6.dex */
    public class C15060g extends Thread {
        public C15060g() {
            super("Z:ShareEvent-GetListData");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m84324b() {
            ShareEventBoxView.this.m84317oL();
            ShareEventBoxView.this.m84321sL(AbstractC8020f0.invitetalk01);
            ShareEventBoxView.this.m84319qL(false);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ContactProfile contactProfile;
            try {
                ShareEventBoxView.this.f77666k1.clear();
                ShareEventBoxView.this.f77667l1.clear();
                ShareEventBoxView.this.f77668m1.clear();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (ContactProfile contactProfile2 : C19669z.m103146Y().m103199P()) {
                    if (ShareView.m87465QN(contactProfile2, ShareEventBoxView.this.f77658c1)) {
                        linkedHashMap.put(contactProfile2.f42434r, contactProfile2);
                    }
                }
                C18635e mo98465a = C18644n.m98531l().mo98465a(null, false);
                int m122127lb = AbstractC23309i.m122127lb();
                int size = mo98465a.size();
                int i11 = -1;
                int i12 = 0;
                boolean z11 = false;
                for (int i13 = 0; i13 < size; i13++) {
                    try {
                        contactProfile = (ContactProfile) mo98465a.get(i13);
                    } catch (Exception e11) {
                        e = e11;
                    }
                    if (contactProfile != null && ((m122127lb != 1 || contactProfile.f42382U0 != 0) && ShareView.m87465QN(contactProfile, ShareEventBoxView.this.f77658c1))) {
                        if (linkedHashMap.containsKey(contactProfile.f42434r)) {
                            linkedHashMap.put(contactProfile.f42434r, contactProfile);
                        }
                        String str = "" + contactProfile.f42440t.trim().charAt(0);
                        Locale locale = Locale.ENGLISH;
                        char charAt = str.toUpperCase(locale).charAt(0);
                        i11++;
                        if (i11 != 0) {
                            try {
                                char charAt2 = ("" + ((ContactProfile) mo98465a.get(i12)).f42440t.trim().charAt(0)).toUpperCase(locale).charAt(0);
                                if (ShareEventBoxView.this.f77657b1.indexOf(charAt2) != -1) {
                                    if (charAt > charAt2) {
                                        if (ShareEventBoxView.this.f77657b1.indexOf(charAt) != -1) {
                                            ContactProfile contactProfile3 = new ContactProfile();
                                            contactProfile3.f42437s = "" + charAt;
                                            contactProfile3.m40403e1(false);
                                            if (!z11) {
                                                contactProfile3.f42407e1 = true;
                                                z11 = true;
                                            }
                                            int size2 = ShareEventBoxView.this.f77668m1.size();
                                            if (size2 > 0) {
                                                int i14 = size2 - 1;
                                                if (((ContactProfile) ShareEventBoxView.this.f77668m1.get(i14)).m40366G0()) {
                                                    ((ContactProfile) ShareEventBoxView.this.f77668m1.get(i14)).f42405d1 = true;
                                                }
                                            }
                                            ShareEventBoxView.this.f77668m1.add(contactProfile3);
                                        } else {
                                            ContactProfile contactProfile4 = new ContactProfile();
                                            if (ShareEventBoxView.this.f77657b1.indexOf(charAt) == -1) {
                                                contactProfile4.f42437s = "##";
                                            } else {
                                                contactProfile4.f42437s = "" + charAt;
                                            }
                                            contactProfile4.m40403e1(false);
                                            if (!z11) {
                                                contactProfile4.f42407e1 = true;
                                                z11 = true;
                                            }
                                            ShareEventBoxView.this.f77668m1.add(contactProfile4);
                                        }
                                    }
                                } else if (ShareEventBoxView.this.f77657b1.indexOf(charAt) != -1) {
                                    ContactProfile contactProfile5 = new ContactProfile();
                                    contactProfile5.f42437s = "" + charAt;
                                    contactProfile5.m40403e1(false);
                                    if (!z11) {
                                        contactProfile5.f42407e1 = true;
                                        z11 = true;
                                    }
                                    int size3 = ShareEventBoxView.this.f77668m1.size();
                                    if (size3 > 0) {
                                        int i15 = size3 - 1;
                                        if (((ContactProfile) ShareEventBoxView.this.f77668m1.get(i15)).m40366G0()) {
                                            ((ContactProfile) ShareEventBoxView.this.f77668m1.get(i15)).f42405d1 = true;
                                        }
                                    }
                                    ShareEventBoxView.this.f77668m1.add(contactProfile5);
                                }
                            } catch (Exception e12) {
                                e = e12;
                                try {
                                    AbstractC23350e.m122778h(e);
                                    contactProfile.f42399a1.clear();
                                    ShareEventBoxView.this.f77668m1.add(contactProfile);
                                    i12 = i13;
                                } catch (Exception e13) {
                                    e = e13;
                                    AbstractC23350e.m122778h(e);
                                }
                            }
                        } else {
                            ContactProfile contactProfile6 = new ContactProfile();
                            if (ShareEventBoxView.this.f77657b1.indexOf(charAt) == -1) {
                                try {
                                    contactProfile6.f42437s = "#";
                                } catch (Exception e14) {
                                    e = e14;
                                    AbstractC23350e.m122778h(e);
                                    contactProfile.f42399a1.clear();
                                    ShareEventBoxView.this.f77668m1.add(contactProfile);
                                    i12 = i13;
                                }
                            } else {
                                contactProfile6.f42437s = "" + charAt;
                            }
                            contactProfile6.m40403e1(false);
                            if (!z11) {
                                contactProfile6.f42407e1 = true;
                                z11 = true;
                            }
                            ShareEventBoxView.this.f77668m1.add(contactProfile6);
                        }
                        contactProfile.f42399a1.clear();
                        ShareEventBoxView.this.f77668m1.add(contactProfile);
                        i12 = i13;
                    }
                }
                ArrayList arrayList = new ArrayList(linkedHashMap.values());
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    if (arrayList.get(i16) != null) {
                        ShareEventBoxView.this.f77666k1.add((ContactProfile) arrayList.get(i16));
                    }
                }
                if (ShareEventBoxView.this.f77658c1 != null && ShareEventBoxView.this.f77658c1.m126368r()) {
                    for (C31973j5 c31973j5 : C0943w.m4462l().m4475i()) {
                        if (c31973j5 != null && !TextUtils.isEmpty(c31973j5.m153781r())) {
                            ContactProfile contactProfile7 = new ContactProfile("group_" + c31973j5.m153781r());
                            contactProfile7.f42437s = c31973j5.m153793y();
                            if (c31973j5.m153786t0()) {
                                contactProfile7.f42446v = c31973j5.m153756e();
                            }
                            ShareEventBoxView.this.f77667l1.add(contactProfile7);
                        }
                    }
                }
            } catch (Exception e15) {
                e15.printStackTrace();
            }
            ShareEventBoxView.this.f88762c0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.ek0
                @Override // java.lang.Runnable
                public final void run() {
                    ShareEventBoxView.C15060g.this.m84324b();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.ShareEventBoxView$h */
    /* loaded from: classes6.dex */
    public class C15061h extends Thread {

        /* renamed from: p */
        String f77686p;

        public C15061h(String str) {
            super("Z:ShareEvent-Search");
            this.f77686p = str;
            start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m84326b(List list) {
            RecyclerView recyclerView;
            try {
                RobotoEditText robotoEditText = ShareEventBoxView.this.f77645P0;
                if (robotoEditText != null && this.f77686p.equals(robotoEditText.getText().toString().trim())) {
                    if (list.isEmpty()) {
                        list.add(new ContactProfile("-9"));
                    }
                    ViewGroup.LayoutParams layoutParams = ShareEventBoxView.this.f77649T0.getLayoutParams();
                    int height = (ShareEventBoxView.this.f77641L0.getHeight() - ShareEventBoxView.this.f77647R0.getHeight()) - (ShareEventBoxView.this.f77661f1 * list.size());
                    layoutParams.height = height;
                    layoutParams.height = Math.max(height, 0);
                    ShareEventBoxView.this.f77649T0.setLayoutParams(layoutParams);
                    ShareEventBoxView.this.f77643N0.m36649O(list);
                    ShareEventBoxView.this.f77643N0.m10008p();
                    if (!list.isEmpty() && (recyclerView = ShareEventBoxView.this.f77641L0) != null) {
                        recyclerView.m9837K1(0);
                        ShareEventBoxView shareEventBoxView = ShareEventBoxView.this;
                        shareEventBoxView.f77641L0.scrollBy(0, Math.abs((int) shareEventBoxView.f77648S0.getTranslationY()));
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            List<ContactProfile> m120006s = AbstractC23262x6.m120006s(this.f77686p, ShareEventBoxView.this.f77658c1.m126366p(), ShareEventBoxView.this.f77653X0, false);
            final ArrayList arrayList = new ArrayList();
            for (ContactProfile contactProfile : m120006s) {
                if (ShareView.m87465QN(contactProfile, ShareEventBoxView.this.f77658c1)) {
                    arrayList.add(contactProfile);
                }
            }
            Handler handler = ShareEventBoxView.this.f77672z0;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.fk0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ShareEventBoxView.C15061h.this.m84326b(arrayList);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ZK */
    public /* synthetic */ void m84301ZK(String str, int i11, String str2, C26657h c26657h) {
        boolean z11;
        int i12;
        try {
            if (!TextUtils.isEmpty(this.f77665j1) && TextUtils.equals(this.f77665j1, str)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.f88762c0.m92674mJ() && !this.f88762c0.m92681pJ() && this.f88762c0.m92648SI() != null && z11 && this.f88762c0.m92672lJ()) {
                if (i11 == 0 && str2 != null && c26657h != null && (i12 = c26657h.f126157b) > 0) {
                    if (i12 == 14) {
                        LottieConfig lottieConfig = c26657h.f126162g;
                        if (lottieConfig != null) {
                            C25979a.m133815f(this.f88762c0, str, str2, lottieConfig);
                            return;
                        }
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("extra_asset_path", str2);
                    bundle.putString("extra_metadata_name", "metadata");
                    bundle.putInt("extra_effect_type", c26657h.f126157b);
                    bundle.putString("extra_play_params", "{}");
                    if (Math.abs(AbstractC23309i.m122378s1() - System.currentTimeMillis()) > 86400000 && Math.abs(AbstractC23309i.m121186M5() - System.currentTimeMillis()) > 86400000) {
                        AbstractC23309i.m120756Aj(System.currentTimeMillis());
                        this.f88762c0.m92662fJ().m93069k2(Cocos2dxLoadingView.class, bundle, 0, true);
                        return;
                    } else {
                        Intent intent = new Intent(this.f88762c0.m92648SI(), (Class<?>) Cocos2dxAnimationActivity.class);
                        intent.putExtras(bundle);
                        this.f88762c0.m92641HK(intent);
                        return;
                    }
                }
                this.f77665j1 = "";
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aL */
    public /* synthetic */ void m84302aL(final int i11, final String str, final String str2, final C26657h c26657h) {
        AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.zviews.uj0
            @Override // java.lang.Runnable
            public final void run() {
                ShareEventBoxView.this.m84301ZK(str, i11, str2, c26657h);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bL */
    public /* synthetic */ void m84303bL() {
        if (this.f88762c0.m92674mJ() && !this.f88762c0.m92681pJ()) {
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.event_box_send_done));
            this.f88762c0.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cL */
    public /* synthetic */ void m84304cL(List list, C25630b c25630b) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("source", 17);
                jSONObject.put("keyword", "");
                C26406h c26406h = new C26406h();
                c26406h.m136191o(jSONObject);
                AbstractC23112j7.m118530g0(((ContactProfile) list.get(i11)).mo2478b(), c25630b, c26406h, "chat_send");
                Thread.sleep(10L);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.zviews.sj0
            @Override // java.lang.Runnable
            public final void run() {
                ShareEventBoxView.this.m84303bL();
            }
        });
        this.f77662g1 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dL */
    public /* synthetic */ void m84305dL(View view) {
        final C25630b c25630b;
        try {
            if (this.f77662g1) {
                return;
            }
            List<C25630b> selectedStickers = this.f77636G0.getSelectedStickers();
            if (selectedStickers.size() > 0) {
                c25630b = selectedStickers.get(0);
            } else {
                c25630b = null;
            }
            final ArrayList arrayList = new ArrayList(this.f77654Y0.values());
            if (c25630b == null) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.event_box_select_sticker_toast));
            } else if (arrayList.size() == 0) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.event_box_select_friend_toast));
            } else {
                this.f77662g1 = true;
                AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.zviews.bk0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ShareEventBoxView.this.m84304cL(arrayList, c25630b);
                    }
                });
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f77662g1 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: eL */
    public /* synthetic */ void m84306eL(View view) {
        this.f88762c0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fL */
    public /* synthetic */ void m84307fL(View view) {
        if (this.f77648S0.getHeight() != this.f77651V0) {
            this.f77651V0 = this.f77648S0.getHeight();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = this.f77651V0;
            view.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gL */
    public /* synthetic */ void m84308gL(RecyclerView recyclerView, int i11, View view) {
        try {
            String str = ((InviteContactProfile) this.f77656a1.get(i11)).f42434r;
            if (!TextUtils.isEmpty(str)) {
                AbstractC2379w.m12430d(this.f77645P0);
                if (!TextUtils.isEmpty(this.f77645P0.getText().toString().trim())) {
                    this.f77645P0.setText("");
                }
                this.f77643N0.f39473x = str;
                if (!m84318pL(str, true)) {
                    if (this.f77658c1 != null) {
                        Iterator it = this.f77660e1.iterator();
                        while (it.hasNext()) {
                            if (str.equals(((ContactProfile) it.next()).f42434r)) {
                                this.f77658c1.m126336K(true);
                                m84317oL();
                                m84318pL(str, false);
                                return;
                            }
                        }
                    }
                    List list = this.f77666k1;
                    if (list != null) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            if (str.equals(((ContactProfile) it2.next()).f42434r)) {
                                this.f77658c1.m126335J(true);
                                m84317oL();
                                m84318pL(str, false);
                                return;
                            }
                        }
                    }
                    List list2 = this.f77667l1;
                    if (list2 != null) {
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            if (str.equals(((ContactProfile) it3.next()).f42434r)) {
                                this.f77658c1.m126334I(true);
                                m84317oL();
                                m84318pL(str, false);
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
    /* renamed from: hL */
    public /* synthetic */ void m84309hL() {
        ArrayList arrayList;
        if (this.f77639J0 != null && (arrayList = this.f77656a1) != null && !arrayList.isEmpty()) {
            this.f77639J0.mo9854S1(this.f77656a1.size() - 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: iL */
    public /* synthetic */ void m84310iL(RecyclerView recyclerView, int i11, View view) {
        C25630b c25630b;
        try {
            this.f77650U0 = i11 - 1;
            C7201s0 c7201s0 = this.f77643N0;
            if (c7201s0 != null && c7201s0.mo10003k() > 0) {
                ContactProfile contactProfile = (ContactProfile) this.f77643N0.m36646L(this.f77650U0);
                if (contactProfile != null) {
                    int i12 = 0;
                    if (contactProfile.f42434r.startsWith("-")) {
                        if (contactProfile.f42434r.equals("-1")) {
                            AbstractC23647d.m123906p("13691");
                            AbstractC23647d.m123893c();
                            List<C25630b> selectedStickers = this.f77636G0.getSelectedStickers();
                            C17487o0 c17487o0 = null;
                            if (selectedStickers.size() > 0) {
                                c25630b = selectedStickers.get(0);
                            } else {
                                c25630b = null;
                            }
                            if (c25630b == null) {
                                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.event_box_select_sticker_toast));
                            } else {
                                Bundle bundle = new Bundle();
                                bundle.putShort("SHORT_EXTRA_CREATE_SOURCE", (short) 3);
                                if (this.f88762c0.m92676n2() != null) {
                                    c17487o0 = this.f88762c0.m92676n2().mo35579p();
                                }
                                if (c17487o0 != null) {
                                    c17487o0.m93066i2(QuickCreateGroupView.class, bundle, 12346, 1, true);
                                }
                            }
                        } else if (contactProfile.f42434r.equals("-4")) {
                            AbstractC23647d.m123906p("136920");
                            AbstractC23647d.m123893c();
                            C24221a c24221a = this.f77658c1;
                            if (c24221a != null) {
                                c24221a.m126336K(true);
                            }
                            m84317oL();
                        } else if (contactProfile.f42434r.equals("-5")) {
                            AbstractC23647d.m123906p("136921");
                            AbstractC23647d.m123893c();
                            C24221a c24221a2 = this.f77658c1;
                            if (c24221a2 != null) {
                                c24221a2.m126335J(true);
                            }
                            m84317oL();
                        } else if (contactProfile.f42434r.equals("-6")) {
                            AbstractC23647d.m123906p("136922");
                            AbstractC23647d.m123893c();
                            C24221a c24221a3 = this.f77658c1;
                            if (c24221a3 != null) {
                                c24221a3.m126334I(true);
                            }
                            m84317oL();
                        } else if (contactProfile.f42434r.equals("-7")) {
                            C24221a c24221a4 = this.f77658c1;
                            if (c24221a4 != null) {
                                c24221a4.m126333H(true);
                            }
                            m84317oL();
                        }
                    } else if (this.f77658c1.m126360j()) {
                        if (!TextUtils.isEmpty(this.f77645P0.getText().toString().trim())) {
                            if (contactProfile.m40374K0()) {
                                AbstractC23647d.m123906p("13612");
                            } else if (C21927m.m114302u().m114318P(contactProfile.f42434r)) {
                                AbstractC23647d.m123906p("13613");
                            } else {
                                AbstractC23647d.m123906p("13611");
                            }
                            AbstractC23647d.m123893c();
                        } else {
                            m84316nL(contactProfile);
                        }
                        if (this.f77654Y0.containsKey(contactProfile.f42434r)) {
                            this.f77654Y0.remove(contactProfile.f42434r);
                            int size = this.f77656a1.size() - 1;
                            while (true) {
                                if (size < 0) {
                                    break;
                                }
                                if (((InviteContactProfile) this.f77656a1.get(size)).f42434r.equals(contactProfile.f42434r)) {
                                    this.f77656a1.remove(size);
                                    break;
                                }
                                size--;
                            }
                            this.f77643N0.f39473x = "";
                            RecyclerView recyclerView2 = this.f77639J0;
                            if (this.f77656a1.isEmpty()) {
                                i12 = 8;
                            }
                            recyclerView2.setVisibility(i12);
                            this.f77640K0.m35846M(this.f77656a1);
                            this.f77640K0.m10008p();
                        } else {
                            this.f77643N0.f39473x = "";
                            this.f77654Y0.put(contactProfile.f42434r, contactProfile);
                            this.f77656a1.add(new InviteContactProfile(contactProfile));
                            RecyclerView recyclerView3 = this.f77639J0;
                            if (this.f77656a1.isEmpty()) {
                                i12 = 8;
                            }
                            recyclerView3.setVisibility(i12);
                            this.f77640K0.m35846M(this.f77656a1);
                            this.f77640K0.m10008p();
                            this.f77639J0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.dk0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ShareEventBoxView.this.m84309hL();
                                }
                            });
                        }
                    }
                }
                if (this.f77645P0 != null && this.f77658c1.m126360j()) {
                    this.f77645P0.setText("");
                    AbstractC2379w.m12430d(this.f77645P0);
                }
                m84322tL();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jL */
    public /* synthetic */ void m84311jL(View view) {
        this.f77645P0.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kL */
    public /* synthetic */ void m84312kL(final int i11) {
        LinearLayoutManager linearLayoutManager = this.f77642M0;
        if (linearLayoutManager != null && this.f77641L0 != null) {
            linearLayoutManager.mo9756v1(i11);
            this.f77641L0.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.tj0
                @Override // java.lang.Runnable
                public final void run() {
                    ShareEventBoxView.this.m84313lL(i11);
                }
            }, 16L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lL */
    public /* synthetic */ void m84313lL(int i11) {
        try {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f77647R0.getLocationInWindow(iArr);
            View mo9732P = this.f77642M0.mo9732P(i11);
            if (mo9732P != null) {
                mo9732P.getLocationInWindow(iArr2);
                if (iArr2[1] < iArr[1] + this.f77647R0.getHeight()) {
                    this.f77664i1 = true;
                    this.f77641L0.scrollBy(0, (iArr2[1] - iArr[1]) - this.f77647R0.getHeight());
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mL */
    public /* synthetic */ void m84314mL(ContactProfile contactProfile, C25630b c25630b) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("source", 17);
            jSONObject.put("keyword", "");
            C26406h c26406h = new C26406h();
            c26406h.m136191o(jSONObject);
            AbstractC23112j7.m118530g0(contactProfile.f42434r, c25630b, c26406h, "chat_send");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        this.f77662g1 = false;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        String str;
        super.mo37111CJ(bundle);
        this.f77672z0 = new Handler(Looper.getMainLooper());
        try {
            if (this.f88762c0.m92642L3() != null) {
                str = this.f88762c0.m92642L3().getString("extra_event_box_json");
            } else {
                str = "";
            }
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                this.f77669w0 = new C32131u4(jSONObject);
                if (jSONObject.has("config")) {
                    C24221a c24221a = new C24221a(jSONObject.getJSONObject("config"));
                    this.f77658c1 = c24221a;
                    this.f77659d1.addAll(c24221a.m126352b());
                    this.f77660e1.addAll(this.f77658c1.m126353c());
                }
            }
            if (this.f77658c1 == null) {
                C24221a c24221a2 = new C24221a();
                this.f77658c1 = c24221a2;
                c24221a2.m126329D(this.f77669w0.f148197b);
                this.f77658c1.m126330E(true);
                this.f77658c1.m126341P(false);
                this.f77658c1.m126337L(false);
                this.f77658c1.m126343R(true);
                this.f77658c1.m126349X(AbstractC23136l9.m118743r0(AbstractC8020f0.str_share_title_recent));
                this.f77658c1.m126339N(false);
                this.f77658c1.m126342Q(true);
                this.f77658c1.m126348W(AbstractC23136l9.m118743r0(AbstractC8020f0.str_share_title_group));
                this.f77658c1.m126338M(true);
                this.f77658c1.m126340O(true);
                this.f77658c1.m126346U(AbstractC23136l9.m118743r0(AbstractC8020f0.str_share_title_contact));
                this.f77658c1.m126333H(true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i11;
        this.f77630A0 = layoutInflater.inflate(AbstractC7409c0.event_box_view, viewGroup, false);
        if (AbstractC32226c.m155415n(this.f88762c0.m92676n2())) {
            ((ViewGroup.MarginLayoutParams) this.f77630A0.findViewById(AbstractC6918a0.eventbox_content_view).getLayoutParams()).topMargin += AbstractC17484n.Companion.m92931b();
        }
        this.f77670x0 = new C23528a(this.f88762c0.m92648SI());
        this.f77671y0 = new C15055b();
        this.f77641L0 = (RecyclerView) this.f77630A0.findViewById(AbstractC6918a0.eventbox_profile_list);
        this.f77637H0 = (TextView) this.f77630A0.findViewById(AbstractC6918a0.tv_num_friend);
        ImageButton imageButton = (ImageButton) this.f77630A0.findViewById(AbstractC6918a0.eventbox_send_btn);
        this.f77638I0 = imageButton;
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.qj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShareEventBoxView.this.m84305dL(view);
            }
        });
        ImageButton imageButton2 = (ImageButton) this.f77630A0.findViewById(AbstractC6918a0.eventbox_close_btn);
        imageButton2.setImageDrawable(AbstractC23136l9.m118665N(imageButton2.getContext(), AbstractC16803z.icn_close_eventbox));
        imageButton2.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.vj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShareEventBoxView.this.m84306eL(view);
            }
        });
        this.f77631B0 = (RecyclingImageView) this.f77630A0.findViewById(AbstractC6918a0.banner_left);
        this.f77632C0 = (RecyclingImageView) this.f77630A0.findViewById(AbstractC6918a0.banner_middle);
        this.f77633D0 = (RecyclingImageView) this.f77630A0.findViewById(AbstractC6918a0.banner_right);
        this.f77632C0.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.f77632C0.setAdjustViewBounds(true);
        this.f77632C0.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        this.f77634E0 = (TextView) this.f77630A0.findViewById(AbstractC6918a0.evnet_box_step_1);
        this.f77635F0 = (TextView) this.f77630A0.findViewById(AbstractC6918a0.evnet_box_step_2);
        StickerSuggestView stickerSuggestView = (StickerSuggestView) this.f77630A0.findViewById(AbstractC6918a0.seasonal_sticker_girdview);
        this.f77636G0 = stickerSuggestView;
        stickerSuggestView.m75922f(4, 2);
        this.f77636G0.setListener(this.f77671y0);
        this.f77636G0.setHasIconClose(false);
        this.f77636G0.setHasIndicator(false);
        this.f77636G0.setHasProgressDownload(true);
        this.f77645P0 = (RobotoEditText) this.f77630A0.findViewById(AbstractC6918a0.edit_search);
        this.f77647R0 = this.f77630A0.findViewById(AbstractC6918a0.layout_search);
        final View view = new View(this.f88762c0.m92648SI());
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, 0));
        View view2 = new View(this.f88762c0.m92648SI());
        this.f77649T0 = view2;
        view2.setLayoutParams(new ViewGroup.LayoutParams(-1, 0));
        View findViewById = this.f77630A0.findViewById(AbstractC6918a0.content_view);
        this.f77648S0 = findViewById;
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.zing.zalo.ui.zviews.wj0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                ShareEventBoxView.this.m84307fL(view);
            }
        });
        C7201s0 c7201s0 = new C7201s0(view, this.f77649T0, this.f77655Z0, this.f77654Y0, this.f77670x0, -1, this);
        this.f77643N0 = c7201s0;
        C24221a c24221a = this.f77658c1;
        if (c24221a != null) {
            c7201s0.f39464C = c24221a.m126360j();
            ImageButton imageButton3 = this.f77638I0;
            if (this.f77658c1.m126360j()) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            imageButton3.setVisibility(i11);
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f88762c0.m92648SI());
        this.f77642M0 = linearLayoutManager;
        this.f77641L0.setLayoutManager(linearLayoutManager);
        this.f77641L0.setAdapter(this.f77643N0);
        RecyclerView recyclerView = (RecyclerView) this.f77630A0.findViewById(AbstractC6918a0.rv_bubbles);
        this.f77639J0 = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f88762c0.m92648SI(), 0, false));
        C7005a5 c7005a5 = new C7005a5();
        this.f77640K0 = c7005a5;
        c7005a5.f38320t = true;
        this.f77639J0.setAdapter(c7005a5);
        C31784b.m152808a(this.f77639J0).m152809b(new C31784b.d() { // from class: com.zing.zalo.ui.zviews.xj0
            @Override // zc0.C31784b.d
            /* renamed from: i0 */
            public final void mo17458i0(RecyclerView recyclerView2, int i12, View view3) {
                ShareEventBoxView.this.m84308gL(recyclerView2, i12, view3);
            }
        });
        C31784b.m152808a(this.f77641L0).m152809b(new C31784b.d() { // from class: com.zing.zalo.ui.zviews.yj0
            @Override // zc0.C31784b.d
            /* renamed from: i0 */
            public final void mo17458i0(RecyclerView recyclerView2, int i12, View view3) {
                ShareEventBoxView.this.m84310iL(recyclerView2, i12, view3);
            }
        });
        this.f77641L0.m9826E(new C15056c());
        MultiStateView multiStateView = (MultiStateView) this.f77630A0.findViewById(AbstractC6918a0.multi_state);
        this.f77644O0 = multiStateView;
        multiStateView.setEnableLoadingText(true);
        m84321sL(AbstractC8020f0.empty_list);
        m84320rL(AbstractC8020f0.str_tv_findingFriend);
        ImageView imageView = (ImageView) this.f77630A0.findViewById(AbstractC6918a0.clear);
        this.f77646Q0 = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.zj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                ShareEventBoxView.this.m84311jL(view3);
            }
        });
        this.f77645P0.addTextChangedListener(new C15057d());
        this.f77645P0.setOnTouchListener(new ViewOnTouchListenerC15058e());
        return this.f77630A0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: HJ */
    public AnimatorSet mo39022HJ(boolean z11, Runnable runnable) {
        int m118719j0;
        AnimatorSet animatorSet = new AnimatorSet();
        if (this.f77630A0.getHeight() > 0) {
            m118719j0 = this.f77630A0.getHeight();
        } else {
            m118719j0 = AbstractC23136l9.m118719j0(this.f88762c0.m92648SI());
        }
        if (z11) {
            AbstractC1579n0.m7857b1(this.f77630A0, m118719j0);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.f77630A0, "translationY", 0.0f));
            animatorSet.setDuration(300L);
            animatorSet.setInterpolator(new C26088c());
        } else {
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.f77630A0, "translationY", m118719j0));
            animatorSet.setDuration(300L);
            animatorSet.setInterpolator(new C26087b());
        }
        animatorSet.addListener(new C15059f(runnable));
        return animatorSet;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.m124114c().m124117e(this, 40);
    }

    /* renamed from: YK */
    public synchronized void m84315YK(String str) {
        if (AbstractC23309i.m122610yb() && !TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(this.f77665j1)) {
                return;
            }
            this.f77665j1 = str;
            C26674y.m136865t().m136877n(str, "eventbox_id_" + str, new C26674y.b() { // from class: com.zing.zalo.ui.zviews.rj0
                @Override // tg.C26674y.b
                /* renamed from: a */
                public final void mo15759a(int i11, String str2, String str3, C26657h c26657h) {
                    ShareEventBoxView.this.m84302aL(i11, str2, str3, c26657h);
                }
            }, (byte) 8);
        }
    }

    @Override // com.zing.zalo.adapters.C7201s0.a
    /* renamed from: bD */
    public boolean mo36650bD(final ContactProfile contactProfile) {
        final C25630b c25630b;
        if (contactProfile != null) {
            try {
                if (this.f77662g1) {
                    return false;
                }
                List<C25630b> selectedStickers = this.f77636G0.getSelectedStickers();
                if (selectedStickers.size() > 0) {
                    c25630b = selectedStickers.get(0);
                } else {
                    c25630b = null;
                }
                if (c25630b == null) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.event_box_select_sticker_toast));
                    return false;
                }
                this.f77662g1 = true;
                AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.zviews.ak0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ShareEventBoxView.this.m84314mL(contactProfile, c25630b);
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
                this.f77662g1 = false;
            }
        }
        return true;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ShareEventBoxView";
    }

    /* renamed from: nL */
    void m84316nL(ContactProfile contactProfile) {
        List list;
        try {
            if (this.f77658c1 != null && (list = this.f77660e1) != null && list.contains(contactProfile)) {
                AbstractC23647d.m123906p("136910");
                AbstractC23647d.m123893c();
            } else {
                List list2 = this.f77666k1;
                if (list2 != null && list2.contains(contactProfile)) {
                    AbstractC23647d.m123906p("136911");
                    AbstractC23647d.m123893c();
                } else {
                    List list3 = this.f77667l1;
                    if (list3 != null && list3.contains(contactProfile)) {
                        AbstractC23647d.m123906p("136912");
                        AbstractC23647d.m123893c();
                    } else {
                        List list4 = this.f77668m1;
                        if (list4 != null && list4.contains(contactProfile)) {
                            AbstractC23647d.m123906p("136913");
                            AbstractC23647d.m123893c();
                        }
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: oL */
    public void m84317oL() {
        int i11;
        boolean z11;
        try {
            this.f77655Z0.clear();
            if (this.f77658c1 != null) {
                Iterator it = this.f77659d1.iterator();
                while (true) {
                    if (it.hasNext()) {
                        ContactProfile contactProfile = (ContactProfile) it.next();
                        if (contactProfile.f42434r.equals("-1")) {
                            if (this.f77658c1.m126370t()) {
                                ContactProfile contactProfile2 = new ContactProfile();
                                contactProfile2.f42437s = this.f77658c1.m126356f();
                                contactProfile2.m40403e1(false);
                                contactProfile2.f42407e1 = true;
                                this.f77655Z0.add(contactProfile2);
                            }
                            contactProfile.f42407e1 = true;
                            this.f77655Z0.add(contactProfile);
                            z11 = true;
                        }
                    } else {
                        z11 = false;
                        break;
                    }
                }
                if (!this.f77660e1.isEmpty()) {
                    if (z11) {
                        this.f77655Z0.add(new ContactProfile("-8"));
                        z11 = false;
                    }
                    if (this.f77658c1.m126373w()) {
                        ContactProfile contactProfile3 = new ContactProfile();
                        contactProfile3.f42437s = this.f77658c1.m126359i();
                        contactProfile3.m40403e1(false);
                        contactProfile3.f42407e1 = true;
                        this.f77655Z0.add(contactProfile3);
                    }
                    int size = this.f77660e1.size();
                    if (!this.f77658c1.m126365o() && size > this.f77658c1.m126354d()) {
                        size = this.f77658c1.m126354d();
                    }
                    int i12 = 0;
                    while (i12 < size) {
                        this.f77655Z0.add((ContactProfile) this.f77660e1.get(i12));
                        i12++;
                        z11 = true;
                    }
                    if (size < this.f77660e1.size()) {
                        this.f77655Z0.add(new ContactProfile("-4"));
                    }
                }
                if (!this.f77666k1.isEmpty() && this.f77658c1.m126366p()) {
                    if (z11) {
                        this.f77655Z0.add(new ContactProfile("-8"));
                        z11 = false;
                    }
                    if (this.f77658c1.m126372v()) {
                        ContactProfile contactProfile4 = new ContactProfile();
                        contactProfile4.f42437s = this.f77658c1.m126358h();
                        contactProfile4.m40403e1(false);
                        contactProfile4.f42407e1 = true;
                        this.f77655Z0.add(contactProfile4);
                    }
                    int size2 = this.f77666k1.size();
                    if (!this.f77658c1.m126364n() && size2 > this.f77658c1.m126354d()) {
                        size2 = this.f77658c1.m126354d();
                    }
                    int i13 = 0;
                    while (i13 < size2) {
                        this.f77655Z0.add((ContactProfile) this.f77666k1.get(i13));
                        i13++;
                        z11 = true;
                    }
                    if (size2 < this.f77666k1.size()) {
                        this.f77655Z0.add(new ContactProfile("-5"));
                    }
                }
                if (!this.f77667l1.isEmpty() && this.f77658c1.m126368r()) {
                    if (z11) {
                        this.f77655Z0.add(new ContactProfile("-8"));
                        z11 = false;
                    }
                    if (this.f77658c1.m126371u()) {
                        ContactProfile contactProfile5 = new ContactProfile();
                        contactProfile5.f42437s = this.f77658c1.m126357g();
                        contactProfile5.m40403e1(false);
                        contactProfile5.f42407e1 = true;
                        this.f77655Z0.add(contactProfile5);
                    }
                    int size3 = this.f77667l1.size();
                    if (!this.f77658c1.m126363m() && size3 > this.f77658c1.m126354d()) {
                        size3 = this.f77658c1.m126354d();
                        z11 = true;
                    }
                    for (int i14 = 0; i14 < size3; i14++) {
                        this.f77655Z0.add((ContactProfile) this.f77667l1.get(i14));
                    }
                    if (size3 < this.f77667l1.size()) {
                        this.f77655Z0.add(new ContactProfile("-6"));
                    }
                }
                if (!this.f77668m1.isEmpty() && this.f77658c1.m126367q()) {
                    if (z11) {
                        this.f77655Z0.add(new ContactProfile("-8"));
                    }
                    if (this.f77658c1.m126369s()) {
                        ContactProfile contactProfile6 = new ContactProfile();
                        contactProfile6.f42437s = this.f77658c1.m126355e();
                        contactProfile6.m40403e1(false);
                        contactProfile6.f42407e1 = true;
                        this.f77655Z0.add(contactProfile6);
                    }
                    if (this.f77658c1.m126362l()) {
                        this.f77655Z0.addAll(this.f77668m1);
                    } else {
                        int i15 = 0;
                        for (i11 = 0; i11 < this.f77668m1.size(); i11++) {
                            ContactProfile contactProfile7 = (ContactProfile) this.f77668m1.get(i11);
                            this.f77655Z0.add(contactProfile7);
                            if (contactProfile7.m40366G0() && (i15 = i15 + 1) >= this.f77658c1.m126354d()) {
                                break;
                            }
                        }
                        if (i15 < this.f77668m1.size()) {
                            this.f77655Z0.add(new ContactProfile("-7"));
                        }
                    }
                }
            } else {
                if (this.f77666k1.size() > 0) {
                    this.f77655Z0.addAll(this.f77666k1);
                }
                if (this.f77668m1.size() > 0) {
                    this.f77655Z0.addAll(this.f77668m1);
                }
            }
            C7201s0 c7201s0 = this.f77643N0;
            if (c7201s0 != null) {
                c7201s0.m36649O(this.f77655Z0);
                this.f77643N0.m10008p();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == 12346 && i12 == -1 && intent.hasExtra("groupId")) {
            String stringExtra = intent.getStringExtra("groupId");
            if (!TextUtils.isEmpty(stringExtra)) {
                mo36650bD(new ContactProfile("group_" + stringExtra));
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        this.f77665j1 = "";
    }

    /* renamed from: pL */
    boolean m84318pL(String str, boolean z11) {
        for (int i11 = 0; i11 < this.f77655Z0.size(); i11++) {
            try {
                if (str.equals(((ContactProfile) this.f77655Z0.get(i11)).f42434r)) {
                    if (z11) {
                        this.f77643N0.m10008p();
                    }
                    final int i12 = i11 + 1;
                    this.f77641L0.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.ck0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ShareEventBoxView.this.m84312kL(i12);
                        }
                    }, 100L);
                    return true;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return false;
    }

    /* renamed from: qL */
    void m84319qL(boolean z11) {
        if (z11) {
            this.f77648S0.setVisibility(8);
            this.f77644O0.setVisibility(0);
            this.f77644O0.setState(MultiStateView.EnumC15914e.LOADING);
        } else if (this.f77643N0.mo10003k() > 1) {
            this.f77648S0.setVisibility(0);
            this.f77644O0.setVisibility(8);
        } else {
            this.f77648S0.setVisibility(8);
            this.f77644O0.setVisibility(0);
            this.f77644O0.setState(MultiStateView.EnumC15914e.EMPTY);
        }
    }

    /* renamed from: rL */
    void m84320rL(int i11) {
        MultiStateView multiStateView = this.f77644O0;
        if (multiStateView != null) {
            multiStateView.setLoadingString(AbstractC23136l9.m118743r0(i11));
        }
    }

    /* renamed from: sL */
    void m84321sL(int i11) {
        MultiStateView multiStateView = this.f77644O0;
        if (multiStateView != null) {
            multiStateView.setEmptyViewString(AbstractC23136l9.m118743r0(i11));
        }
    }

    /* renamed from: tL */
    void m84322tL() {
        C25630b c25630b;
        List<C25630b> selectedStickers = this.f77636G0.getSelectedStickers();
        int i11 = 0;
        if (selectedStickers.size() > 0) {
            c25630b = selectedStickers.get(0);
        } else {
            c25630b = null;
        }
        ArrayList arrayList = new ArrayList(this.f77654Y0.values());
        this.f77637H0.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.event_box_send_to, Integer.valueOf(arrayList.size())));
        TextView textView = this.f77637H0;
        if (arrayList.size() == 0) {
            i11 = 8;
        }
        textView.setVisibility(i11);
        if (c25630b != null && arrayList.size() != 0) {
            if (this.f77669w0.f148197b == 1) {
                this.f77638I0.setImageResource(AbstractC16803z.btn_send_forgirl);
                return;
            } else {
                this.f77638I0.setImageResource(AbstractC16803z.btn_send);
                return;
            }
        }
        this.f77638I0.setImageResource(AbstractC16803z.btn_send_disable);
    }

    @Override // p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 == 40) {
            try {
                if (this.f88762c0.m92674mJ() && !this.f88762c0.m92681pJ()) {
                    this.f77672z0.post(this.f77663h1);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        try {
            if (this.f77658c1.m126351a() == 1) {
                this.f77636G0.m75921e(true, AbstractC16803z.radbox_forgirl_checked, AbstractC16803z.radbox_forgirl_uncheck);
                C7201s0 c7201s0 = this.f77643N0;
                c7201s0.f39474y = AbstractC16801x.eventbox_female_color;
                c7201s0.f39475z = AbstractC16803z.mat_btn_check_pink;
            } else {
                this.f77636G0.m75921e(true, AbstractC16803z.radbox_checked, AbstractC16803z.radbox_forgirl_uncheck);
                C7201s0 c7201s02 = this.f77643N0;
                c7201s02.f39474y = AbstractC16801x.eventbox_male_color;
                c7201s02.f39475z = AbstractC16803z.mat_btn_check;
            }
            if (!TextUtils.isEmpty(this.f77669w0.f148200e)) {
                this.f77631B0.setVisibility(0);
                ((C23528a) this.f77670x0.m123612r(this.f77631B0)).m123616v(this.f77669w0.f148200e);
            } else {
                this.f77631B0.setVisibility(4);
            }
            if (!TextUtils.isEmpty(this.f77669w0.f148201f)) {
                this.f77632C0.setVisibility(0);
                ((C23528a) this.f77670x0.m123612r(this.f77632C0)).m123616v(this.f77669w0.f148201f);
            } else {
                this.f77632C0.setVisibility(4);
            }
            if (!TextUtils.isEmpty(this.f77669w0.f148202g)) {
                this.f77633D0.setVisibility(0);
                ((C23528a) this.f77670x0.m123612r(this.f77633D0)).m123616v(this.f77669w0.f148202g);
            } else {
                this.f77633D0.setVisibility(4);
            }
            if (!TextUtils.isEmpty(this.f77669w0.f148198c)) {
                this.f77634E0.setVisibility(0);
                this.f77634E0.setText(this.f77669w0.f148198c);
            } else {
                this.f77634E0.setVisibility(4);
            }
            if (!TextUtils.isEmpty(this.f77669w0.f148199d)) {
                this.f77635F0.setVisibility(0);
                this.f77635F0.setText(this.f77669w0.f148199d);
            } else {
                this.f77635F0.setVisibility(4);
            }
            List list = this.f77669w0.f148203h;
            if (list != null && list.size() > 0) {
                this.f77636G0.m75923g(this.f77669w0.f148203h);
            } else {
                this.f77636G0.m75923g(new ArrayList());
            }
            m84322tL();
            this.f77636G0.post(this.f77663h1);
            new C15060g().start();
        } catch (Exception unused) {
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.m124114c().m124115b(this, 40);
    }
}
