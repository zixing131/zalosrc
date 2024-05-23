package com.zing.zalo.shortvideo.p072ui.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.core.view.AbstractC1595r0;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19069o0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.Iterator;
import mj0.AbstractC23322a;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import q10.C25029l1;
import s20.AbstractC26105g;
import s20.AbstractC26112n;
import u20.C26988i;
import v00.AbstractC27410e;
import v00.AbstractC27413h;

/* loaded from: classes5.dex */
public final class LoadingLayout extends LinearLayout {

    /* renamed from: p */
    private final InterfaceC24854k f54127p;

    /* renamed from: q */
    private final C26988i f54128q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.widget.LoadingLayout$a */
    /* loaded from: classes5.dex */
    public static final class C10696a extends AbstractC19075u implements InterfaceC18494a {
        C10696a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C25029l1 mo12V4() {
            return C25029l1.m129877a(LoadingLayout.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.widget.LoadingLayout$b */
    /* loaded from: classes5.dex */
    public static final class C10697b extends AbstractC19075u implements InterfaceC18494a {
        C10697b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m55788a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m55788a() {
            ProgressBar progressBar = LoadingLayout.this.getBinding().f120078q;
            AbstractC19074t.m100207e(progressBar, "barLoading");
            AbstractC26112n.m134431w0(progressBar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.widget.LoadingLayout$c */
    /* loaded from: classes5.dex */
    public static final class C10698c extends AbstractC19075u implements InterfaceC18494a {
        C10698c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m55789a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m55789a() {
            ProgressBar progressBar = LoadingLayout.this.getBinding().f120078q;
            AbstractC19074t.m100207e(progressBar, "barLoading");
            AbstractC26112n.m134367H(progressBar);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.LoadingLayout$d */
    /* loaded from: classes5.dex */
    public static final class C10699d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ Object f54132q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10699d(Object obj) {
            super(1);
            this.f54132q = obj;
        }

        /* renamed from: a */
        public final void m55790a(View view) {
            InterfaceC18494a interfaceC18494a;
            AbstractC19074t.m100208f(view, "it");
            Object obj = this.f54132q;
            if (AbstractC19069o0.m100194k(obj, 0)) {
                interfaceC18494a = (InterfaceC18494a) obj;
            } else {
                interfaceC18494a = null;
            }
            if (interfaceC18494a != null) {
                interfaceC18494a.mo12V4();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55790a((View) obj);
            return C24848g0.f119245a;
        }
    }

    public /* synthetic */ LoadingLayout(Context context, AttributeSet attributeSet, int i11, AbstractC19060k abstractC19060k) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    /* renamed from: e */
    public static /* synthetic */ void m55778e(LoadingLayout loadingLayout, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i11, Object obj7) {
        if ((i11 & 1) != 0) {
            obj = null;
        }
        if ((i11 & 2) != 0) {
            obj2 = null;
        }
        if ((i11 & 4) != 0) {
            obj3 = null;
        }
        if ((i11 & 8) != 0) {
            obj4 = null;
        }
        if ((i11 & 16) != 0) {
            obj5 = null;
        }
        if ((i11 & 32) != 0) {
            obj6 = null;
        }
        loadingLayout.m55782d(obj, obj2, obj3, obj4, obj5, obj6);
    }

    public final C25029l1 getBinding() {
        return (C25029l1) this.f54127p.getValue();
    }

    /* renamed from: i */
    public static /* synthetic */ void m55779i(LoadingLayout loadingLayout, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = AbstractC27413h.zch_error_no_data_returned;
        }
        loadingLayout.m55785h(i11);
    }

    /* renamed from: b */
    public final void m55780b() {
        C25029l1 binding = getBinding();
        ImageView imageView = binding.f120080s;
        AbstractC19074t.m100207e(imageView, "errIcon");
        AbstractC26112n.m134367H(imageView);
        SimpleShadowTextView simpleShadowTextView = binding.f120082u;
        AbstractC19074t.m100207e(simpleShadowTextView, "errTitle");
        AbstractC26112n.m134367H(simpleShadowTextView);
        SimpleShadowTextView simpleShadowTextView2 = binding.f120081t;
        AbstractC19074t.m100207e(simpleShadowTextView2, "errMessage");
        AbstractC26112n.m134367H(simpleShadowTextView2);
        SimpleShadowTextView simpleShadowTextView3 = binding.f120079r;
        AbstractC19074t.m100207e(simpleShadowTextView3, "errAction");
        AbstractC26112n.m134367H(simpleShadowTextView3);
        setBackground(null);
    }

    /* renamed from: c */
    public final void m55781c() {
        this.f54128q.m139098b();
    }

    /* renamed from: d */
    public final void m55782d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        C25029l1 binding = getBinding();
        if (obj != null) {
            if (obj instanceof Integer) {
                binding.f120080s.setImageResource(((Number) obj).intValue());
            } else if (obj instanceof Bitmap) {
                binding.f120080s.setImageBitmap((Bitmap) obj);
            } else if (obj instanceof Drawable) {
                binding.f120080s.setImageDrawable((Drawable) obj);
            }
            ImageView imageView = binding.f120080s;
            AbstractC19074t.m100207e(imageView, "errIcon");
            AbstractC26112n.m134431w0(imageView);
        } else {
            ImageView imageView2 = binding.f120080s;
            AbstractC19074t.m100207e(imageView2, "errIcon");
            AbstractC26112n.m134367H(imageView2);
        }
        if (obj2 != null) {
            if (obj2 instanceof Integer) {
                binding.f120082u.setText(((Number) obj2).intValue());
            } else if (obj2 instanceof CharSequence) {
                binding.f120082u.setText((CharSequence) obj2);
            }
            SimpleShadowTextView simpleShadowTextView = binding.f120082u;
            AbstractC19074t.m100207e(simpleShadowTextView, "errTitle");
            AbstractC26112n.m134431w0(simpleShadowTextView);
        } else {
            SimpleShadowTextView simpleShadowTextView2 = binding.f120082u;
            AbstractC19074t.m100207e(simpleShadowTextView2, "errTitle");
            AbstractC26112n.m134367H(simpleShadowTextView2);
        }
        if (obj3 != null) {
            if (obj3 instanceof Integer) {
                binding.f120081t.setText(((Number) obj3).intValue());
            } else if (obj3 instanceof CharSequence) {
                binding.f120081t.setText((CharSequence) obj3);
            }
            SimpleShadowTextView simpleShadowTextView3 = binding.f120081t;
            AbstractC19074t.m100207e(simpleShadowTextView3, "errMessage");
            AbstractC26112n.m134431w0(simpleShadowTextView3);
        } else {
            SimpleShadowTextView simpleShadowTextView4 = binding.f120081t;
            AbstractC19074t.m100207e(simpleShadowTextView4, "errMessage");
            AbstractC26112n.m134367H(simpleShadowTextView4);
        }
        if (obj4 != null) {
            if (obj4 instanceof Integer) {
                binding.f120079r.setText(((Number) obj4).intValue());
            } else if (obj4 instanceof CharSequence) {
                binding.f120079r.setText((CharSequence) obj4);
            }
            SimpleShadowTextView simpleShadowTextView5 = binding.f120079r;
            AbstractC19074t.m100207e(simpleShadowTextView5, "errAction");
            AbstractC26112n.m134407k0(simpleShadowTextView5, new C10699d(obj5));
            SimpleShadowTextView simpleShadowTextView6 = binding.f120079r;
            AbstractC19074t.m100207e(simpleShadowTextView6, "errAction");
            AbstractC26112n.m134431w0(simpleShadowTextView6);
        } else {
            SimpleShadowTextView simpleShadowTextView7 = binding.f120079r;
            AbstractC19074t.m100207e(simpleShadowTextView7, "errAction");
            AbstractC26112n.m134367H(simpleShadowTextView7);
        }
        if (obj6 != null) {
            if (obj6 instanceof Integer) {
                setBackgroundResource(((Number) obj6).intValue());
            } else if (obj6 instanceof Drawable) {
                setBackground((Drawable) obj6);
            }
        } else {
            setBackground(null);
        }
        m55781c();
    }

    /* renamed from: f */
    public final void m55783f(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "actionOpt");
        m55778e(this, Integer.valueOf(AbstractC23322a.zch_ic_empty_state_line_48), Integer.valueOf(AbstractC27413h.zch_error_loading_failed), Integer.valueOf(AbstractC27413h.zch_error_loading_failed_hint), Integer.valueOf(AbstractC27413h.zch_error_retry), interfaceC18494a, null, 32, null);
    }

    /* renamed from: g */
    public final void m55784g(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "actionOpt");
        m55778e(this, Integer.valueOf(AbstractC23322a.zch_ic_wifi_off_line_40), Integer.valueOf(AbstractC27413h.zch_error_no_connection), Integer.valueOf(AbstractC27413h.zch_error_no_connection_hint), Integer.valueOf(AbstractC27413h.zch_error_retry), interfaceC18494a, null, 32, null);
    }

    /* renamed from: h */
    public final void m55785h(int i11) {
        m55778e(this, null, null, Integer.valueOf(i11), null, null, null, 59, null);
    }

    /* renamed from: j */
    public final void m55786j() {
        this.f54128q.m139100d();
        m55780b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(context, "context");
        View.inflate(context, AbstractC27410e.zch_layout_loading, this);
        setGravity(17);
        setOrientation(1);
        if (!isInEditMode()) {
            Iterator it = AbstractC1595r0.m8168a(this).iterator();
            while (it.hasNext()) {
                AbstractC26112n.m134367H((View) it.next());
            }
            setPadding(AbstractC26105g.m134347n(40), getPaddingTop(), AbstractC26105g.m134347n(40), getPaddingBottom());
        }
        m129210a = AbstractC24856m.m129210a(new C10696a());
        this.f54127p = m129210a;
        this.f54128q = new C26988i(new C10697b(), new C10698c());
    }
}
