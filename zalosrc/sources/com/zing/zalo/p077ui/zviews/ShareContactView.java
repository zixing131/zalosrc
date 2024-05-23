package com.zing.zalo.p077ui.zviews;

import ag0.AbstractC0837p0;
import ag0.C0815e1;
import am.AbstractC0906d0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.adapters.C7005a5;
import com.zing.zalo.adapters.C7129l5;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.p077ui.widget.KeyboardFrameLayout;
import com.zing.zalo.p077ui.widget.StencilSwitch;
import com.zing.zalo.p077ui.zviews.ShareContactView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalocore.CoreUtility;
import ed0.AbstractC18391a;
import gw.C19669z;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import me0.AbstractC23034c6;
import me0.AbstractC23056e6;
import me0.AbstractC23126l;
import me0.AbstractC23136l9;
import me0.AbstractC23262x6;
import mm0.AbstractC23350e;
import p142ey.C18635e;
import p142ey.C18638h;
import p142ey.C18644n;
import p304ks.C21927m;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p348mi.C23302b;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p361nb.C23648e;
import p461qu.AbstractC25495a;
import p716zh.C31901e8;
import p716zh.C32093r8;
import vg.AbstractC28034c7;
import vg.C28203u6;
import zc0.C31784b;

/* loaded from: classes6.dex */
public class ShareContactView extends SlidableZaloView implements KeyboardFrameLayout.InterfaceC13508a {

    /* renamed from: G1 */
    static final String f77576G1 = "ShareContactView";

    /* renamed from: P0 */
    MultiStateView f77583P0;

    /* renamed from: Q0 */
    RecyclerView f77584Q0;

    /* renamed from: R0 */
    private C7005a5 f77585R0;

    /* renamed from: S0 */
    ListView f77586S0;

    /* renamed from: T0 */
    View f77587T0;

    /* renamed from: U0 */
    StencilSwitch f77588U0;

    /* renamed from: V0 */
    EditText f77589V0;

    /* renamed from: W0 */
    LinearLayout f77590W0;

    /* renamed from: X0 */
    LinearLayout f77591X0;

    /* renamed from: Y0 */
    ImageView f77592Y0;

    /* renamed from: Z0 */
    ImageView f77593Z0;

    /* renamed from: a1 */
    View f77594a1;

    /* renamed from: b1 */
    View f77595b1;

    /* renamed from: c1 */
    LinearLayout f77596c1;

    /* renamed from: d1 */
    KeyboardFrameLayout f77597d1;

    /* renamed from: e1 */
    ValueAnimator f77598e1;

    /* renamed from: f1 */
    LinearLayout f77599f1;

    /* renamed from: g1 */
    LinearLayout f77600g1;

    /* renamed from: h1 */
    ValueAnimator f77601h1;

    /* renamed from: i1 */
    ValueAnimator f77602i1;

    /* renamed from: j1 */
    ViewTreeObserver.OnGlobalLayoutListener f77603j1;

    /* renamed from: k1 */
    ViewTreeObserver.OnGlobalLayoutListener f77604k1;

    /* renamed from: l1 */
    int f77605l1;

    /* renamed from: m1 */
    private C7129l5 f77606m1;

    /* renamed from: p1 */
    C23528a f77609p1;

    /* renamed from: r1 */
    private int f77611r1;

    /* renamed from: t1 */
    ArrayList f77613t1;

    /* renamed from: u1 */
    ArrayList f77614u1;

    /* renamed from: y1 */
    View f77618y1;

    /* renamed from: n1 */
    boolean f77607n1 = false;

    /* renamed from: o1 */
    final String f77608o1 = MainApplication.getAppContext().getString(AbstractC8020f0.str_alphabe);

    /* renamed from: q1 */
    int f77610q1 = 30;

    /* renamed from: s1 */
    LinkedHashMap f77612s1 = new LinkedHashMap();

    /* renamed from: v1 */
    ArrayList f77615v1 = new ArrayList();

    /* renamed from: w1 */
    ArrayList f77616w1 = new ArrayList();

    /* renamed from: x1 */
    ArrayList f77617x1 = new ArrayList();

    /* renamed from: z1 */
    Map f77619z1 = Collections.synchronizedMap(new HashMap());

    /* renamed from: A1 */
    String f77577A1 = "";

    /* renamed from: B1 */
    String f77578B1 = "0";

    /* renamed from: C1 */
    Runnable f77579C1 = new RunnableC15047a();

    /* renamed from: D1 */
    TextWatcher f77580D1 = new C15048b();

    /* renamed from: E1 */
    boolean f77581E1 = false;

    /* renamed from: F1 */
    final Object f77582F1 = new Object();

    /* renamed from: com.zing.zalo.ui.zviews.ShareContactView$a */
    /* loaded from: classes6.dex */
    class RunnableC15047a implements Runnable {
        RunnableC15047a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ShareContactView.this.f77584Q0.mo9854S1(r0.f77617x1.size() - 1);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ShareContactView$b */
    /* loaded from: classes6.dex */
    class C15048b extends AbstractC18391a {
        C15048b() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            EditText editText = ShareContactView.this.f77589V0;
            if (editText != null && editText.getText() != null) {
                new C15053g(ShareContactView.this.f77589V0.getText().toString().trim());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.ShareContactView$c */
    /* loaded from: classes6.dex */
    public class C15049c extends AbstractC28034c7 {
        C15049c() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i11) {
            try {
                if (i11 == 0) {
                    ShareContactView.this.f77606m1.m36306e(false);
                    ShareContactView.this.f77606m1.notifyDataSetChanged();
                } else {
                    ShareContactView.this.f77606m1.m36306e(true);
                    AbstractC2379w.m12430d(ShareContactView.this.f77589V0);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.ShareContactView$d */
    /* loaded from: classes6.dex */
    public class C15050d extends AnimatorListenerAdapter {
        C15050d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ShareContactView.this.m84234CM();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.ShareContactView$e */
    /* loaded from: classes6.dex */
    public class C15051e extends AnimatorListenerAdapter {
        C15051e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ShareContactView.this.f77590W0.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.ShareContactView$f */
    /* loaded from: classes6.dex */
    public class C15052f extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ int f77625p;

        C15052f(int i11) {
            this.f77625p = i11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            try {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ShareContactView.this.f77599f1.getLayoutParams();
                layoutParams.bottomMargin = this.f77625p;
                ShareContactView.this.f77599f1.setLayoutParams(layoutParams);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.ShareContactView$g */
    /* loaded from: classes6.dex */
    public class C15053g extends Thread {

        /* renamed from: p */
        final String f77627p;

        /* renamed from: q */
        int f77628q;

        public C15053g(String str) {
            super("Z:ShareContact-Search");
            this.f77628q = 0;
            this.f77627p = str;
            start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m84285b(ArrayList arrayList) {
            try {
                if (this.f77627p.equals(ShareContactView.this.f77589V0.getText().toString().trim())) {
                    if (ShareContactView.this.f77606m1 != null) {
                        ShareContactView.this.f77606m1.m36305d(arrayList);
                        ShareContactView.this.f77606m1.notifyDataSetChanged();
                    }
                    ShareContactView.this.m84277ZM(AbstractC8020f0.str_emptyResult);
                    ShareContactView.this.m84275XM(false);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                String str = this.f77627p;
                if (str != null && !str.equals("")) {
                    ShareContactView.this.m84282xM(this.f77627p, arrayList2);
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        InviteContactProfile inviteContactProfile = (InviteContactProfile) arrayList2.get(i11);
                        try {
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                        if (!inviteContactProfile.f42434r.equals(CoreUtility.f89233i)) {
                            if (!AbstractC25495a.m132086k(inviteContactProfile.f42434r)) {
                                if (!inviteContactProfile.m40372J0()) {
                                    if (C21927m.m114302u().m114312J().m153137g(inviteContactProfile.f42434r)) {
                                    }
                                    arrayList.add(inviteContactProfile);
                                    this.f77628q++;
                                }
                            }
                        }
                    }
                    ShareContactView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.pj0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ShareContactView.C15053g.this.m84285b(arrayList);
                        }
                    });
                    return;
                }
                ShareContactView shareContactView = ShareContactView.this;
                if (shareContactView.f77581E1) {
                    shareContactView.m84273VM();
                } else {
                    shareContactView.m84272TM();
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
    }

    /* renamed from: AM */
    private void m84232AM() {
        C15050d c15050d = new C15050d();
        C15051e c15051e = new C15051e();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f77601h1 = ofFloat;
        ofFloat.setDuration(200L);
        this.f77601h1.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.zviews.oj0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ShareContactView.this.m84235DM(valueAnimator);
            }
        });
        this.f77601h1.addListener(c15050d);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f77602i1 = ofFloat2;
        ofFloat2.setDuration(200L);
        this.f77602i1.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.zviews.bj0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ShareContactView.this.m84236EM(valueAnimator);
            }
        });
        this.f77602i1.addListener(c15051e);
    }

    /* renamed from: BM */
    private void m84233BM(float f11, float f12, final int i11) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f12);
        this.f77598e1 = ofFloat;
        ofFloat.setDuration(200L);
        this.f77598e1.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.zviews.mj0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ShareContactView.this.m84237FM(i11, valueAnimator);
            }
        });
        this.f77598e1.addListener(new C15052f(i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CM */
    public void m84234CM() {
        try {
            if (this.f77595b1.getLayoutParams().height != this.f77611r1) {
                this.f77595b1.getLayoutParams().height = this.f77611r1;
                this.f77595b1.requestLayout();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DM */
    public /* synthetic */ void m84235DM(ValueAnimator valueAnimator) {
        try {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f77590W0.setTranslationY(r0.getHeight() * floatValue);
            this.f77590W0.setAlpha(1.0f - floatValue);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EM */
    public /* synthetic */ void m84236EM(ValueAnimator valueAnimator) {
        try {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f77590W0.setTranslationY(r0.getHeight() * floatValue);
            this.f77590W0.setAlpha(1.0f - floatValue);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FM */
    public /* synthetic */ void m84237FM(int i11, ValueAnimator valueAnimator) {
        try {
            this.f77600g1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue() * i11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GM */
    public /* synthetic */ WindowInsets m84238GM(View view, WindowInsets windowInsets) {
        final View view2 = this.f77618y1;
        Objects.requireNonNull(view2);
        view2.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.dj0
            @Override // java.lang.Runnable
            public final void run() {
                view2.requestLayout();
            }
        });
        return windowInsets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HM */
    public static /* synthetic */ int m84239HM(ContactProfile contactProfile, ContactProfile contactProfile2) {
        return contactProfile.f42440t.compareToIgnoreCase(contactProfile2.f42440t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IM */
    public /* synthetic */ void m84240IM() {
        ArrayList arrayList = new ArrayList();
        try {
            try {
                ArrayList arrayList2 = new ArrayList(C18644n.m98531l().mo98465a(null, false));
                List m2802h = AbstractC0906d0.m2802h(this.f72421L0.m92648SI().getApplicationContext());
                HashMap hashMap = new HashMap();
                for (int i11 = 0; i11 < m2802h.size(); i11++) {
                    C31901e8 c31901e8 = (C31901e8) m2802h.get(i11);
                    try {
                        String trim = c31901e8.m153298m().trim();
                        C31901e8 m2800f = AbstractC0906d0.m2800f(this.f72421L0.m92648SI().getApplicationContext(), trim);
                        if ((m2800f == null || m2800f.m153300r() <= 0) && ((!c31901e8.m153301s() || !c31901e8.m153298m().equals(AbstractC23304d.f113394i0)) && !trim.equals("") && !trim.equalsIgnoreCase(AbstractC23056e6.f112062a) && !hashMap.containsKey(trim))) {
                            hashMap.put(c31901e8.m153298m().trim(), Boolean.TRUE);
                            ContactProfile contactProfile = new ContactProfile("-" + trim);
                            contactProfile.f42455y = trim;
                            contactProfile.f42437s = c31901e8.m153295h();
                            contactProfile.f42440t = c31901e8.m153296i();
                            contactProfile.f42382U0 = 1;
                            contactProfile.f42446v = C23302b.f113247a.m120521a();
                            arrayList2.add(contactProfile);
                        }
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
                Collections.sort(arrayList2, new Comparator() { // from class: com.zing.zalo.ui.zviews.ej0
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int m84239HM;
                        m84239HM = ShareContactView.m84239HM((ContactProfile) obj, (ContactProfile) obj2);
                        return m84239HM;
                    }
                });
                int size = arrayList2.size();
                int i12 = -1;
                int i13 = 0;
                for (int i14 = 0; i14 < size; i14++) {
                    try {
                        ContactProfile contactProfile2 = (ContactProfile) arrayList2.get(i14);
                        if (contactProfile2 != null) {
                            InviteContactProfile inviteContactProfile = new InviteContactProfile(contactProfile2);
                            if (!inviteContactProfile.f42434r.equals(CoreUtility.f89233i) && !AbstractC25495a.m132086k(inviteContactProfile.f42434r) && !inviteContactProfile.m40372J0() && !C21927m.m114302u().m114312J().m153137g(inviteContactProfile.f42434r)) {
                                String str = "" + inviteContactProfile.f42440t.trim().charAt(0);
                                Locale locale = Locale.ENGLISH;
                                char charAt = str.toUpperCase(locale).charAt(0);
                                i12++;
                                if (i12 != 0) {
                                    try {
                                        char charAt2 = ("" + ((ContactProfile) arrayList2.get(i13)).f42440t.trim().charAt(0)).toUpperCase(locale).charAt(0);
                                        if (this.f77608o1.indexOf(charAt2) != -1) {
                                            if (charAt > charAt2) {
                                                if (this.f77608o1.indexOf(charAt) != -1) {
                                                    InviteContactProfile inviteContactProfile2 = new InviteContactProfile();
                                                    inviteContactProfile2.f42437s = "" + charAt;
                                                    inviteContactProfile2.m40403e1(false);
                                                    int size2 = arrayList.size();
                                                    if (size2 > 0) {
                                                        int i15 = size2 - 1;
                                                        if (((InviteContactProfile) arrayList.get(i15)).m40366G0()) {
                                                            ((InviteContactProfile) arrayList.get(i15)).f42405d1 = true;
                                                        }
                                                    }
                                                    arrayList.add(inviteContactProfile2);
                                                } else {
                                                    InviteContactProfile inviteContactProfile3 = new InviteContactProfile();
                                                    if (this.f77608o1.indexOf(charAt) == -1) {
                                                        inviteContactProfile3.f42437s = "##";
                                                    } else {
                                                        inviteContactProfile3.f42437s = "" + charAt;
                                                    }
                                                    inviteContactProfile3.m40403e1(false);
                                                    arrayList.add(inviteContactProfile3);
                                                }
                                            }
                                        } else if (this.f77608o1.indexOf(charAt) != -1) {
                                            InviteContactProfile inviteContactProfile4 = new InviteContactProfile();
                                            inviteContactProfile4.f42437s = "" + charAt;
                                            inviteContactProfile4.m40403e1(false);
                                            int size3 = arrayList.size();
                                            if (size3 > 0) {
                                                int i16 = size3 - 1;
                                                if (((InviteContactProfile) arrayList.get(i16)).m40366G0()) {
                                                    ((InviteContactProfile) arrayList.get(i16)).f42405d1 = true;
                                                }
                                            }
                                            arrayList.add(inviteContactProfile4);
                                        }
                                    } catch (Exception e12) {
                                        AbstractC20110a.m104539h(e12);
                                    }
                                } else {
                                    InviteContactProfile inviteContactProfile5 = new InviteContactProfile();
                                    if (this.f77608o1.indexOf(charAt) == -1) {
                                        inviteContactProfile5.f42437s = "#";
                                    } else {
                                        inviteContactProfile5.f42437s = "" + charAt;
                                    }
                                    inviteContactProfile5.m40403e1(false);
                                    arrayList.add(inviteContactProfile5);
                                }
                                inviteContactProfile.f42399a1.clear();
                                arrayList.add(inviteContactProfile);
                                i13 = i14;
                            }
                        }
                    } catch (Exception e13) {
                        AbstractC20110a.m104539h(e13);
                    }
                }
                synchronized (this.f77582F1) {
                    this.f77613t1 = arrayList;
                    this.f77582F1.notifyAll();
                }
            } catch (Throwable th2) {
                synchronized (this.f77582F1) {
                    this.f77613t1 = arrayList;
                    this.f77582F1.notifyAll();
                    m84274WM(arrayList, false);
                    throw th2;
                }
            }
        } catch (Exception e14) {
            e14.printStackTrace();
            synchronized (this.f77582F1) {
                this.f77613t1 = arrayList;
                this.f77582F1.notifyAll();
            }
        }
        m84274WM(arrayList, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JM */
    public /* synthetic */ void m84241JM() {
        ArrayList arrayList = new ArrayList();
        try {
            try {
                C18635e mo98465a = C18644n.m98531l().mo98465a(null, false);
                int m122127lb = AbstractC23309i.m122127lb();
                int size = mo98465a.size();
                int i11 = -1;
                int i12 = 0;
                for (int i13 = 0; i13 < size; i13++) {
                    try {
                        ContactProfile contactProfile = (ContactProfile) mo98465a.get(i13);
                        if (contactProfile != null) {
                            InviteContactProfile inviteContactProfile = new InviteContactProfile(contactProfile);
                            if (!inviteContactProfile.f42434r.equals(CoreUtility.f89233i) && !AbstractC25495a.m132086k(inviteContactProfile.f42434r) && !inviteContactProfile.m40372J0() && !C21927m.m114302u().m114312J().m153137g(inviteContactProfile.f42434r) && (m122127lb != 1 || inviteContactProfile.f42382U0 != 0)) {
                                String str = "" + inviteContactProfile.f42440t.trim().charAt(0);
                                Locale locale = Locale.ENGLISH;
                                char charAt = str.toUpperCase(locale).charAt(0);
                                i11++;
                                if (i11 != 0) {
                                    try {
                                        char charAt2 = ("" + ((ContactProfile) mo98465a.get(i12)).f42440t.trim().charAt(0)).toUpperCase(locale).charAt(0);
                                        if (this.f77608o1.indexOf(charAt2) != -1) {
                                            if (charAt > charAt2) {
                                                if (this.f77608o1.indexOf(charAt) != -1) {
                                                    InviteContactProfile inviteContactProfile2 = new InviteContactProfile();
                                                    inviteContactProfile2.f42437s = "" + charAt;
                                                    inviteContactProfile2.m40403e1(false);
                                                    int size2 = arrayList.size();
                                                    if (size2 > 0) {
                                                        int i14 = size2 - 1;
                                                        if (((InviteContactProfile) arrayList.get(i14)).m40366G0()) {
                                                            ((InviteContactProfile) arrayList.get(i14)).f42405d1 = true;
                                                        }
                                                    }
                                                    arrayList.add(inviteContactProfile2);
                                                } else {
                                                    InviteContactProfile inviteContactProfile3 = new InviteContactProfile();
                                                    if (this.f77608o1.indexOf(charAt) == -1) {
                                                        inviteContactProfile3.f42437s = "##";
                                                    } else {
                                                        inviteContactProfile3.f42437s = "" + charAt;
                                                    }
                                                    inviteContactProfile3.m40403e1(false);
                                                    arrayList.add(inviteContactProfile3);
                                                }
                                            }
                                        } else if (this.f77608o1.indexOf(charAt) != -1) {
                                            InviteContactProfile inviteContactProfile4 = new InviteContactProfile();
                                            inviteContactProfile4.f42437s = "" + charAt;
                                            inviteContactProfile4.m40403e1(false);
                                            int size3 = arrayList.size();
                                            if (size3 > 0) {
                                                int i15 = size3 - 1;
                                                if (((InviteContactProfile) arrayList.get(i15)).m40366G0()) {
                                                    ((InviteContactProfile) arrayList.get(i15)).f42405d1 = true;
                                                }
                                            }
                                            arrayList.add(inviteContactProfile4);
                                        }
                                    } catch (Exception e11) {
                                        AbstractC20110a.m104539h(e11);
                                    }
                                } else {
                                    InviteContactProfile inviteContactProfile5 = new InviteContactProfile();
                                    if (this.f77608o1.indexOf(charAt) == -1) {
                                        inviteContactProfile5.f42437s = "#";
                                    } else {
                                        inviteContactProfile5.f42437s = "" + charAt;
                                    }
                                    inviteContactProfile5.m40403e1(false);
                                    arrayList.add(inviteContactProfile5);
                                }
                                inviteContactProfile.f42399a1.clear();
                                arrayList.add(inviteContactProfile);
                                i12 = i13;
                            }
                        }
                    } catch (Exception e12) {
                        AbstractC23350e.m122778h(e12);
                    }
                }
                synchronized (this.f77582F1) {
                    this.f77614u1 = arrayList;
                    this.f77582F1.notifyAll();
                }
            } catch (Throwable th2) {
                synchronized (this.f77582F1) {
                    this.f77614u1 = arrayList;
                    this.f77582F1.notifyAll();
                    m84274WM(arrayList, true);
                    throw th2;
                }
            }
        } catch (Exception e13) {
            e13.printStackTrace();
            synchronized (this.f77582F1) {
                this.f77614u1 = arrayList;
                this.f77582F1.notifyAll();
            }
        }
        m84274WM(arrayList, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KM */
    public /* synthetic */ void m84242KM(boolean z11, ArrayList arrayList) {
        if (z11) {
            try {
                if (this.f77617x1.size() > 0) {
                    for (int size = this.f77617x1.size() - 1; size >= 0; size--) {
                        InviteContactProfile inviteContactProfile = (InviteContactProfile) this.f77617x1.get(size);
                        if (inviteContactProfile.f42434r.startsWith("-")) {
                            this.f77617x1.remove(size);
                            this.f77612s1.remove(inviteContactProfile.f42434r);
                        }
                    }
                    m84250UM();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        if (this.f77606m1 != null && this.f77581E1 == z11 && TextUtils.isEmpty(this.f77589V0.getText().toString().trim())) {
            this.f77606m1.m36305d(arrayList);
            this.f77606m1.notifyDataSetChanged();
            m84277ZM(AbstractC8020f0.invitetalk01);
            m84275XM(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LM */
    public /* synthetic */ void m84243LM(RecyclerView recyclerView, int i11, View view) {
        try {
            m84283zM((InviteContactProfile) this.f77617x1.get(i11));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MM */
    public /* synthetic */ void m84244MM() {
        LinearLayout linearLayout = this.f77591X0;
        if (linearLayout != null && linearLayout.getHeight() > 0) {
            m84251dN();
            m84279bN();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NM */
    public /* synthetic */ void m84245NM(View view) {
        AbstractC2379w.m12430d(this.f77589V0);
        m84271SM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OM */
    public /* synthetic */ void m84246OM() {
        LinearLayout linearLayout = this.f77596c1;
        if (linearLayout != null && linearLayout.getHeight() > 0) {
            m84252eN();
            m84279bN();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PM */
    public /* synthetic */ void m84247PM(CompoundButton compoundButton, boolean z11) {
        boolean z12 = !z11;
        this.f77581E1 = z12;
        if (z12) {
            this.f77589V0.setHint(m92652XI(AbstractC8020f0.str_hint_search_tab_zalo_share_contact));
            this.f77606m1.f38974z = false;
            m84273VM();
        } else {
            this.f77589V0.setHint(m92652XI(AbstractC8020f0.str_hint_search_tab_all_share_contact));
            this.f77606m1.f38974z = true;
            m84272TM();
        }
        String trim = this.f77589V0.getText().toString().trim();
        if (!TextUtils.isEmpty(trim)) {
            new C15053g(trim);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: QM */
    public /* synthetic */ void m84248QM(AdapterView adapterView, View view, int i11, long j11) {
        try {
            if (this.f77606m1.m36303b()) {
                return;
            }
            this.f77605l1 = i11 - this.f77586S0.getHeaderViewsCount();
            C7129l5 c7129l5 = this.f77606m1;
            if (c7129l5 != null && c7129l5.getCount() > 0) {
                m84283zM((InviteContactProfile) this.f77606m1.getItem(this.f77605l1));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: RM */
    private void m84249RM(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        try {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                InviteContactProfile inviteContactProfile = (InviteContactProfile) it.next();
                if (inviteContactProfile != null && !inviteContactProfile.f42434r.startsWith("-") && TextUtils.isDigitsOnly(inviteContactProfile.f42434r)) {
                    arrayList2.add(inviteContactProfile.f42434r);
                }
            }
            if (!arrayList2.isEmpty()) {
                C18638h.m98500f().m98508n(arrayList2);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: UM */
    private void m84250UM() {
        if (this.f77617x1.isEmpty()) {
            m84280cN(8);
        } else {
            this.f77585R0.m35846M(this.f77617x1);
            this.f77585R0.m10008p();
            m84280cN(0);
        }
        m84281fN();
    }

    /* renamed from: dN */
    private void m84251dN() {
        try {
            LinearLayout linearLayout = this.f77591X0;
            if (linearLayout != null && this.f77603j1 != null) {
                linearLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this.f77603j1);
                this.f77603j1 = null;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: eN */
    private void m84252eN() {
        try {
            LinearLayout linearLayout = this.f77596c1;
            if (linearLayout != null && this.f77604k1 != null) {
                linearLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this.f77604k1);
                this.f77604k1 = null;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: wM */
    private void m84269wM(List list) {
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (!this.f77581E1 || C18644n.m98531l().m98558u(str)) {
                            if (str.startsWith("-")) {
                                String substring = str.substring(1);
                                C31901e8 m2800f = AbstractC0906d0.m2800f(this.f72421L0.m92648SI().getApplicationContext(), substring);
                                if (m2800f != null && m2800f.m153300r() <= 0) {
                                    InviteContactProfile inviteContactProfile = new InviteContactProfile(str, C23302b.f113247a.m120521a(), m2800f.m153295h());
                                    inviteContactProfile.f42455y = substring;
                                    inviteContactProfile.f42440t = m2800f.m153296i();
                                    inviteContactProfile.f42382U0 = 1;
                                    if (this.f77612s1.put(inviteContactProfile.f42434r, inviteContactProfile) == null) {
                                        this.f77617x1.add(inviteContactProfile);
                                    }
                                }
                            } else {
                                ContactProfile m141811g = C28203u6.f131407a.m141811g(str);
                                if (m141811g != null) {
                                    InviteContactProfile inviteContactProfile2 = new InviteContactProfile(m141811g);
                                    if (this.f77612s1.put(inviteContactProfile2.f42434r, inviteContactProfile2) == null) {
                                        this.f77617x1.add(inviteContactProfile2);
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: yM */
    private void m84270yM(boolean z11) {
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            int i11 = m92642L3.getInt("extra_max_pick_count", 30);
            this.f77610q1 = i11;
            if (i11 < 0) {
                this.f77610q1 = 30;
            }
            if (!z11) {
                m84269wM(m92642L3.getStringArrayList("extra_preselect_uids"));
                m84250UM();
            }
            this.f77577A1 = m92642L3.getString("STR_SOURCE_START_VIEW", "");
            this.f77578B1 = m92642L3.getString("STR_LOG_CHAT_TYPE", "0");
            C0815e1.m2075D().m2100V(new C23648e(10, this.f77577A1, 1, "chat_send_contact", this.f77578B1), false);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        this.f77609p1 = new C23528a(this.f72421L0.m92648SI());
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f77618y1 = layoutInflater.inflate(AbstractC7409c0.share_contact_view_new, viewGroup, false);
        m92637BK(true);
        m84278aN(bundle);
        return this.f77618y1;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        m84252eN();
        m84251dN();
        super.mo37484JJ();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 16908332) {
            try {
                AbstractC2379w.m12430d(this.f77589V0);
                this.f72421L0.finish();
                return true;
            } catch (Exception unused) {
                return super.mo37491QJ(i11);
            }
        }
        return true;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        super.mo37118SJ(bundle);
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            Iterator it = this.f77617x1.iterator();
            while (it.hasNext()) {
                arrayList.add(((ContactProfile) it.next()).f42434r);
            }
            bundle.putStringArrayList("listSelect", arrayList);
            bundle.putBoolean("isTabZalo", !this.f77588U0.isChecked());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: SM */
    void m84271SM() {
        try {
            if (this.f77587T0.getVisibility() == 0) {
                AbstractC23309i.m121166Lm(this.f77588U0.isChecked());
            }
            if (this.f77607n1) {
                return;
            }
            this.f77607n1 = true;
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            LinkedHashMap linkedHashMap = this.f77612s1;
            if (linkedHashMap != null) {
                for (InviteContactProfile inviteContactProfile : linkedHashMap.values()) {
                    if (inviteContactProfile != null && !TextUtils.isEmpty(inviteContactProfile.f42434r) && !TextUtils.isEmpty(inviteContactProfile.f42437s)) {
                        arrayList.add(inviteContactProfile);
                    }
                }
                Intent intent = new Intent();
                intent.putParcelableArrayListExtra("extra_selected_profiles", arrayList);
                C7129l5 c7129l5 = this.f77606m1;
                if (c7129l5 != null) {
                    intent.putExtra("extra_share_phone_number", c7129l5.f38974z);
                }
                this.f72421L0.mo50035CK(-1, intent);
                if (this.f77581E1) {
                    AbstractC23647d.m123906p("91741");
                    AbstractC23647d.m123893c();
                    C7129l5 c7129l52 = this.f77606m1;
                    if (c7129l52 != null && c7129l52.f38974z) {
                        AbstractC23647d.m123906p("917410");
                        AbstractC23647d.m123893c();
                    }
                } else {
                    AbstractC23647d.m123906p("91742");
                    AbstractC23647d.m123893c();
                }
                m84249RM(arrayList);
            } else {
                Intent intent2 = new Intent();
                intent2.putParcelableArrayListExtra("extra_selected_profiles", null);
                this.f72421L0.mo50035CK(-1, intent2);
            }
            this.f72421L0.finish();
        } catch (Exception unused) {
            if (!this.f72421L0.mo60294yp()) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general));
            }
            this.f77607n1 = false;
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_sharecontact_title));
                AbstractC23136l9.m118690Z0(this.f88760a0);
                m84281fN();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: TM */
    public void m84272TM() {
        ArrayList arrayList = this.f77613t1;
        if (arrayList != null) {
            m84274WM(arrayList, false);
        } else {
            AbstractC0837p0.m2224e().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.zviews.nj0
                @Override // java.lang.Runnable
                public final void run() {
                    ShareContactView.this.m84240IM();
                }
            });
        }
    }

    /* renamed from: VM */
    public void m84273VM() {
        ArrayList arrayList = this.f77614u1;
        if (arrayList != null) {
            m84274WM(arrayList, true);
        } else {
            AbstractC0837p0.m2224e().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.zviews.cj0
                @Override // java.lang.Runnable
                public final void run() {
                    ShareContactView.this.m84241JM();
                }
            });
        }
    }

    /* renamed from: WM */
    public void m84274WM(final ArrayList arrayList, final boolean z11) {
        try {
            this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.fj0
                @Override // java.lang.Runnable
                public final void run() {
                    ShareContactView.this.m84242KM(z11, arrayList);
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: XM */
    void m84275XM(boolean z11) {
        if (z11) {
            this.f77583P0.setVisibility(0);
            this.f77583P0.setState(MultiStateView.EnumC15914e.LOADING);
        } else if (this.f77606m1.getCount() > 0) {
            this.f77583P0.setVisibility(8);
        } else {
            this.f77583P0.setVisibility(0);
            this.f77583P0.setState(MultiStateView.EnumC15914e.EMPTY);
        }
    }

    /* renamed from: YM */
    void m84276YM(int i11) {
        MultiStateView multiStateView = this.f77583P0;
        if (multiStateView != null) {
            multiStateView.setLoadingString(AbstractC23136l9.m118743r0(i11));
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        super.mo37125ZJ(view, bundle);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f77618y1.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.zing.zalo.ui.zviews.lj0
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    WindowInsets m84238GM;
                    m84238GM = ShareContactView.this.m84238GM(view2, windowInsets);
                    return m84238GM;
                }
            });
        }
    }

    /* renamed from: ZM */
    void m84277ZM(int i11) {
        MultiStateView multiStateView = this.f77583P0;
        if (multiStateView != null) {
            multiStateView.setEmptyViewString(AbstractC23136l9.m118743r0(i11));
        }
    }

    /* renamed from: aN */
    void m84278aN(Bundle bundle) {
        boolean z11;
        try {
            RecyclerView recyclerView = (RecyclerView) this.f77618y1.findViewById(AbstractC6918a0.rv_bubbles);
            this.f77584Q0 = recyclerView;
            recyclerView.setLayoutManager(new LinearLayoutManager(this.f72421L0.m92648SI(), 0, false));
            C7005a5 c7005a5 = new C7005a5();
            this.f77585R0 = c7005a5;
            c7005a5.f38320t = false;
            c7005a5.f38321u = true;
            this.f77584Q0.setAdapter(c7005a5);
            C31784b.m152808a(this.f77584Q0).m152809b(new C31784b.d() { // from class: com.zing.zalo.ui.zviews.aj0
                @Override // zc0.C31784b.d
                /* renamed from: i0 */
                public final void mo17458i0(RecyclerView recyclerView2, int i11, View view) {
                    ShareContactView.this.m84243LM(recyclerView2, i11, view);
                }
            });
            this.f77587T0 = this.f77618y1.findViewById(AbstractC6918a0.layout_bottom);
            this.f77590W0 = (LinearLayout) this.f77618y1.findViewById(AbstractC6918a0.bubble_footer);
            LinearLayout linearLayout = (LinearLayout) this.f77618y1.findViewById(AbstractC6918a0.content_bubble_footer);
            this.f77591X0 = linearLayout;
            ViewTreeObserver viewTreeObserver = linearLayout.getViewTreeObserver();
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.zing.zalo.ui.zviews.gj0
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    ShareContactView.this.m84244MM();
                }
            };
            this.f77603j1 = onGlobalLayoutListener;
            viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
            this.f77591X0.setOnClickListener(null);
            ImageView imageView = (ImageView) this.f77618y1.findViewById(AbstractC6918a0.btn_done_add_item);
            this.f77592Y0 = imageView;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.hj0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ShareContactView.this.m84245NM(view);
                }
            });
            this.f77593Z0 = (ImageView) this.f77618y1.findViewById(AbstractC6918a0.layout_bottom_shadow);
            this.f77594a1 = this.f77618y1.findViewById(AbstractC6918a0.layout_bottom_line);
            this.f77595b1 = this.f77618y1.findViewById(AbstractC6918a0.fake_space_footer);
            LinearLayout linearLayout2 = (LinearLayout) this.f77618y1.findViewById(AbstractC6918a0.layout_bottom_content);
            this.f77596c1 = linearLayout2;
            ViewTreeObserver viewTreeObserver2 = linearLayout2.getViewTreeObserver();
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.zing.zalo.ui.zviews.ij0
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    ShareContactView.this.m84246OM();
                }
            };
            this.f77604k1 = onGlobalLayoutListener2;
            viewTreeObserver2.addOnGlobalLayoutListener(onGlobalLayoutListener2);
            this.f77599f1 = (LinearLayout) this.f77618y1.findViewById(AbstractC6918a0.main_layout);
            this.f77600g1 = (LinearLayout) this.f77618y1.findViewById(AbstractC6918a0.footer_layout);
            KeyboardFrameLayout keyboardFrameLayout = (KeyboardFrameLayout) this.f77618y1.findViewById(AbstractC6918a0.keyboard_layout);
            this.f77597d1 = keyboardFrameLayout;
            keyboardFrameLayout.setOnKeyboardListener(this);
            if (AbstractC23034c6.m118167n(this.f72421L0.m92648SI(), AbstractC23034c6.f112032i) != 0) {
                this.f77587T0.setVisibility(8);
                this.f77593Z0.setVisibility(8);
            }
            StencilSwitch stencilSwitch = (StencilSwitch) this.f77618y1.findViewById(AbstractC6918a0.sw_show_phone_number);
            this.f77588U0 = stencilSwitch;
            stencilSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zing.zalo.ui.zviews.jj0
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z12) {
                    ShareContactView.this.m84247PM(compoundButton, z12);
                }
            });
            EditText editText = (EditText) this.f77618y1.findViewById(AbstractC6918a0.search_input_text);
            this.f77589V0 = editText;
            editText.addTextChangedListener(this.f77580D1);
            this.f77586S0 = (ListView) this.f77618y1.findViewById(AbstractC6918a0.phoneList);
            MultiStateView multiStateView = (MultiStateView) this.f77618y1.findViewById(AbstractC6918a0.multi_state);
            this.f77583P0 = multiStateView;
            multiStateView.setEnableLoadingText(true);
            m84277ZM(AbstractC8020f0.empty_list);
            m84276YM(AbstractC8020f0.str_tv_findingFriend);
            this.f77586S0.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.zing.zalo.ui.zviews.kj0
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i11, long j11) {
                    ShareContactView.this.m84248QM(adapterView, view, i11, j11);
                }
            });
            this.f77586S0.setOnScrollListener(new C15049c());
            m84232AM();
            m84280cN(8);
            C7129l5 c7129l5 = new C7129l5(this.f72421L0.m92648SI(), new ArrayList(), this.f77612s1, this.f77609p1, -1);
            this.f77606m1 = c7129l5;
            this.f77586S0.setAdapter((ListAdapter) c7129l5);
            m84275XM(true);
            if (this.f77587T0.getVisibility() == 0) {
                this.f77588U0.setChecked(AbstractC23309i.m121085Jf());
            } else {
                this.f77588U0.setChecked(false);
            }
            this.f77581E1 = !this.f77588U0.isChecked();
            if (bundle != null) {
                try {
                    if (this.f77587T0.getVisibility() == 0) {
                        this.f77581E1 = bundle.getBoolean("isTabZalo", true);
                    } else {
                        this.f77581E1 = true;
                    }
                    this.f77588U0.setChecked(!this.f77581E1);
                    m84269wM(bundle.getStringArrayList("listSelect"));
                    m84250UM();
                    z11 = true;
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } else {
                z11 = false;
            }
            m84270yM(z11);
            if (this.f77581E1) {
                this.f77589V0.setHint(m92652XI(AbstractC8020f0.str_hint_search_tab_zalo_share_contact));
                this.f77606m1.f38974z = false;
                m84273VM();
            } else {
                this.f77589V0.setHint(m92652XI(AbstractC8020f0.str_hint_search_tab_all_share_contact));
                this.f77606m1.f38974z = true;
                m84272TM();
            }
            AbstractC23126l.m118627a(f77576G1);
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    /* renamed from: bN */
    void m84279bN() {
        ArrayList arrayList = this.f77617x1;
        if (arrayList != null && arrayList.size() > 0) {
            m84280cN(0);
        } else {
            m84280cN(8);
        }
    }

    /* renamed from: cN */
    void m84280cN(int i11) {
        boolean z11;
        try {
            this.f77611r1 = 0;
            if (this.f77596c1.getVisibility() == 0) {
                this.f77611r1 += this.f77596c1.getHeight();
                z11 = true;
            } else {
                z11 = false;
            }
            if (i11 == 0) {
                int height = this.f77611r1 + this.f77591X0.getHeight();
                this.f77611r1 = height;
                if (z11) {
                    this.f77611r1 = height + this.f77594a1.getHeight();
                }
                this.f77593Z0.setVisibility(8);
                this.f77594a1.setVisibility(0);
                if (this.f77602i1.isRunning()) {
                    this.f77602i1.cancel();
                }
                int visibility = this.f77590W0.getVisibility();
                this.f77590W0.setVisibility(0);
                if (!this.f77601h1.isRunning() && visibility != 0) {
                    this.f77601h1.start();
                    return;
                }
                return;
            }
            this.f77593Z0.setVisibility(0);
            this.f77594a1.setVisibility(8);
            if (this.f77601h1.isRunning()) {
                this.f77601h1.cancel();
            }
            m84234CM();
            if (!this.f77602i1.isRunning() && this.f77590W0.getVisibility() == 0) {
                this.f77602i1.start();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: fN */
    void m84281fN() {
        LinkedHashMap linkedHashMap;
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null && (linkedHashMap = this.f77612s1) != null) {
            actionBar.setSubtitle(AbstractC23136l9.m118746s0(AbstractC8020f0.str_count_character_invitation_prefix, Integer.valueOf(linkedHashMap.size()), Integer.valueOf(this.f77610q1)));
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return f77576G1;
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (super.onKeyUp(i11, keyEvent)) {
            return true;
        }
        if (i11 == 4) {
            this.f72421L0.finish();
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        if (AbstractC23034c6.m118167n(this.f72421L0.m92648SI(), AbstractC23034c6.f112032i) != 0) {
            if (this.f77587T0.getVisibility() == 0) {
                this.f77587T0.setVisibility(8);
                this.f77593Z0.setVisibility(8);
                this.f77588U0.setChecked(false);
            }
        } else if (this.f77587T0.getVisibility() == 8) {
            this.f77587T0.setVisibility(0);
            if (this.f77594a1.getVisibility() == 8) {
                this.f77593Z0.setVisibility(0);
            }
            this.f77588U0.setChecked(AbstractC23309i.m121085Jf());
        }
        this.f77581E1 = !this.f77588U0.isChecked();
        AbstractC23136l9.m118686X0(this.f72421L0.m92676n2().getWindow(), false);
        if (this.f72421L0.m92676n2() instanceof Activity) {
            this.f72421L0.m92676n2().mo35554O(AbstractC2379w.m12428b() | 2);
        }
    }

    /* renamed from: xM */
    public void m84282xM(String str, ArrayList arrayList) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        try {
            String m120002o = AbstractC23262x6.m120002o(str);
            if (this.f77581E1) {
                arrayList2 = this.f77614u1;
            } else {
                arrayList2 = this.f77613t1;
            }
            if (arrayList2 == null) {
                synchronized (this.f77582F1) {
                    try {
                        if (this.f77581E1) {
                            m84273VM();
                        } else {
                            m84272TM();
                        }
                        while (arrayList2 == null) {
                            this.f77582F1.wait();
                            if (this.f77581E1) {
                                arrayList2 = this.f77614u1;
                            } else {
                                arrayList2 = this.f77613t1;
                            }
                        }
                    } finally {
                    }
                }
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                InviteContactProfile inviteContactProfile = (InviteContactProfile) it.next();
                if (!TextUtils.isEmpty(inviteContactProfile.f42434r)) {
                    arrayList4.add(inviteContactProfile);
                }
            }
            boolean z11 = true;
            if (AbstractC23309i.m122127lb() != 1) {
                z11 = false;
            }
            String[] m119967B = AbstractC23262x6.m119967B(m120002o);
            long currentTimeMillis = System.currentTimeMillis();
            ArrayList arrayList5 = new ArrayList();
            if (!this.f77619z1.containsKey(m120002o)) {
                for (Map.Entry entry : AbstractC23304d.f113429r.entrySet()) {
                    String[] m119970E = AbstractC23262x6.m119970E((String) entry.getKey());
                    ArrayList arrayList6 = (ArrayList) entry.getValue();
                    float m120001n = AbstractC23262x6.m120001n(m119967B, m119970E);
                    if (m120001n > 0.0f) {
                        for (int i11 = 0; i11 < arrayList6.size(); i11++) {
                            C32093r8 c32093r8 = new C32093r8();
                            c32093r8.f147887d = ((C32093r8) arrayList6.get(i11)).f147887d;
                            c32093r8.f147884a = ((C32093r8) arrayList6.get(i11)).f147884a;
                            c32093r8.f147886c = ((C32093r8) arrayList6.get(i11)).f147886c;
                            c32093r8.f147890g = m120001n;
                            c32093r8.f147885b = ((C32093r8) arrayList6.get(i11)).f147885b;
                            c32093r8.f147893j = ((C32093r8) arrayList6.get(i11)).f147893j;
                            arrayList5.add(c32093r8);
                        }
                        this.f77619z1.put(m120002o, arrayList5);
                    }
                }
                arrayList3 = arrayList5;
            } else {
                arrayList3 = (ArrayList) this.f77619z1.get(m120002o);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("TimeCheckTopHit: ");
            sb2.append(System.currentTimeMillis() - currentTimeMillis);
            AbstractC23262x6.m120004q(m120002o, arrayList4, arrayList, z11, C19669z.f97573U, arrayList3);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
    /* renamed from: y1 */
    public void mo37136y1(int i11) {
        if (!m92676n2().mo35576n3()) {
            return;
        }
        ValueAnimator valueAnimator = this.f77598e1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f77599f1.getLayoutParams();
        layoutParams.bottomMargin = 0;
        this.f77599f1.setLayoutParams(layoutParams);
        this.f77600g1.setTranslationY(0.0f);
    }

    @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
    /* renamed from: z3 */
    public void mo37138z3(int i11) {
        try {
            if (!m92676n2().mo35576n3()) {
                return;
            }
            float translationY = this.f77600g1.getTranslationY() / i11;
            ValueAnimator valueAnimator = this.f77598e1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f77598e1.setFloatValues(translationY, -1.0f);
            } else {
                m84233BM(translationY, -1.0f, i11);
            }
            this.f77598e1.start();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: zM */
    public void m84283zM(InviteContactProfile inviteContactProfile) {
        ArrayList arrayList;
        if (inviteContactProfile != null) {
            if (this.f77612s1.containsKey(inviteContactProfile.f42434r)) {
                this.f77617x1.remove(inviteContactProfile);
                this.f77612s1.remove(inviteContactProfile.f42434r);
                if (this.f77617x1.size() == 0) {
                    m84280cN(8);
                }
                C7129l5 c7129l5 = this.f77606m1;
                if (c7129l5 != null && c7129l5.m36302a().equals(inviteContactProfile.f42434r)) {
                    this.f77606m1.m36307f("");
                    this.f77585R0.m35847N("");
                }
                this.f77585R0.m35846M(this.f77617x1);
                this.f77585R0.m10008p();
                EditText editText = this.f77589V0;
                if (editText != null && !TextUtils.isEmpty(editText.getEditableText().toString())) {
                    this.f77589V0.setText("");
                }
                m84281fN();
            } else {
                int size = this.f77612s1.size();
                int i11 = this.f77610q1;
                if (size >= i11) {
                    ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.profile_picker_max_pick_inform, Integer.valueOf(i11)));
                } else {
                    if (inviteContactProfile.m40374K0() && !this.f77616w1.contains(inviteContactProfile) && !this.f77615v1.contains(inviteContactProfile)) {
                        this.f77616w1.add(inviteContactProfile);
                    }
                    this.f77617x1.add(inviteContactProfile);
                    this.f77612s1.put(inviteContactProfile.f42434r, inviteContactProfile);
                    this.f77585R0.m35846M(this.f77617x1);
                    this.f77585R0.m10008p();
                    m84280cN(0);
                    this.f77584Q0.post(this.f77579C1);
                    EditText editText2 = this.f77589V0;
                    if (editText2 != null && !TextUtils.isEmpty(editText2.getEditableText().toString())) {
                        this.f77589V0.setText("");
                    }
                    m84281fN();
                }
            }
        }
        if (this.f77581E1) {
            arrayList = this.f77614u1;
        } else {
            arrayList = this.f77613t1;
        }
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        this.f77606m1.m36305d(arrayList);
        this.f77606m1.notifyDataSetChanged();
    }
}
