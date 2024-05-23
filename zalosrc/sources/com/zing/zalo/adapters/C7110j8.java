package com.zing.zalo.adapters;

import ag0.AbstractC0840r;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import c30.C3245i;
import c30.C3251l;
import c30.C3255n;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.C7110j8;
import com.zing.zalo.adapters.C7157o0;
import com.zing.zalo.p077ui.StickerView;
import com.zing.zalo.p077ui.picker.stickerpanel.StickerPanelView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uicomponents.reddot.RedDotImageView;
import com.zing.zalo.utils.ToastUtils;
import gg0.AbstractC19444a;
import gn.C19515b;
import gn.C19516c;
import hm0.C20096c;
import ho0.AbstractC20110a;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import me0.AbstractC23136l9;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p193h0.AbstractC19694b;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p379o3.AbstractC24006q;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24002m;
import p394oj.C24280f;
import p471r3.C25630b;
import p485rj.C25811c;
import p588vw.C28644j;
import th.AbstractC26683d;
import vg.AbstractC28025b8;
import vg.C28020b3;
import vg.C28212v6;
import z90.InterfaceC31726a;
import zl0.AbstractC32232i;

/* renamed from: com.zing.zalo.adapters.j8 */
/* loaded from: classes3.dex */
public class C7110j8 extends RecyclerView.AbstractC1880g implements C28644j.p {

    /* renamed from: B */
    private final d f38859B;

    /* renamed from: C */
    private int f38860C;

    /* renamed from: D */
    private int f38861D;

    /* renamed from: F */
    private boolean f38863F;

    /* renamed from: H */
    public int f38865H;

    /* renamed from: t */
    private boolean f38873t;

    /* renamed from: u */
    private Integer f38874u;

    /* renamed from: v */
    private C3245i f38875v;

    /* renamed from: w */
    private final C23528a f38876w;

    /* renamed from: z */
    private InterfaceC31726a f38879z;

    /* renamed from: r */
    public int f38871r = -1;

    /* renamed from: s */
    private int f38872s = -1;

    /* renamed from: x */
    private final Map f38877x = new LinkedHashMap();

    /* renamed from: y */
    private final List f38878y = new ArrayList();

    /* renamed from: A */
    private boolean f38858A = true;

    /* renamed from: E */
    private String f38862E = "";

    /* renamed from: G */
    private boolean f38864G = false;

    /* renamed from: I */
    StickerView.InterfaceC10959a f38866I = new StickerView.InterfaceC10959a() { // from class: com.zing.zalo.adapters.d8
        public /* synthetic */ C7044d8() {
        }

        @Override // com.zing.zalo.p077ui.StickerView.InterfaceC10959a
        /* renamed from: a */
        public final boolean mo35967a() {
            boolean m36229m0;
            m36229m0 = C7110j8.this.m36229m0();
            return m36229m0;
        }
    };

    /* renamed from: J */
    private final View.OnTouchListener f38867J = new b();

    /* renamed from: K */
    private final View.OnClickListener f38868K = new View.OnClickListener() { // from class: com.zing.zalo.adapters.e8
        public /* synthetic */ ViewOnClickListenerC7055e8() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C7110j8.this.m36236w0(view);
        }
    };

    /* renamed from: L */
    private final View.OnLongClickListener f38869L = new View.OnLongClickListener() { // from class: com.zing.zalo.adapters.f8
        public /* synthetic */ ViewOnLongClickListenerC7066f8() {
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            boolean m36237x0;
            m36237x0 = C7110j8.this.m36237x0(view);
            return m36237x0;
        }
    };

    /* renamed from: M */
    private boolean f38870M = false;

    /* renamed from: com.zing.zalo.adapters.j8$a */
    /* loaded from: classes3.dex */
    public class a extends C28020b3.b {

        /* renamed from: a */
        final /* synthetic */ RecyclingImageView f38880a;

        a(RecyclingImageView recyclingImageView) {
            this.f38880a = recyclingImageView;
        }

        @Override // vg.C28020b3.b
        /* renamed from: a */
        public void mo36247a(String str, C25630b c25630b, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            super.mo36247a(str, c25630b, interfaceC3968a, c3979l, c23995f);
            C28020b3.f130648a.m141178A(c25630b, this.f38880a, c23995f, C7110j8.this.f38863F);
        }

        @Override // vg.C28020b3.b
        /* renamed from: b */
        public void mo35607b(String str, C25630b c25630b, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            super.mo35607b(str, c25630b, interfaceC3968a, c3979l, c23995f);
            C28020b3.f130648a.m141179B(c25630b, this.f38880a, c3979l, C7110j8.this.f38863F, C7110j8.this.f38862E, C7110j8.this.f38864G);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.adapters.j8$b */
    /* loaded from: classes3.dex */
    public class b implements View.OnTouchListener {
        b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (view != null && motionEvent != null) {
                int action = motionEvent.getAction();
                if ((action == 1 || action == 3) && (view instanceof StickerView) && C7110j8.this.f38879z != null) {
                    C7110j8.this.f38879z.mo16641h(((StickerView) view).getEmoticon());
                    return false;
                }
                return false;
            }
            return false;
        }
    }

    /* renamed from: com.zing.zalo.adapters.j8$c */
    /* loaded from: classes3.dex */
    public class c implements C19516c.c {

        /* renamed from: a */
        final /* synthetic */ StickerPanelView.InterfaceC12880b f38883a;

        c(StickerPanelView.InterfaceC12880b interfaceC12880b) {
            this.f38883a = interfaceC12880b;
        }

        /* renamed from: e */
        public static /* synthetic */ void m36250e(int i11, StickerPanelView.InterfaceC12880b interfaceC12880b, C20096c c20096c) {
            try {
                C28020b3.f130648a.m141190S(i11, false);
                if (interfaceC12880b != null) {
                    interfaceC12880b.mo36267a(c20096c);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: f */
        public /* synthetic */ void m36251f(int i11, ArrayList arrayList, StickerPanelView.InterfaceC12880b interfaceC12880b) {
            try {
                C28020b3 c28020b3 = C28020b3.f130648a;
                c28020b3.m141185J(i11);
                c28020b3.m141184I(arrayList);
                if (C7110j8.this.f38879z != null) {
                    C7110j8.this.f38879z.mo16638e();
                }
                if (interfaceC12880b != null) {
                    interfaceC12880b.mo36269c();
                }
                C28644j.m143233Y().m143292X0();
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }

        @Override // gn.C19516c.c
        /* renamed from: a */
        public void mo2310a(int i11, C20096c c20096c) {
            AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.adapters.k8

                /* renamed from: p */
                public final /* synthetic */ int f38948p;

                /* renamed from: q */
                public final /* synthetic */ StickerPanelView.InterfaceC12880b f38949q;

                /* renamed from: r */
                public final /* synthetic */ C20096c f38950r;

                public /* synthetic */ RunnableC7121k8(int i112, StickerPanelView.InterfaceC12880b interfaceC12880b, C20096c c20096c2) {
                    r1 = i112;
                    r2 = interfaceC12880b;
                    r3 = c20096c2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C7110j8.c.m36250e(r1, r2, r3);
                }
            });
        }

        @Override // gn.C19516c.c
        /* renamed from: b */
        public void mo2311b(int i11, ArrayList arrayList) {
            AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.adapters.l8

                /* renamed from: q */
                public final /* synthetic */ int f38987q;

                /* renamed from: r */
                public final /* synthetic */ ArrayList f38988r;

                /* renamed from: s */
                public final /* synthetic */ StickerPanelView.InterfaceC12880b f38989s;

                public /* synthetic */ RunnableC7132l8(int i112, ArrayList arrayList2, StickerPanelView.InterfaceC12880b interfaceC12880b) {
                    r2 = i112;
                    r3 = arrayList2;
                    r4 = interfaceC12880b;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C7110j8.c.this.m36251f(r2, r3, r4);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.adapters.j8$e */
    /* loaded from: classes3.dex */
    public static class e extends RecyclerView.AbstractC1876c0 {
        e(View view) {
            super(view);
        }

        /* renamed from: i0 */
        public abstract void mo36252i0(C3245i c3245i, int i11);
    }

    /* renamed from: com.zing.zalo.adapters.j8$f */
    /* loaded from: classes3.dex */
    public class f extends e {

        /* renamed from: I */
        int f38891I;

        /* renamed from: J */
        StickerView[] f38892J;

        /* renamed from: K */
        ProgressBar[] f38893K;

        /* renamed from: L */
        ImageView[] f38894L;

        /* renamed from: M */
        LinearLayout f38895M;

        /* renamed from: N */
        int f38896N;

        /* renamed from: com.zing.zalo.adapters.j8$f$a */
        /* loaded from: classes3.dex */
        class a extends C24002m {

            /* renamed from: A0 */
            final /* synthetic */ C24280f f38898A0;

            /* renamed from: y0 */
            final /* synthetic */ String f38900y0;

            /* renamed from: z0 */
            final /* synthetic */ StickerView f38901z0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(int i11, String str, StickerView stickerView, C24280f c24280f) {
                super(i11);
                this.f38900y0 = str;
                this.f38901z0 = stickerView;
                this.f38898A0 = c24280f;
            }

            @Override // p379o3.C24002m
            /* renamed from: E1 */
            protected void mo16457E1(String str, InterfaceC3968a interfaceC3968a, File file, C23995f c23995f) {
                if (file != null && !TextUtils.isEmpty(file.getPath()) && Objects.equals(this.f38900y0, str)) {
                    C28020b3.f130648a.m141188Q(str, file.getPath());
                    f.this.m36262s0(this.f38901z0, this.f38898A0);
                }
            }
        }

        f(View view, int i11, d dVar, int i12) {
            super(view);
            this.f38891I = i11;
            this.f38895M = (LinearLayout) view;
            this.f38892J = new StickerView[i11];
            this.f38893K = new ProgressBar[i11];
            this.f38896N = i12;
            if (dVar != null && dVar.f38889t) {
                this.f38894L = new ImageView[i11];
            }
            for (int i13 = 0; i13 < this.f38891I; i13++) {
                View childAt = this.f38895M.getChildAt(i13);
                this.f38892J[i13] = (StickerView) childAt.findViewById(AbstractC6918a0.sticker_item_element);
                this.f38893K[i13] = (ProgressBar) childAt.findViewById(AbstractC6918a0.progress_id);
                if (dVar != null) {
                    this.f38892J[i13].getLayoutParams().width = dVar.f38886q;
                    this.f38892J[i13].getLayoutParams().height = dVar.f38886q;
                    this.f38892J[i13].m56981m(0, dVar.f38887r, 0, dVar.f38888s);
                }
                ImageView[] imageViewArr = this.f38894L;
                if (imageViewArr != null) {
                    imageViewArr[i13] = (ImageView) childAt.findViewById(AbstractC6918a0.sticker_icon_voice);
                    this.f38894L[i13].setImageResource(AbstractC16803z.anim_stickervoice_right_4);
                }
            }
        }

        /* renamed from: o0 */
        public /* synthetic */ void m36258o0(C3251l c3251l, View view) {
            if (C7110j8.this.f38879z != null) {
                C7110j8.this.f38879z.mo16636c(c3251l);
            }
        }

        /* renamed from: p0 */
        public /* synthetic */ boolean m36259p0(C3251l c3251l, View view) {
            if (C7110j8.this.f38879z != null) {
                C7110j8.this.f38879z.mo16637d(c3251l, 7);
                return true;
            }
            return true;
        }

        /* renamed from: q0 */
        public /* synthetic */ void m36260q0(C3251l c3251l, View view) {
            if (C7110j8.this.f38879z != null) {
                C7110j8.this.f38879z.mo16642i(c3251l);
            }
        }

        /* renamed from: r0 */
        public /* synthetic */ boolean m36261r0(C3251l c3251l, View view) {
            if (C7110j8.this.f38879z != null) {
                C7110j8.this.f38879z.mo16635b(c3251l, 7);
                return true;
            }
            return true;
        }

        /* renamed from: s0 */
        public void m36262s0(StickerView stickerView, C24280f c24280f) {
            String str = c24280f.f117261a;
            String m141209z = C28020b3.f130648a.m141209z(str);
            if (!TextUtils.isEmpty(m141209z) && !TextUtils.isEmpty(str)) {
                C25630b c25630b = new C25630b(1, 2);
                c25630b.m132428f0(str);
                c25630b.m132407Q(m141209z);
                stickerView.m56979j(c25630b, C7110j8.this.f38862E + c25630b.m132446x(), true, false, false, true);
            }
        }

        @Override // com.zing.zalo.adapters.C7110j8.e
        /* renamed from: i0 */
        public void mo36252i0(C3245i c3245i, int i11) {
            C24280f c24280f;
            C3979l m125837F1;
            ArrayList m36241h0 = C7110j8.this.m36241h0(i11 - this.f38896N);
            for (int i12 = 0; i12 < this.f38891I; i12++) {
                StickerView stickerView = this.f38892J[i12];
                stickerView.setRowIndex(!C7110j8.this.f38873t ? i11 - 1 : i11);
                stickerView.setIndicatorIndex(C7110j8.this.f38871r);
                stickerView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                ProgressBar progressBar = this.f38893K[i12];
                if (progressBar != null) {
                    progressBar.setVisibility(8);
                }
                stickerView.setOnClickListener(null);
                ImageView[] imageViewArr = this.f38894L;
                if (imageViewArr != null) {
                    imageViewArr[i12].setVisibility(8);
                }
                if (i12 < m36241h0.size()) {
                    stickerView.setVisibility(0);
                    C3251l c3251l = (C3251l) m36241h0.get(i12);
                    if (c3251l.m16519i()) {
                        stickerView.m56980l();
                        C25630b m143290W = C28644j.m143233Y().m143290W(c3251l.m16512b());
                        if (m143290W.m132448z()) {
                            if (!C7110j8.this.f38864G) {
                                if (!C7110j8.this.f38863F) {
                                    C7110j8.this.m36233r0(stickerView, m143290W);
                                } else {
                                    stickerView.m56979j(m143290W, C3255n.m16562n().m16572l(C7110j8.this.f38862E, System.currentTimeMillis() + "", m143290W), true, false, false, true);
                                }
                            } else if (C28020b3.f130648a.m141181D(m143290W)) {
                                C7110j8.this.m36233r0(stickerView, m143290W);
                            }
                        } else if (!C7110j8.this.f38864G) {
                            C7110j8.this.m36231p0(m143290W, stickerView, progressBar);
                        } else if (AbstractC24006q.m125853Z1(m143290W.m132446x()) && (m125837F1 = AbstractC24006q.m125837F1(m143290W.m132446x())) != null) {
                            stickerView.setImageBitmap(m125837F1.m18839c());
                        }
                        try {
                            if (this.f38894L != null && c3251l.m16514d() != null && c3251l.m16514d().m132399G()) {
                                this.f38894L[i12].setVisibility(0);
                            }
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                        stickerView.setEmoticon(c3251l.m16512b());
                        stickerView.setOnClickListener(C7110j8.this.f38868K);
                        stickerView.setOnLongClickListener(C7110j8.this.f38869L);
                        stickerView.setOnTouchListener(C7110j8.this.f38867J);
                    } else {
                        String m16515e = c3251l.m16515e();
                        if (c3251l.m16517g()) {
                            stickerView.m56980l();
                            if (!C7110j8.this.f38864G || C23999j.m125696L2(m16515e, C23278z2.m120123e0())) {
                                ((C23528a) C7110j8.this.f38876w.m123612r(stickerView)).m123618x(m16515e, C23278z2.m120123e0());
                            }
                            stickerView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            stickerView.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.m8

                                /* renamed from: q */
                                public final /* synthetic */ C3251l f39050q;

                                public /* synthetic */ ViewOnClickListenerC7143m8(C3251l c3251l2) {
                                    r2 = c3251l2;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    C7110j8.f.this.m36258o0(r2, view);
                                }
                            });
                            stickerView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.zing.zalo.adapters.n8

                                /* renamed from: q */
                                public final /* synthetic */ C3251l f39143q;

                                public /* synthetic */ ViewOnLongClickListenerC7154n8(C3251l c3251l2) {
                                    r2 = c3251l2;
                                }

                                @Override // android.view.View.OnLongClickListener
                                public final boolean onLongClick(View view) {
                                    boolean m36259p0;
                                    m36259p0 = C7110j8.f.this.m36259p0(r2, view);
                                    return m36259p0;
                                }
                            });
                            stickerView.setOnTouchListener(C7110j8.this.f38867J);
                        } else if (c3251l2.m16518h()) {
                            C25811c m16513c = c3251l2.m16513c();
                            if (m16513c != null) {
                                c24280f = m16513c.m133098j();
                            } else {
                                c24280f = null;
                            }
                            stickerView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                            stickerView.m56980l();
                            stickerView.setThumbUrl(m16515e);
                            if (C23999j.m125696L2(m16515e, C23278z2.m120091Q0())) {
                                stickerView.setImageInfo(C23999j.m125676A2(m16515e, C23278z2.m120091Q0().f116260a, C23278z2.m120091Q0().f116266g));
                            } else {
                                ((C23528a) C7110j8.this.f38876w.m123612r(stickerView)).m123618x(m16515e, C23278z2.m120091Q0());
                            }
                            if (!C7110j8.this.f38864G && c24280f != null && AbstractC26683d.f126407z) {
                                String str = c24280f.f117261a;
                                if (!TextUtils.isEmpty(C28020b3.f130648a.m141209z(str))) {
                                    m36262s0(stickerView, c24280f);
                                } else {
                                    ((C23528a) C7110j8.this.f38876w.m123612r(stickerView)).m123602g(str, new a(3, str, stickerView, c24280f));
                                }
                            }
                            stickerView.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.o8

                                /* renamed from: q */
                                public final /* synthetic */ C3251l f39239q;

                                public /* synthetic */ ViewOnClickListenerC7165o8(C3251l c3251l2) {
                                    r2 = c3251l2;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    C7110j8.f.this.m36260q0(r2, view);
                                }
                            });
                            stickerView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.zing.zalo.adapters.p8

                                /* renamed from: q */
                                public final /* synthetic */ C3251l f39283q;

                                public /* synthetic */ ViewOnLongClickListenerC7176p8(C3251l c3251l2) {
                                    r2 = c3251l2;
                                }

                                @Override // android.view.View.OnLongClickListener
                                public final boolean onLongClick(View view) {
                                    boolean m36261r0;
                                    m36261r0 = C7110j8.f.this.m36261r0(r2, view);
                                    return m36261r0;
                                }
                            });
                            stickerView.setOnTouchListener(C7110j8.this.f38867J);
                            stickerView.invalidate();
                        } else {
                            stickerView.setOnClickListener(null);
                            stickerView.setOnLongClickListener(null);
                            stickerView.setOnTouchListener(null);
                        }
                    }
                } else {
                    stickerView.setTag(1090453505, "");
                    stickerView.setVisibility(4);
                    stickerView.setOnClickListener(null);
                    stickerView.setOnLongClickListener(null);
                    stickerView.setOnTouchListener(null);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.adapters.j8$g */
    /* loaded from: classes3.dex */
    public class g extends e {

        /* renamed from: I */
        RobotoTextView f38902I;

        /* renamed from: J */
        RedDotImageView f38903J;

        /* renamed from: K */
        View f38904K;

        public g(View view) {
            super(view);
            this.f38902I = (RobotoTextView) view.findViewById(AbstractC6918a0.sticker_name);
            RedDotImageView redDotImageView = (RedDotImageView) view.findViewById(AbstractC6918a0.more);
            this.f38903J = redDotImageView;
            redDotImageView.setImageDrawable(AbstractC19694b.m103336d(view.getContext(), AbstractC16803z.icn_csc_sticker_option));
            View findViewById = view.findViewById(AbstractC6918a0.moreContainer);
            this.f38904K = findViewById;
            findViewById.setClickable(true);
            this.f38904K.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.q8
                public /* synthetic */ ViewOnClickListenerC7187q8() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C7110j8.g.this.m36264k0(view2);
                }
            });
            if (C7110j8.this.f38865H == 250) {
                C28212v6 m141453i = AbstractC28025b8.m141453i("tip.csc.sticker.promotion");
                this.f38903J.setLeftRedDot(false);
                this.f38903J.setRedDotMargin(AbstractC32232i.m155453a(4.0f));
                this.f38903J.setEnableNoti(m141453i != null && m141453i.m142167f() && m141453i.f131580f);
            }
        }

        /* renamed from: k0 */
        public /* synthetic */ void m36264k0(View view) {
            AbstractC23647d.m123897g("9597");
            this.f38903J.getLocationInWindow(new int[2]);
            this.f38903J.getWidth();
            this.f38903J.getHeight();
            C7110j8.m36220b0(C7110j8.this);
        }

        @Override // com.zing.zalo.adapters.C7110j8.e
        /* renamed from: i0 */
        public void mo36252i0(C3245i c3245i, int i11) {
            String str;
            if (c3245i.f13854b == 0) {
                this.f38902I.setText(this.f7784p.getContext().getString(AbstractC8020f0.str_stickercategory_default_name));
                return;
            }
            if (c3245i.m16464f().length() < 43) {
                str = c3245i.m16464f();
            } else {
                str = c3245i.m16464f().substring(0, 43) + "...";
            }
            this.f38902I.setText(str);
        }
    }

    /* renamed from: com.zing.zalo.adapters.j8$h */
    /* loaded from: classes3.dex */
    public class h extends e {

        /* renamed from: I */
        RobotoTextView f38906I;

        /* renamed from: J */
        RobotoTextView f38907J;

        /* renamed from: K */
        RobotoTextView f38908K;

        /* renamed from: L */
        View f38909L;

        /* renamed from: M */
        View f38910M;

        /* renamed from: com.zing.zalo.adapters.j8$h$a */
        /* loaded from: classes3.dex */
        public class a implements StickerPanelView.InterfaceC12880b {
            a() {
            }

            @Override // com.zing.zalo.p077ui.picker.stickerpanel.StickerPanelView.InterfaceC12880b
            /* renamed from: a */
            public void mo36267a(C20096c c20096c) {
                RobotoTextView robotoTextView = h.this.f38908K;
                if (robotoTextView != null) {
                    robotoTextView.setClickable(true);
                    h.this.f38908K.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_file_start_download));
                }
                View view = h.this.f38909L;
                if (view != null) {
                    view.setVisibility(8);
                }
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_download_file));
            }

            @Override // com.zing.zalo.p077ui.picker.stickerpanel.StickerPanelView.InterfaceC12880b
            /* renamed from: b */
            public void mo36268b() {
            }

            @Override // com.zing.zalo.p077ui.picker.stickerpanel.StickerPanelView.InterfaceC12880b
            /* renamed from: c */
            public void mo36269c() {
                View view = h.this.f38910M;
                if (view != null) {
                    view.setVisibility(8);
                }
                View view2 = h.this.f38909L;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
                if (C7110j8.this.f38879z != null) {
                    C7110j8.this.f38879z.mo16643j();
                }
            }
        }

        public h(View view) {
            super(view);
            this.f38906I = (RobotoTextView) view.findViewById(AbstractC6918a0.promote_sticker_name);
            this.f38907J = (RobotoTextView) view.findViewById(AbstractC6918a0.promote_sticker_description);
            this.f38908K = (RobotoTextView) view.findViewById(AbstractC6918a0.btn_download_promote_sticker);
            this.f38909L = view.findViewById(AbstractC6918a0.holoCircularProgressBar);
            this.f38910M = view.findViewById(AbstractC6918a0.promote_sticker_header);
            View view2 = this.f38909L;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            View view3 = this.f38910M;
            if (view3 != null) {
                view3.setVisibility(0);
            }
            RobotoTextView robotoTextView = this.f38908K;
            if (robotoTextView != null) {
                robotoTextView.setClickable(true);
                this.f38908K.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_file_start_download));
                this.f38908K.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.r8
                    public /* synthetic */ ViewOnClickListenerC7198r8() {
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        C7110j8.h.this.m36266k0(view4);
                    }
                });
            }
        }

        /* renamed from: k0 */
        public /* synthetic */ void m36266k0(View view) {
            RobotoTextView robotoTextView = this.f38908K;
            if (robotoTextView != null) {
                robotoTextView.setClickable(false);
                this.f38908K.setText("");
            }
            View view2 = this.f38909L;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            C7110j8.this.m36203C0(new a());
        }

        @Override // com.zing.zalo.adapters.C7110j8.e
        /* renamed from: i0 */
        public void mo36252i0(C3245i c3245i, int i11) {
            this.f38906I.setText(c3245i.m16464f());
            if (!TextUtils.isEmpty(c3245i.f13856d) && !c3245i.f13856d.equals("null")) {
                this.f38907J.setText(c3245i.f13856d);
            }
        }
    }

    public C7110j8(C23528a c23528a, InterfaceC31726a interfaceC31726a, StickerPanelView.InterfaceC12882c interfaceC12882c, int i11, d dVar, int i12) {
        this.f38860C = 4;
        this.f38859B = dVar;
        if (dVar != null) {
            this.f38860C = dVar.f38885p;
        }
        this.f38876w = c23528a;
        this.f38879z = interfaceC31726a;
        this.f38861D = i11;
        this.f38865H = i12;
    }

    /* renamed from: C0 */
    public void m36203C0(StickerPanelView.InterfaceC12880b interfaceC12880b) {
        if (C19515b.m101996i().m102001g(this.f38875v.f13854b) != null) {
            if (interfaceC12880b != null) {
                interfaceC12880b.mo36268b();
            }
        } else {
            C28020b3.f130648a.m141190S(this.f38875v.f13854b, true);
            C19515b.m101996i().m102003l(this.f38875v, 3, 0, -1, new c(interfaceC12880b));
        }
    }

    /* renamed from: b0 */
    static /* bridge */ /* synthetic */ StickerPanelView.InterfaceC12882c m36220b0(C7110j8 c7110j8) {
        c7110j8.getClass();
        return null;
    }

    /* renamed from: f0 */
    private List m36224f0(Collection collection) {
        if (collection != null && !collection.isEmpty()) {
            ArrayList arrayList = new ArrayList(collection);
            try {
                if (this.f38858A) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C3251l c3251l = (C3251l) it.next();
                        if (c3251l != null && !c3251l.m16519i()) {
                            it.remove();
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            return arrayList;
        }
        return new ArrayList();
    }

    /* renamed from: i0 */
    public /* synthetic */ void m36225i0(int i11) {
        try {
            this.f38878y.clear();
            if (i11 == -2) {
                this.f38878y.addAll(m36224f0(this.f38877x.values()));
            } else {
                this.f38878y.addAll(this.f38877x.values());
            }
            this.f38870M = false;
            m10008p();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: j0 */
    public static /* synthetic */ void m36226j0(StickerView stickerView, C25630b c25630b) {
        stickerView.setImageBitmap(C28020b3.f130648a.m141206w(c25630b));
    }

    /* renamed from: k0 */
    public static /* synthetic */ void m36227k0(StickerView stickerView, C25630b c25630b) {
        AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.adapters.i8

            /* renamed from: q */
            public final /* synthetic */ C25630b f38805q;

            public /* synthetic */ RunnableC7099i8(C25630b c25630b2) {
                r2 = c25630b2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C7110j8.m36226j0(StickerView.this, r2);
            }
        });
    }

    /* renamed from: l0 */
    public /* synthetic */ void m36228l0(ArrayList arrayList) {
        this.f38877x.clear();
        if (arrayList != null) {
            this.f38878y.clear();
            this.f38878y.addAll(arrayList);
        }
        try {
            this.f38870M = false;
            m10008p();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: m0 */
    public /* synthetic */ boolean m36229m0() {
        return this.f38864G;
    }

    /* renamed from: o0 */
    private void m36230o0(int i11, LinkedHashMap linkedHashMap) {
        this.f38877x.clear();
        if (linkedHashMap != null) {
            this.f38877x.putAll(linkedHashMap);
        }
        AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.adapters.g8

            /* renamed from: q */
            public final /* synthetic */ int f38695q;

            public /* synthetic */ RunnableC7077g8(int i112) {
                r2 = i112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C7110j8.this.m36225i0(r2);
            }
        });
    }

    /* renamed from: p0 */
    public void m36231p0(C25630b c25630b, RecyclingImageView recyclingImageView, ProgressBar progressBar) {
        if (!c25630b.m132448z()) {
            C28020b3.f130648a.m141182F(recyclingImageView, this.f38876w, c25630b, progressBar, true, new a(recyclingImageView));
            return;
        }
        throw new RuntimeException("Not load sticker DEFAULT by Aquery");
    }

    /* renamed from: q0 */
    private boolean m36232q0() {
        if (this.f38875v.f13854b != -2 && this.f38865H != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: r0 */
    public void m36233r0(StickerView stickerView, C25630b c25630b) {
        Bitmap m141205v = C28020b3.f130648a.m141205v(c25630b, false);
        if (m141205v != null) {
            stickerView.setImageBitmap(m141205v);
        } else {
            AbstractC0840r.m2251h(new Runnable() { // from class: com.zing.zalo.adapters.h8

                /* renamed from: q */
                public final /* synthetic */ C25630b f38754q;

                public /* synthetic */ RunnableC7088h8(C25630b c25630b2) {
                    r2 = c25630b2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C7110j8.m36227k0(StickerView.this, r2);
                }
            });
        }
    }

    /* renamed from: s0 */
    private void m36234s0(ArrayList arrayList) {
        AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.adapters.c8

            /* renamed from: q */
            public final /* synthetic */ ArrayList f38433q;

            public /* synthetic */ RunnableC7032c8(ArrayList arrayList2) {
                r2 = arrayList2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C7110j8.this.m36228l0(r2);
            }
        });
    }

    /* renamed from: t0 */
    private void m36235t0(int i11) {
        try {
            if (this.f38870M) {
                return;
            }
            this.f38870M = true;
            try {
                if (this.f38861D == 1) {
                    if (C28644j.m143233Y().m143280L(this.f38875v.f13854b)) {
                        m36234s0(C28644j.m143233Y().m143304h0(this.f38875v.f13854b));
                    } else {
                        C28644j.m143233Y().m143303g0(new ArrayList(Collections.singleton(this.f38875v)), this);
                    }
                } else if (C28644j.m143233Y().m143278K(i11)) {
                    m36230o0(i11, C28644j.m143233Y().m143301f0(i11));
                } else {
                    this.f38872s = i11;
                    C28644j.m143233Y().m143300e0(new ArrayList(Collections.singleton(Integer.valueOf(i11))), this, this);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                this.f38870M = false;
            }
        } catch (Exception e12) {
            e12.printStackTrace();
            this.f38870M = false;
        }
    }

    /* renamed from: w0 */
    public void m36236w0(View view) {
        InterfaceC31726a interfaceC31726a;
        try {
            if (view instanceof StickerView) {
                StickerView stickerView = (StickerView) view;
                Integer num = this.f38874u;
                if (num != null && (interfaceC31726a = this.f38879z) != null) {
                    interfaceC31726a.mo16639f(stickerView, num.intValue());
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: x0 */
    public boolean m36237x0(View view) {
        Integer num;
        int i11;
        try {
            if ((view instanceof StickerView) && (num = this.f38874u) != null) {
                if (num.intValue() == -2) {
                    i11 = 7;
                } else if (C28644j.m143233Y().m143312x0(this.f38874u.intValue())) {
                    i11 = 5;
                } else {
                    i11 = 6;
                }
                InterfaceC31726a interfaceC31726a = this.f38879z;
                if (interfaceC31726a != null) {
                    interfaceC31726a.mo16640g((StickerView) view, this.f38874u.intValue(), i11);
                    return true;
                }
                return true;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: A0 */
    public void m36238A0(String str) {
        this.f38862E = str;
    }

    /* renamed from: B0 */
    public void m36239B0(boolean z11) {
        this.f38864G = z11;
    }

    @Override // p588vw.C28644j.o
    /* renamed from: f1 */
    public void mo16628f1(List list, List list2) {
        int intValue = ((Integer) list.get(0)).intValue();
        LinkedHashMap linkedHashMap = (LinkedHashMap) list2.get(0);
        if (this.f38872s == intValue) {
            m36230o0(intValue, linkedHashMap);
        }
    }

    /* renamed from: g0 */
    public C3251l m36240g0(int i11) {
        try {
            return (C3251l) this.f38878y.get(i11);
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: h0 */
    public ArrayList m36241h0(int i11) {
        ArrayList arrayList = new ArrayList();
        try {
            int i12 = i11 * this.f38860C;
            for (int i13 = 0; i13 < this.f38860C; i13++) {
                int i14 = i12 + i13;
                if (i14 < this.f38878y.size()) {
                    arrayList.add(m36240g0(i14));
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        return arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        if (this.f38873t) {
            return (int) Math.ceil(this.f38878y.size() / this.f38860C);
        }
        return ((int) Math.ceil(this.f38878y.size() / this.f38860C)) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        if (this.f38873t || i11 > 0) {
            return 2;
        }
        return this.f38861D == 1 ? 1 : 0;
    }

    @Override // p588vw.C28644j.p
    /* renamed from: n0 */
    public void mo36242n0(List list) {
        m36234s0((ArrayList) list.get(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: u0 */
    public void mo9990A(e eVar, int i11) {
        eVar.mo36252i0(this.f38875v, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: v0 */
    public e mo9992C(ViewGroup viewGroup, int i11) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i11 != 1) {
            if (i11 != 2) {
                return new g(from.inflate(AbstractC7409c0.sticker_headeritem_container, viewGroup, false));
            }
            LinearLayout linearLayout = (LinearLayout) from.inflate(AbstractC7409c0.sticker_griditem_container, viewGroup, false);
            for (int i12 = 0; i12 < this.f38860C; i12++) {
                View inflate = from.inflate(AbstractC7409c0.sticker_grid_item, (ViewGroup) linearLayout, false);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) inflate.getLayoutParams();
                layoutParams.weight = 1.0f;
                inflate.setLayoutParams(layoutParams);
                StickerView stickerView = (StickerView) inflate.findViewById(AbstractC6918a0.sticker_item_element);
                if (stickerView != null) {
                    stickerView.setDelegate(this.f38866I);
                }
                linearLayout.addView(inflate);
            }
            return new f(linearLayout, this.f38860C, this.f38859B, !this.f38873t ? 1 : 0);
        }
        return new h(from.inflate(AbstractC7409c0.sticker_promotion_headeritem_container, viewGroup, false));
    }

    /* renamed from: y0 */
    public void m36245y0(C3245i c3245i) {
        this.f38874u = Integer.valueOf(c3245i.f13854b);
        this.f38875v = c3245i;
        this.f38873t = m36232q0();
        m36235t0(this.f38874u.intValue());
    }

    /* renamed from: z0 */
    public void m36246z0(boolean z11) {
        this.f38863F = z11;
    }

    /* renamed from: com.zing.zalo.adapters.j8$d */
    /* loaded from: classes3.dex */
    public static class d implements Serializable {

        /* renamed from: p */
        public int f38885p;

        /* renamed from: q */
        public int f38886q;

        /* renamed from: r */
        public int f38887r;

        /* renamed from: s */
        public int f38888s;

        /* renamed from: t */
        public boolean f38889t;

        /* renamed from: u */
        public C7157o0.f f38890u;

        public d(int i11, int i12, int i13) {
            this.f38885p = 4;
            this.f38886q = AbstractC23136l9.m118742r(68.0f);
            this.f38887r = AbstractC23136l9.m118742r(8.0f);
            this.f38888s = AbstractC23136l9.m118742r(8.0f);
            this.f38889t = false;
            this.f38885p = i11;
            this.f38886q = i12;
            this.f38887r = i13;
        }

        public d() {
            this.f38885p = 4;
            this.f38886q = AbstractC23136l9.m118742r(68.0f);
            this.f38887r = AbstractC23136l9.m118742r(8.0f);
            this.f38888s = AbstractC23136l9.m118742r(8.0f);
            this.f38889t = false;
        }
    }
}
