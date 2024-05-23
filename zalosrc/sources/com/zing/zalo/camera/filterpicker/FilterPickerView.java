package com.zing.zalo.camera.filterpicker;

import ag0.AbstractC0837p0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import androidx.recyclerview.widget.RecyclerView;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.camera.ZaloCameraView;
import com.zing.zalo.camera.filterpicker.C7620a;
import com.zing.zalo.camera.filterpicker.FilterPickerView;
import com.zing.zalo.p077ui.widget.C13718q1;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uicomponents.imagebutton.ActiveImageButton;
import com.zing.zalo.uicontrol.SmoothScrollLinearLayoutManager;
import en0.InterfaceC18494a;
import et.C18596c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import ht.C20125e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23009a3;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23203s;
import me0.AbstractC23222t7;
import me0.C23278z2;
import mm0.AbstractC23350e;
import on0.AbstractC24341v;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p379o3.C23995f;
import p379o3.C23999j;
import p642xe.C29605a;
import p642xe.C29606b;
import p716zh.AbstractC31990k7;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import tg.C26657h;
import tg.C26674y;
import vg.C28208v2;

/* loaded from: classes3.dex */
public final class FilterPickerView extends FrameLayout implements C28208v2.d {
    public static final C7603b Companion = new C7603b(null);

    /* renamed from: A */
    private int f41182A;

    /* renamed from: B */
    private boolean f41183B;

    /* renamed from: C */
    private boolean f41184C;

    /* renamed from: D */
    private C29605a f41185D;

    /* renamed from: E */
    private boolean f41186E;

    /* renamed from: F */
    private int f41187F;

    /* renamed from: G */
    private boolean f41188G;

    /* renamed from: H */
    private final InterfaceC7605d f41189H;

    /* renamed from: I */
    private final InterfaceC24854k f41190I;

    /* renamed from: J */
    private final InterfaceC24854k f41191J;

    /* renamed from: K */
    private C7620a f41192K;

    /* renamed from: L */
    private RecyclerView f41193L;

    /* renamed from: M */
    private final InterfaceC24854k f41194M;

    /* renamed from: N */
    private final InterfaceC24854k f41195N;

    /* renamed from: O */
    private final InterfaceC24854k f41196O;

    /* renamed from: P */
    private final InterfaceC24854k f41197P;

    /* renamed from: p */
    private final boolean f41198p;

    /* renamed from: q */
    private int f41199q;

    /* renamed from: r */
    private final InterfaceC24854k f41200r;

    /* renamed from: s */
    private String f41201s;

    /* renamed from: t */
    private String f41202t;

    /* renamed from: u */
    private InterfaceC7608g f41203u;

    /* renamed from: v */
    private InterfaceC7607f f41204v;

    /* renamed from: w */
    private InterfaceC7604c f41205w;

    /* renamed from: x */
    private InterfaceC7606e f41206x;

    /* renamed from: y */
    private long f41207y;

    /* renamed from: z */
    private C29605a f41208z;

    /* renamed from: com.zing.zalo.camera.filterpicker.FilterPickerView$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC7602a {
        /* renamed from: a */
        void mo39278a(int i11);

        /* renamed from: b */
        void mo39279b(Bitmap bitmap);
    }

    /* renamed from: com.zing.zalo.camera.filterpicker.FilterPickerView$b */
    /* loaded from: classes3.dex */
    public static final class C7603b {
        private C7603b() {
        }

        public /* synthetic */ C7603b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final void m39280a(List list, int i11) {
            AbstractC19074t.m100208f(list, "filterAnims");
            int m119234a0 = AbstractC23160o0.m119234a0();
            int m119183B = AbstractC23160o0.m119183B();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C29605a c29605a = (C29605a) it.next();
                if (((i11 == 2 || i11 == 3) && c29605a.m147130g() == 0) || !c29605a.m147141r(m119183B, m119234a0, i11) || c29605a.m147135l() == 1 || c29605a.m147134k() > 1) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.camera.filterpicker.FilterPickerView$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC7604c {
        /* renamed from: b */
        void mo39131b(int i11);

        /* renamed from: c */
        boolean mo39132c();

        /* renamed from: d */
        void mo39133d();

        /* renamed from: e */
        void mo39134e(String str, boolean z11);

        /* renamed from: f */
        void mo39135f(boolean z11);
    }

    /* renamed from: com.zing.zalo.camera.filterpicker.FilterPickerView$d */
    /* loaded from: classes3.dex */
    public interface InterfaceC7605d extends C7620a.a {
        /* renamed from: d */
        List mo39281d(long j11);
    }

    /* renamed from: com.zing.zalo.camera.filterpicker.FilterPickerView$e */
    /* loaded from: classes3.dex */
    public interface InterfaceC7606e {
        /* renamed from: a */
        void mo39282a(int i11);
    }

    /* renamed from: com.zing.zalo.camera.filterpicker.FilterPickerView$f */
    /* loaded from: classes3.dex */
    public interface InterfaceC7607f {
        /* renamed from: a */
        void mo39283a();
    }

    /* renamed from: com.zing.zalo.camera.filterpicker.FilterPickerView$g */
    /* loaded from: classes3.dex */
    public interface InterfaceC7608g {
        /* renamed from: a */
        void mo39284a(boolean z11, long j11, C29605a c29605a);
    }

    /* renamed from: com.zing.zalo.camera.filterpicker.FilterPickerView$h */
    /* loaded from: classes3.dex */
    static final class C7609h extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Context f41209q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7609h(Context context) {
            super(0);
            this.f41209q = context;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C23528a mo12V4() {
            return new C23528a(this.f41209q);
        }
    }

    /* renamed from: com.zing.zalo.camera.filterpicker.FilterPickerView$i */
    /* loaded from: classes3.dex */
    public static final class C7610i implements InterfaceC7602a {

        /* renamed from: b */
        final /* synthetic */ int f41211b;

        C7610i(int i11) {
            this.f41211b = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m39287d(FilterPickerView filterPickerView, int i11, Bitmap bitmap) {
            AbstractC19074t.m100208f(filterPickerView, "this$0");
            filterPickerView.getFilterPickerAdapter().m39306R().put(Integer.valueOf(i11), bitmap);
            filterPickerView.getFilterPickerAdapter().m10009q(i11);
        }

        @Override // com.zing.zalo.camera.filterpicker.FilterPickerView.InterfaceC7602a
        /* renamed from: a */
        public void mo39278a(int i11) {
            AbstractC20110a.f98889a.mo104551d("Download filter anim failed have error code: " + i11, new Object[0]);
        }

        @Override // com.zing.zalo.camera.filterpicker.FilterPickerView.InterfaceC7602a
        /* renamed from: b */
        public void mo39279b(final Bitmap bitmap) {
            final FilterPickerView filterPickerView = FilterPickerView.this;
            final int i11 = this.f41211b;
            AbstractC19444a.m101695c(new Runnable() { // from class: we.m
                @Override // java.lang.Runnable
                public final void run() {
                    FilterPickerView.C7610i.m39287d(FilterPickerView.this, i11, bitmap);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.camera.filterpicker.FilterPickerView$j */
    /* loaded from: classes3.dex */
    static final class C7611j extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Context f41212q;

        /* renamed from: r */
        final /* synthetic */ FilterPickerView f41213r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7611j(Context context, FilterPickerView filterPickerView) {
            super(0);
            this.f41212q = context;
            this.f41213r = filterPickerView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m39289c(FilterPickerView filterPickerView, View view) {
            AbstractC19074t.m100208f(filterPickerView, "this$0");
            try {
                if (filterPickerView.m39262E()) {
                    return;
                }
                if (filterPickerView.m39263F()) {
                    AbstractC23647d.m123897g("49150075");
                }
                filterPickerView.m39261C();
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ActiveImageButton mo12V4() {
            ActiveImageButton activeImageButton = new ActiveImageButton(this.f41212q);
            Context context = this.f41212q;
            final FilterPickerView filterPickerView = this.f41213r;
            activeImageButton.setBackground(AbstractC23136l9.m118665N(context, AbstractC16803z.round_background));
            activeImageButton.setScaleType(ImageView.ScaleType.CENTER);
            activeImageButton.setImageResource(AbstractC16803z.ic_arrows_down);
            activeImageButton.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.camera.filterpicker.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FilterPickerView.C7611j.m39289c(FilterPickerView.this, view);
                }
            });
            return activeImageButton;
        }
    }

    /* renamed from: com.zing.zalo.camera.filterpicker.FilterPickerView$k */
    /* loaded from: classes3.dex */
    static final class C7612k extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Context f41214q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7612k(Context context) {
            super(0);
            this.f41214q = context;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FrameLayout mo12V4() {
            FrameLayout frameLayout = new FrameLayout(this.f41214q);
            frameLayout.setBackground(AbstractC23136l9.m118665N(this.f41214q, AbstractC16803z.shape_filter_background));
            return frameLayout;
        }
    }

    /* renamed from: com.zing.zalo.camera.filterpicker.FilterPickerView$l */
    /* loaded from: classes3.dex */
    public static final class C7613l implements InterfaceC7605d {
        C7613l() {
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
        @Override // com.zing.zalo.camera.filterpicker.C7620a.a
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean mo39292a(C29605a c29605a) {
            boolean z11;
            InterfaceC7608g interfaceC7608g;
            InterfaceC7604c interfaceC7604c;
            AbstractC19074t.m100208f(c29605a, "filterAnim");
            C29605a c29605a2 = FilterPickerView.this.f41208z;
            boolean z12 = true;
            if (c29605a2 != null && c29605a2.m147131h() == c29605a.m147131h()) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z13 = !z11;
            if (FilterPickerView.this.m39262E()) {
                return false;
            }
            if (z13) {
                FilterPickerView.this.f41208z = c29605a;
            } else {
                if (!c29605a.m147140q()) {
                    FilterPickerView.this.f41208z = null;
                }
                if (z12) {
                    FilterPickerView.this.m39273X(c29605a);
                }
                interfaceC7608g = FilterPickerView.this.f41203u;
                if (interfaceC7608g != null) {
                    interfaceC7608g.mo39284a(z12, FilterPickerView.this.f41207y, c29605a);
                }
                interfaceC7604c = FilterPickerView.this.f41205w;
                if (interfaceC7604c != null) {
                    interfaceC7604c.mo39134e("filter_thumbnail", z12);
                }
                return z12;
            }
            z12 = z13;
            if (z12) {
            }
            interfaceC7608g = FilterPickerView.this.f41203u;
            if (interfaceC7608g != null) {
            }
            interfaceC7604c = FilterPickerView.this.f41205w;
            if (interfaceC7604c != null) {
            }
            return z12;
        }

        @Override // com.zing.zalo.camera.filterpicker.C7620a.a
        /* renamed from: b */
        public boolean mo39293b(C29605a c29605a) {
            Long l11;
            C29605a c29605a2 = FilterPickerView.this.f41208z;
            Long l12 = null;
            if (c29605a2 != null) {
                l11 = Long.valueOf(c29605a2.m147131h());
            } else {
                l11 = null;
            }
            if (c29605a != null) {
                l12 = Long.valueOf(c29605a.m147131h());
            }
            return AbstractC19074t.m100204b(l11, l12);
        }

        @Override // com.zing.zalo.camera.filterpicker.C7620a.a
        /* renamed from: c */
        public void mo39294c(C29605a c29605a) {
            AbstractC19074t.m100208f(c29605a, "filterAnim");
            if (!FilterPickerView.this.m39262E()) {
                FilterPickerView.this.f41208z = c29605a;
                FilterPickerView.this.m39273X(c29605a);
                InterfaceC7608g interfaceC7608g = FilterPickerView.this.f41203u;
                if (interfaceC7608g != null) {
                    interfaceC7608g.mo39284a(true, FilterPickerView.this.f41207y, c29605a);
                }
            }
        }

        @Override // com.zing.zalo.camera.filterpicker.FilterPickerView.InterfaceC7605d
        /* renamed from: d */
        public List mo39281d(long j11) {
            return C28208v2.m142128t().m142144r(j11, true);
        }
    }

    /* renamed from: com.zing.zalo.camera.filterpicker.FilterPickerView$m */
    /* loaded from: classes3.dex */
    static final class C7614m extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Context f41216q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7614m(Context context) {
            super(0);
            this.f41216q = context;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SmoothScrollLinearLayoutManager mo12V4() {
            SmoothScrollLinearLayoutManager smoothScrollLinearLayoutManager = new SmoothScrollLinearLayoutManager(this.f41216q, 0, false);
            smoothScrollLinearLayoutManager.m88005N2(200.0f);
            return smoothScrollLinearLayoutManager;
        }
    }

    /* renamed from: com.zing.zalo.camera.filterpicker.FilterPickerView$n */
    /* loaded from: classes3.dex */
    static final class C7615n extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Context f41217q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7615n(Context context) {
            super(0);
            this.f41217q = context;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ProgressBar mo12V4() {
            ProgressBar progressBar = new ProgressBar(this.f41217q);
            Context context = this.f41217q;
            progressBar.setIndeterminate(true);
            progressBar.setIndeterminateDrawable(AbstractC23136l9.m118665N(context, AbstractC16803z.ic_story_loading_anim));
            return progressBar;
        }
    }

    /* renamed from: com.zing.zalo.camera.filterpicker.FilterPickerView$o */
    /* loaded from: classes3.dex */
    static final class C7616o extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Context f41218q;

        /* renamed from: r */
        final /* synthetic */ FilterPickerView f41219r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7616o(Context context, FilterPickerView filterPickerView) {
            super(0);
            this.f41218q = context;
            this.f41219r = filterPickerView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RobotoTextView mo12V4() {
            RobotoTextView robotoTextView = new RobotoTextView(this.f41218q);
            FilterPickerView filterPickerView = this.f41219r;
            Context context = this.f41218q;
            robotoTextView.setText(String.valueOf(filterPickerView.getSeekBar().getProgress()));
            robotoTextView.setTextSize(1, 13.0f);
            robotoTextView.setGravity(17);
            robotoTextView.setTextColor(-1);
            robotoTextView.setTypeface(C13718q1.m76694c(context, 5));
            return robotoTextView;
        }
    }

    /* renamed from: com.zing.zalo.camera.filterpicker.FilterPickerView$p */
    /* loaded from: classes3.dex */
    static final class C7617p extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Context f41220q;

        /* renamed from: r */
        final /* synthetic */ FilterPickerView f41221r;

        /* renamed from: com.zing.zalo.camera.filterpicker.FilterPickerView$p$a */
        /* loaded from: classes3.dex */
        public static final class a implements SeekBar.OnSeekBarChangeListener {

            /* renamed from: a */
            final /* synthetic */ FilterPickerView f41222a;

            a(FilterPickerView filterPickerView) {
                this.f41222a = filterPickerView;
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar, int i11, boolean z11) {
                AbstractC19074t.m100208f(seekBar, "seekBar");
                this.f41222a.m39276v(i11);
                this.f41222a.getProgressSeekBarTextView().setText(String.valueOf(i11));
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar) {
                AbstractC19074t.m100208f(seekBar, "seekBar");
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar) {
                boolean z11;
                AbstractC19074t.m100208f(seekBar, "seekBar");
                InterfaceC7604c interfaceC7604c = this.f41222a.f41205w;
                if (interfaceC7604c != null) {
                    if (this.f41222a.f41208z != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    interfaceC7604c.mo39134e("filter_intensifier", z11);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7617p(Context context, FilterPickerView filterPickerView) {
            super(0);
            this.f41220q = context;
            this.f41221r = filterPickerView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SeekBar mo12V4() {
            SeekBar seekBar = new SeekBar(this.f41220q);
            FilterPickerView filterPickerView = this.f41221r;
            seekBar.setProgress(100);
            seekBar.setProgressTintList(ColorStateList.valueOf(-1));
            seekBar.getThumb().setTint(-1);
            seekBar.setOnSeekBarChangeListener(new a(filterPickerView));
            return seekBar;
        }
    }

    /* renamed from: com.zing.zalo.camera.filterpicker.FilterPickerView$q */
    /* loaded from: classes3.dex */
    public static final class C7618q extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ boolean f41223p;

        /* renamed from: q */
        final /* synthetic */ FilterPickerView f41224q;

        C7618q(boolean z11, FilterPickerView filterPickerView) {
            this.f41223p = z11;
            this.f41224q = filterPickerView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            try {
                super.onAnimationEnd(animator);
                if (this.f41223p) {
                    this.f41224q.m39264H();
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.camera.filterpicker.FilterPickerView$r */
    /* loaded from: classes3.dex */
    public static final class C7619r extends C23999j {
        C7619r() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            Bitmap bitmap;
            super.mo473O1(str, interfaceC3968a, c3979l, c23995f);
            FilterPickerView filterPickerView = FilterPickerView.this;
            if (c3979l != null) {
                bitmap = c3979l.m18839c();
            } else {
                bitmap = null;
            }
            filterPickerView.m39225A(bitmap);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilterPickerView(Context context, boolean z11, int i11) {
        super(context);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        InterfaceC24854k m129210a5;
        InterfaceC24854k m129210a6;
        InterfaceC24854k m129210a7;
        AbstractC19074t.m100208f(context, "context");
        this.f41198p = z11;
        this.f41199q = i11;
        m129210a = AbstractC24856m.m129210a(new C7609h(context));
        this.f41200r = m129210a;
        this.f41207y = -10L;
        this.f41186E = true;
        C7613l c7613l = new C7613l();
        this.f41189H = c7613l;
        m129210a2 = AbstractC24856m.m129210a(new C7611j(context, this));
        this.f41190I = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new C7614m(context));
        this.f41191J = m129210a3;
        this.f41192K = new C7620a(getAQuery(), c7613l);
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutManager(getFilterLayoutManager());
        recyclerView.setAdapter(this.f41192K);
        this.f41193L = recyclerView;
        m129210a4 = AbstractC24856m.m129210a(new C7617p(context, this));
        this.f41194M = m129210a4;
        m129210a5 = AbstractC24856m.m129210a(new C7612k(context));
        this.f41195N = m129210a5;
        m129210a6 = AbstractC24856m.m129210a(new C7615n(context));
        this.f41196O = m129210a6;
        m129210a7 = AbstractC24856m.m129210a(new C7616o(context, this));
        this.f41197P = m129210a7;
        ZaloCameraView.f40825K2 = AbstractC23222t7.f112591v0;
        setMotionEventSplittingEnabled(false);
        this.f41187F = AbstractC23136l9.m118742r(102.0f);
        setBackgroundColor(0);
        m39227D();
        m39228G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public final void m39225A(Bitmap bitmap) {
        if (bitmap != null) {
            this.f41188G = true;
            m39258w(bitmap);
        } else {
            AbstractC19444a.m101695c(new Runnable() { // from class: we.j
                @Override // java.lang.Runnable
                public final void run() {
                    FilterPickerView.m39226B(FilterPickerView.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public static final void m39226B(FilterPickerView filterPickerView) {
        AbstractC19074t.m100208f(filterPickerView, "this$0");
        filterPickerView.f41192K.m39313Z(true);
        filterPickerView.f41188G = false;
        filterPickerView.f41192K.m10008p();
    }

    /* renamed from: D */
    private final void m39227D() {
        FrameLayout contentFilterLayout = getContentFilterLayout();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = AbstractC23222t7.f112539R;
        C24848g0 c24848g0 = C24848g0.f119245a;
        addView(contentFilterLayout, layoutParams);
        int i11 = AbstractC23222t7.f112528I;
        ActiveImageButton btnSlideDown = getBtnSlideDown();
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i11, i11, 49);
        layoutParams2.topMargin = AbstractC23222t7.f112566j;
        addView(btnSlideDown, layoutParams2);
        int i12 = AbstractC23222t7.f112514B;
        FrameLayout contentFilterLayout2 = getContentFilterLayout();
        View view = this.f41193L;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, this.f41187F, 80);
        layoutParams3.bottomMargin = i12;
        contentFilterLayout2.addView(view, layoutParams3);
        FrameLayout contentFilterLayout3 = getContentFilterLayout();
        View seekBar = getSeekBar();
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, AbstractC23222t7.f112539R, 49);
        int i13 = AbstractC23222t7.f112559f0;
        layoutParams4.leftMargin = i13;
        layoutParams4.rightMargin = i13;
        layoutParams4.topMargin = AbstractC23222t7.f112514B;
        layoutParams4.bottomMargin = this.f41187F + i12 + AbstractC23222t7.f112586t;
        contentFilterLayout3.addView(seekBar, layoutParams4);
        FrameLayout contentFilterLayout4 = getContentFilterLayout();
        View progressSeekBarTextView = getProgressSeekBarTextView();
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams5.gravity = 53;
        layoutParams5.rightMargin = AbstractC23222t7.f112559f0;
        layoutParams5.topMargin = AbstractC23222t7.f112586t;
        contentFilterLayout4.addView(progressSeekBarTextView, layoutParams5);
        FrameLayout contentFilterLayout5 = getContentFilterLayout();
        View progressBar = getProgressBar();
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(i11, i11, 49);
        layoutParams6.topMargin = AbstractC23222t7.f112553c0;
        contentFilterLayout5.addView(progressBar, layoutParams6);
    }

    /* renamed from: G */
    private final void m39228G() {
        C28208v2.m142128t().m142134B(this);
        C28208v2.m142128t().m142145s(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public static final void m39229I(FilterPickerView filterPickerView) {
        AbstractC19074t.m100208f(filterPickerView, "this$0");
        try {
            if (filterPickerView.getVisibility() == 0) {
                List m142136D = C28208v2.m142128t().m142136D();
                AbstractC19074t.m100207e(m142136D, "wrapFilterCategory(...)");
                if (!m142136D.isEmpty()) {
                    filterPickerView.m39237Z(m142136D);
                } else {
                    InterfaceC7607f interfaceC7607f = filterPickerView.f41204v;
                    if (interfaceC7607f != null) {
                        interfaceC7607f.mo39283a();
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public static final void m39230L(FilterPickerView filterPickerView) {
        AbstractC19074t.m100208f(filterPickerView, "this$0");
        filterPickerView.m39265J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public static final void m39231M(FilterPickerView filterPickerView, List list) {
        AbstractC19074t.m100208f(filterPickerView, "this$0");
        AbstractC19074t.m100208f(list, "$filterAnims");
        try {
            filterPickerView.f41192K.m39311X(list);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public static final void m39232N(FilterPickerView filterPickerView, List list) {
        AbstractC19074t.m100208f(filterPickerView, "this$0");
        AbstractC19074t.m100208f(list, "$filterCategories");
        try {
            if (filterPickerView.getVisibility() == 0 && (!list.isEmpty())) {
                filterPickerView.f41186E = true;
                filterPickerView.m39237Z(list);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public static final void m39233P(FilterPickerView filterPickerView, C29605a c29605a) {
        AbstractC19074t.m100208f(filterPickerView, "this$0");
        try {
            filterPickerView.f41208z = null;
            if (c29605a != null && c29605a.m147140q()) {
                filterPickerView.m39271V(c29605a);
            } else {
                filterPickerView.m39265J();
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: Q */
    private final void m39234Q() {
        if (!this.f41192K.m39306R().isEmpty()) {
            this.f41192K.m39306R().clear();
            this.f41192K.m10008p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public static final void m39235S(FilterPickerView filterPickerView, long j11) {
        AbstractC19074t.m100208f(filterPickerView, "this$0");
        filterPickerView.setSelectedFilterCategoryId(j11);
    }

    /* renamed from: Y */
    private final void m39236Y() {
        int i11;
        ViewGroup.LayoutParams layoutParams = getContentFilterLayout().getLayoutParams();
        AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        int i12 = this.f41182A;
        if (i12 != 1 && i12 != 0) {
            i11 = 0;
        } else {
            i11 = ZaloCameraView.f40825K2;
        }
        layoutParams2.bottomMargin = i11;
        getContentFilterLayout().setLayoutParams(layoutParams2);
    }

    /* renamed from: Z */
    private final void m39237Z(List list) {
        try {
            InterfaceC7604c interfaceC7604c = this.f41205w;
            if (interfaceC7604c != null) {
                interfaceC7604c.mo39135f(true);
            }
            setFilterAnimsForMiniAdapter(list);
            int i11 = this.f41182A;
            if (i11 != 0 && i11 != 1) {
                if (!TextUtils.equals(this.f41201s, this.f41202t)) {
                    this.f41202t = this.f41201s;
                    AbstractC0837p0.Companion.m2236a().mo2040a(new Runnable() { // from class: we.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            FilterPickerView.m39239b0(FilterPickerView.this);
                        }
                    });
                } else if (!this.f41188G) {
                    AbstractC19444a.m101695c(new Runnable() { // from class: we.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            FilterPickerView.m39241c0(FilterPickerView.this);
                        }
                    });
                }
            }
            getProgressBar().animate().alpha(0.0f).setDuration(200L).withEndAction(new Runnable() { // from class: we.h
                @Override // java.lang.Runnable
                public final void run() {
                    FilterPickerView.m39238a0(FilterPickerView.this);
                }
            }).start();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public static final void m39238a0(FilterPickerView filterPickerView) {
        AbstractC19074t.m100208f(filterPickerView, "this$0");
        try {
            filterPickerView.getProgressBar().setAlpha(1.0f);
            filterPickerView.getProgressBar().setVisibility(8);
            if (filterPickerView.f41184C) {
                filterPickerView.f41192K.m39304P(filterPickerView.f41185D);
                filterPickerView.f41184C = false;
            } else if (filterPickerView.f41183B) {
                filterPickerView.f41192K.m39303O(filterPickerView.f41185D);
                filterPickerView.f41183B = false;
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public static final void m39239b0(FilterPickerView filterPickerView) {
        Bitmap m154224e;
        boolean m127120J;
        AbstractC19074t.m100208f(filterPickerView, "this$0");
        String str = filterPickerView.f41201s;
        if (str != null && str.length() != 0) {
            String str2 = filterPickerView.f41201s;
            AbstractC19074t.m100205c(str2);
            m127120J = AbstractC24341v.m127120J(str2, "content://", false, 2, null);
            if (m127120J) {
                Context context = filterPickerView.getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                C3977j c3977j = new C3977j(context);
                ((C23528a) filterPickerView.getAQuery().m123612r(c3977j)).m123579C(filterPickerView.f41201s, C23278z2.m120073H0(), new C7619r());
                return;
            }
        }
        if (filterPickerView.f41182A != 3) {
            m154224e = AbstractC23009a3.m117964o(filterPickerView.f41201s, 128);
        } else {
            m154224e = AbstractC31990k7.m154224e(filterPickerView.f41201s, 128);
        }
        filterPickerView.m39225A(m154224e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c0 */
    public static final void m39241c0(FilterPickerView filterPickerView) {
        AbstractC19074t.m100208f(filterPickerView, "this$0");
        filterPickerView.f41192K.m39313Z(true);
        filterPickerView.f41192K.m10008p();
    }

    private final C23528a getAQuery() {
        return (C23528a) this.f41200r.getValue();
    }

    private static /* synthetic */ void getCameraInput$annotations() {
    }

    private final void setFilterAnimsForMiniAdapter(List<C29606b> list) {
        try {
            ArrayList arrayList = new ArrayList();
            int i11 = this.f41199q;
            if (i11 == 0) {
                long m122561x = AbstractC23309i.m122561x();
                if (m122561x != -10 && this.f41186E) {
                    this.f41186E = false;
                    this.f41207y = m122561x;
                } else if (this.f41207y == -10) {
                    this.f41207y = list.get(0).m147152c();
                }
            } else if (i11 == 1) {
                this.f41207y = AbstractC23309i.m120886E1();
                this.f41186E = false;
            }
            long j11 = this.f41207y;
            if (j11 != 3 && j11 != 1004) {
                this.f41207y = 3L;
            }
            for (C29606b c29606b : list) {
                List mo39281d = this.f41189H.mo39281d(this.f41207y);
                if (mo39281d != null) {
                    arrayList.addAll(mo39281d);
                }
                Companion.m39280a(arrayList, this.f41182A);
                if ((!arrayList.isEmpty()) || this.f41199q == 1) {
                    break;
                } else {
                    this.f41207y = c29606b.m147152c();
                }
            }
            setSelectedFilterCategoryId(this.f41207y);
            if (!arrayList.isEmpty()) {
                this.f41192K.m39311X(arrayList);
                return;
            }
            InterfaceC7607f interfaceC7607f = this.f41204v;
            if (interfaceC7607f != null) {
                interfaceC7607f.mo39283a();
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: w */
    private final void m39258w(Bitmap bitmap) {
        try {
            if (!this.f41192K.m39305Q().isEmpty()) {
                int size = this.f41192K.m39305Q().size();
                for (int i11 = 0; i11 < size; i11++) {
                    m39259x((C29605a) this.f41192K.m39305Q().get(i11), bitmap, new C7610i(i11));
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: x */
    private final void m39259x(C29605a c29605a, final Bitmap bitmap, final InterfaceC7602a interfaceC7602a) {
        C26674y.m136865t().m136876l(new C26657h(c29605a), "anim_filter_camera", new C26674y.b() { // from class: we.l
            @Override // tg.C26674y.b
            /* renamed from: a */
            public final void mo15759a(int i11, String str, String str2, C26657h c26657h) {
                FilterPickerView.m39260y(FilterPickerView.this, bitmap, interfaceC7602a, i11, str, str2, c26657h);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public static final void m39260y(FilterPickerView filterPickerView, Bitmap bitmap, InterfaceC7602a interfaceC7602a, int i11, String str, String str2, C26657h c26657h) {
        AbstractC19074t.m100208f(filterPickerView, "this$0");
        AbstractC19074t.m100208f(bitmap, "$bitmap");
        AbstractC19074t.m100208f(interfaceC7602a, "$callBack");
        if (i11 == 0 && str != null && str.length() != 0) {
            C18596c m119548a = AbstractC23203s.m119548a(filterPickerView.getContext(), str2, AbstractC23203s.m119549b(str2));
            if (m119548a != null) {
                interfaceC7602a.mo39279b(new C20125e(m119548a).m104742b(bitmap));
                return;
            }
            return;
        }
        interfaceC7602a.mo39278a(i11);
    }

    /* renamed from: C */
    public final void m39261C() {
        boolean z11;
        InterfaceC7604c interfaceC7604c = this.f41205w;
        if (interfaceC7604c != null) {
            interfaceC7604c.mo39133d();
        }
        InterfaceC7604c interfaceC7604c2 = this.f41205w;
        if (interfaceC7604c2 != null) {
            if (this.f41208z != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            interfaceC7604c2.mo39134e("filter_arrow_down", z11);
        }
    }

    /* renamed from: E */
    public final boolean m39262E() {
        InterfaceC7604c interfaceC7604c = this.f41205w;
        if (interfaceC7604c != null) {
            return interfaceC7604c.mo39132c();
        }
        return false;
    }

    /* renamed from: F */
    public final boolean m39263F() {
        return this.f41198p;
    }

    /* renamed from: H */
    public final void m39264H() {
        try {
            List m142136D = C28208v2.m142128t().m142136D();
            AbstractC19074t.m100207e(m142136D, "wrapFilterCategory(...)");
            if (!m142136D.isEmpty()) {
                m39237Z(m142136D);
            } else {
                getHandler().postDelayed(new Runnable() { // from class: we.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        FilterPickerView.m39229I(FilterPickerView.this);
                    }
                }, 5000L);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: J */
    public final void m39265J() {
        this.f41192K.m10008p();
    }

    /* renamed from: K */
    public final void m39266K() {
        if (getHandler() == null) {
            return;
        }
        getHandler().post(new Runnable() { // from class: we.b
            @Override // java.lang.Runnable
            public final void run() {
                FilterPickerView.m39230L(FilterPickerView.this);
            }
        });
    }

    /* renamed from: O */
    public final void m39267O(final C29605a c29605a) {
        Handler handler = getHandler();
        if (handler != null) {
            handler.post(new Runnable() { // from class: we.c
                @Override // java.lang.Runnable
                public final void run() {
                    FilterPickerView.m39233P(FilterPickerView.this, c29605a);
                }
            });
        }
    }

    /* renamed from: R */
    public final void m39268R(final long j11) {
        Handler handler = getHandler();
        if (handler != null) {
            handler.post(new Runnable() { // from class: we.d
                @Override // java.lang.Runnable
                public final void run() {
                    FilterPickerView.m39235S(FilterPickerView.this, j11);
                }
            });
        }
    }

    /* renamed from: T */
    public final void m39269T(boolean z11, C29605a c29605a) {
        AbstractC19074t.m100208f(c29605a, "filterAnim");
        try {
            if (!z11) {
                this.f41208z = null;
            } else {
                C29605a c29605a2 = this.f41208z;
                if (c29605a2 == null || c29605a2 == null || c29605a2.m147131h() != c29605a.m147131h()) {
                    this.f41208z = c29605a;
                }
            }
            RecyclerView.AbstractC1876c0 m9900t0 = this.f41193L.m9900t0(this.f41192K.m39305Q().indexOf(c29605a));
            if (m9900t0 instanceof C7620a.b) {
                this.f41192K.m39312Y(z11, (C7620a.b) m9900t0);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: U */
    public final void m39270U(C29605a c29605a) {
        int m131209i0;
        try {
            m131209i0 = AbstractC25332a0.m131209i0(this.f41192K.m39305Q(), c29605a);
            C7620a.b bVar = (C7620a.b) this.f41193L.m9900t0(m131209i0);
            if (bVar != null) {
                this.f41192K.m39309V(true, bVar);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: V */
    public final void m39271V(C29605a c29605a) {
        int m131209i0;
        try {
            m131209i0 = AbstractC25332a0.m131209i0(this.f41192K.m39305Q(), c29605a);
            C7620a.b bVar = (C7620a.b) this.f41193L.m9900t0(m131209i0);
            if (bVar != null) {
                this.f41192K.m39310W(true, bVar);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: W */
    public final void m39272W(boolean z11) {
        long j11;
        int i11;
        String str = this.f41202t;
        if (str != null && !TextUtils.equals(this.f41201s, str)) {
            m39234Q();
        }
        m39236Y();
        getContentFilterLayout().setVisibility(0);
        if (this.f41205w != null) {
            if (getContentFilterLayout().getHeight() > 0) {
                i11 = getContentFilterLayout().getHeight();
            } else {
                i11 = ZaloCameraView.f40827M2;
            }
            int m118713h0 = ((AbstractC23136l9.m118713h0() - i11) - ZaloCameraView.f40825K2) - AbstractC23222t7.f112539R;
            InterfaceC7604c interfaceC7604c = this.f41205w;
            if (interfaceC7604c != null) {
                interfaceC7604c.mo39131b(m118713h0);
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        if (z11) {
            animatorSet.play(ObjectAnimator.ofFloat(getContentFilterLayout(), "alpha", 0.0f, 1.0f)).with(ObjectAnimator.ofFloat(getContentFilterLayout(), "translationY", AbstractC23136l9.m118742r(140.0f) / 2.0f, 0.0f));
        }
        animatorSet.addListener(new C7618q(z11, this));
        if (z11) {
            j11 = 250;
        } else {
            j11 = 50;
        }
        animatorSet.setDuration(j11);
        animatorSet.start();
    }

    /* renamed from: X */
    public final void m39273X(C29605a c29605a) {
        AbstractC19074t.m100208f(c29605a, "filterAnim");
        try {
            if (!this.f41192K.m39305Q().isEmpty()) {
                this.f41193L.mo9854S1(this.f41192K.m39305Q().indexOf(c29605a));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // vg.C28208v2.d
    /* renamed from: a */
    public void mo39274a(final List list, boolean z11) {
        Handler handler;
        AbstractC19074t.m100208f(list, "filterCategories");
        AbstractC20110a.f98889a.mo104548a("onGotCategoryList: %s", Boolean.valueOf(z11));
        if (!z11 && (handler = getHandler()) != null) {
            handler.postDelayed(new Runnable() { // from class: we.i
                @Override // java.lang.Runnable
                public final void run() {
                    FilterPickerView.m39232N(FilterPickerView.this, list);
                }
            }, 200L);
        }
    }

    @Override // vg.C28208v2.d
    /* renamed from: b */
    public void mo39275b(long j11, final List list, boolean z11) {
        AbstractC19074t.m100208f(list, "filterAnims");
        AbstractC20110a.f98889a.mo104548a("onGotCategoryDetailList: %ld", Long.valueOf(j11));
        Handler handler = getHandler();
        if (handler != null) {
            handler.post(new Runnable() { // from class: we.k
                @Override // java.lang.Runnable
                public final void run() {
                    FilterPickerView.m39231M(FilterPickerView.this, list);
                }
            });
        }
    }

    public final boolean getAutoApplyNextFilter() {
        return this.f41183B;
    }

    public final boolean getAutoApplyPrevFilter() {
        return this.f41184C;
    }

    public final ActiveImageButton getBtnSlideDown() {
        return (ActiveImageButton) this.f41190I.getValue();
    }

    public final FrameLayout getContentFilterLayout() {
        return (FrameLayout) this.f41195N.getValue();
    }

    public final String getCurrentThumbPath() {
        return this.f41202t;
    }

    public final SmoothScrollLinearLayoutManager getFilterLayoutManager() {
        return (SmoothScrollLinearLayoutManager) this.f41191J.getValue();
    }

    public final C7620a getFilterPickerAdapter() {
        return this.f41192K;
    }

    public final int getFilterPickerOpenSource() {
        return this.f41199q;
    }

    public final C29605a getLastFilterAnim() {
        return this.f41185D;
    }

    public final ProgressBar getProgressBar() {
        return (ProgressBar) this.f41196O.getValue();
    }

    public final RobotoTextView getProgressSeekBarTextView() {
        return (RobotoTextView) this.f41197P.getValue();
    }

    public final RecyclerView getRecyclerView() {
        return this.f41193L;
    }

    public final int getRecyclerViewHeight() {
        return this.f41187F;
    }

    public final SeekBar getSeekBar() {
        return (SeekBar) this.f41194M.getValue();
    }

    public final String getThumbPath() {
        return this.f41201s;
    }

    public final void setAutoApplyNextFilter(boolean z11) {
        this.f41183B = z11;
    }

    public final void setAutoApplyPrevFilter(boolean z11) {
        this.f41184C = z11;
    }

    public final void setCameraInput(int i11) {
        this.f41182A = i11;
        C7620a c7620a = this.f41192K;
        boolean z11 = true;
        if (i11 != 1 && i11 != 0) {
            z11 = false;
        }
        c7620a.m39313Z(z11);
    }

    public final void setCurrentThumbPath(String str) {
        this.f41202t = str;
    }

    public final void setEventListener(InterfaceC7604c interfaceC7604c) {
        this.f41205w = interfaceC7604c;
    }

    public final void setFilterPickerAdapter(C7620a c7620a) {
        AbstractC19074t.m100208f(c7620a, "<set-?>");
        this.f41192K = c7620a;
    }

    public final void setFilterPickerOpenSource(int i11) {
        this.f41199q = i11;
    }

    public final void setIntensityFilterAdjustListener(InterfaceC7606e interfaceC7606e) {
        this.f41206x = interfaceC7606e;
    }

    public final void setLastFilterAnim(C29605a c29605a) {
        this.f41185D = c29605a;
    }

    public final void setOnDemandListener(InterfaceC7607f interfaceC7607f) {
        this.f41204v = interfaceC7607f;
    }

    public final void setRecyclerView(RecyclerView recyclerView) {
        AbstractC19074t.m100208f(recyclerView, "<set-?>");
        this.f41193L = recyclerView;
    }

    public final void setRecyclerViewHeight(int i11) {
        this.f41187F = i11;
    }

    public final void setSelectedFilter(C29605a c29605a) {
        if (c29605a != null) {
            this.f41208z = c29605a;
        }
    }

    public final void setSelectedFilterCategoryId(long j11) {
        this.f41207y = j11;
    }

    public final void setStateListener(InterfaceC7608g interfaceC7608g) {
        this.f41203u = interfaceC7608g;
    }

    public final void setThumbPath(String str) {
        this.f41201s = str;
    }

    /* renamed from: v */
    public final void m39276v(int i11) {
        InterfaceC7606e interfaceC7606e = this.f41206x;
        if (interfaceC7606e != null) {
            interfaceC7606e.mo39282a(i11);
        }
    }

    /* renamed from: z */
    public final void m39277z() {
        this.f41208z = null;
        m39266K();
    }
}
