package com.zing.zalo.camera.videomodepicker;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.camera.videomodepicker.C7758a;
import com.zing.zalo.utils.ToastUtils;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.List;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import p207he.C20024r;
import p227i3.C20218v;
import p649xl.C29955o1;
import th.C26694o;

/* renamed from: com.zing.zalo.camera.videomodepicker.a */
/* loaded from: classes3.dex */
public final class C7758a extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    private final a f41609r;

    /* renamed from: s */
    private final List f41610s;

    /* renamed from: t */
    private boolean f41611t;

    /* renamed from: u */
    private int f41612u;

    /* renamed from: com.zing.zalo.camera.videomodepicker.a$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        void mo39505a(int i11);
    }

    /* renamed from: com.zing.zalo.camera.videomodepicker.a$b */
    /* loaded from: classes3.dex */
    public static final class b extends RecyclerView.AbstractC1876c0 {
        public static final a Companion = new a(null);

        /* renamed from: I */
        private C29955o1 f41613I;

        /* renamed from: J */
        private final int f41614J;

        /* renamed from: com.zing.zalo.camera.videomodepicker.a$b$a */
        /* loaded from: classes3.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final b m39516a(ViewGroup viewGroup, int i11) {
                AbstractC19074t.m100208f(viewGroup, "parent");
                C29955o1 m148302c = C29955o1.m148302c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                AbstractC19074t.m100207e(m148302c, "inflate(...)");
                return new b(m148302c, i11);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C29955o1 c29955o1, int i11) {
            super(c29955o1.getRoot());
            AbstractC19074t.m100208f(c29955o1, "binding");
            this.f41613I = c29955o1;
            this.f41614J = i11;
            this.f7784p.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: mf.b
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                    C7758a.b.m39514j0(C7758a.b.this, view, i12, i13, i14, i15, i16, i17, i18, i19);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j0 */
        public static final void m39514j0(b bVar, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            int m118722k0;
            AbstractC19074t.m100208f(bVar, "this$0");
            AbstractC19074t.m100208f(view, C20218v.f100059b);
            if ((i11 == i15 && i12 == i16 && i13 == i17 && i14 == i18) || !(view.getParent() instanceof RecyclerView)) {
                return;
            }
            if (C26694o.f126495d) {
                if (view.getContext() instanceof Activity) {
                    m118722k0 = AbstractC23136l9.m118766z(view.getContext());
                } else {
                    m118722k0 = AbstractC23136l9.m118722k0();
                }
            } else {
                m118722k0 = AbstractC23136l9.m118722k0();
            }
            long m9930B = bVar.m9930B();
            ViewParent parent = view.getParent();
            AbstractC19074t.m100206d(parent, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            RecyclerView recyclerView = (RecyclerView) parent;
            int measuredWidth = (m118722k0 - view.getMeasuredWidth()) / 2;
            if (m9930B == 0) {
                recyclerView.setPadding(measuredWidth, 0, recyclerView.getPaddingRight(), 0);
            } else if (m9930B == bVar.f41614J - 1) {
                recyclerView.setPadding(recyclerView.getPaddingLeft(), 0, measuredWidth, 0);
            }
        }

        /* renamed from: k0 */
        public final void m39515k0(String str, int i11, int i12) {
            int m118641B;
            if (i11 == i12) {
                m118641B = AbstractC23136l9.m118641B(this.f41613I.f138847q.getContext(), AbstractC16801x.white);
            } else {
                m118641B = AbstractC23136l9.m118641B(this.f41613I.f138847q.getContext(), AbstractC16801x.white_50);
            }
            this.f41613I.f138847q.setText(str);
            this.f41613I.f138847q.setTextColor(m118641B);
            this.f7784p.setPadding(AbstractC23222t7.f112580q, AbstractC23222t7.f112566j, AbstractC23222t7.f112580q, AbstractC23222t7.f112566j);
            this.f7784p.setTag(Integer.valueOf(i11));
        }
    }

    public C7758a(a aVar, List list) {
        AbstractC19074t.m100208f(aVar, "callback");
        AbstractC19074t.m100208f(list, "pickerModes");
        this.f41609r = aVar;
        this.f41610s = list;
        this.f41611t = true;
        m9999J(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public static final void m39507O(C7758a c7758a, int i11, View view) {
        AbstractC19074t.m100208f(c7758a, "this$0");
        c7758a.m39508M(i11);
    }

    /* renamed from: M */
    public final void m39508M(int i11) {
        if (this.f41611t) {
            if (C20024r.m103941j()) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_can_not_record_video_in_call));
                return;
            }
            this.f41612u = i11;
            this.f41609r.mo39505a(i11);
            m10008p();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public void mo9990A(b bVar, final int i11) {
        AbstractC19074t.m100208f(bVar, "holder");
        bVar.m39515k0((String) this.f41610s.get(i11), i11, this.f41612u);
        bVar.f7784p.setOnClickListener(new View.OnClickListener() { // from class: mf.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C7758a.m39507O(C7758a.this, i11, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public b mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        return b.Companion.m39516a(viewGroup, this.f41610s.size());
    }

    /* renamed from: Q */
    public final void m39511Q(boolean z11) {
        this.f41611t = z11;
    }

    /* renamed from: R */
    public final void m39512R(int i11) {
        this.f41612u = i11;
        m10008p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f41610s.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: l */
    public long mo10004l(int i11) {
        return i11;
    }
}
