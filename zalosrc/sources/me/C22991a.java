package me;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1915h;
import androidx.recyclerview.widget.AbstractC1925r;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.calls.ringbacktone.presentation.view.RingBackToneErrorView;
import com.zing.zalo.calls.ringbacktone.presentation.view.RingBackToneViewCell;
import com.zing.zalo.feed.mvp.profile.ProfileSkeletonView;
import fn0.AbstractC19074t;
import kotlin.NoWhenBranchMatchedException;
import p389oe.AbstractC24241h;
import p389oe.InterfaceC24235b;

/* renamed from: me.a */
/* loaded from: classes3.dex */
public final class C22991a extends AbstractC1925r {

    /* renamed from: t */
    private InterfaceC24235b f111821t;

    /* renamed from: me.a$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC1915h.d {
        @Override // androidx.recyclerview.widget.AbstractC1915h.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo10506a(AbstractC24241h abstractC24241h, AbstractC24241h abstractC24241h2) {
            AbstractC19074t.m100208f(abstractC24241h, "oldItem");
            AbstractC19074t.m100208f(abstractC24241h2, "newItem");
            return AbstractC19074t.m100204b(abstractC24241h, abstractC24241h2);
        }

        @Override // androidx.recyclerview.widget.AbstractC1915h.d
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean mo10507b(AbstractC24241h abstractC24241h, AbstractC24241h abstractC24241h2) {
            AbstractC19074t.m100208f(abstractC24241h, "oldItem");
            AbstractC19074t.m100208f(abstractC24241h2, "newItem");
            if (abstractC24241h instanceof AbstractC24241h.c) {
                if (!(abstractC24241h2 instanceof AbstractC24241h.c) || !AbstractC19074t.m100204b(((AbstractC24241h.c) abstractC24241h).m126548e(), ((AbstractC24241h.c) abstractC24241h2).m126548e())) {
                    return false;
                }
            } else {
                if (abstractC24241h instanceof AbstractC24241h.d) {
                    return abstractC24241h2 instanceof AbstractC24241h.d;
                }
                if (abstractC24241h instanceof AbstractC24241h.b) {
                    if (!(abstractC24241h2 instanceof AbstractC24241h.b) || !AbstractC19074t.m100204b(((AbstractC24241h.b) abstractC24241h).m126544b(), ((AbstractC24241h.b) abstractC24241h2).m126544b())) {
                        return false;
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return true;
        }
    }

    /* renamed from: me.a$b */
    /* loaded from: classes3.dex */
    public static final class b extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private RingBackToneErrorView f111822I;

        /* renamed from: J */
        private RingBackToneViewCell f111823J;

        /* renamed from: K */
        private ProfileSkeletonView f111824K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view, int i11) {
            super(view);
            AbstractC19074t.m100208f(view, "view");
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        this.f111824K = (ProfileSkeletonView) view;
                        return;
                    }
                    return;
                }
                this.f111822I = (RingBackToneErrorView) view;
                return;
            }
            this.f111823J = (RingBackToneViewCell) view;
        }

        /* renamed from: i0 */
        public final RingBackToneErrorView m117796i0() {
            return this.f111822I;
        }

        /* renamed from: j0 */
        public final RingBackToneViewCell m117797j0() {
            return this.f111823J;
        }

        /* renamed from: k0 */
        public final ProfileSkeletonView m117798k0() {
            return this.f111824K;
        }
    }

    public C22991a() {
        super(new a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void mo9990A(b bVar, int i11) {
        AbstractC19074t.m100208f(bVar, "holder");
        AbstractC24241h abstractC24241h = (AbstractC24241h) m10633M(i11);
        if (abstractC24241h instanceof AbstractC24241h.b) {
            RingBackToneErrorView m117796i0 = bVar.m117796i0();
            if (m117796i0 != null) {
                m117796i0.m37797c(((AbstractC24241h.b) abstractC24241h).m126544b());
                m117796i0.setListener(this.f111821t);
                return;
            }
            return;
        }
        if (abstractC24241h instanceof AbstractC24241h.c) {
            RingBackToneViewCell m117797j0 = bVar.m117797j0();
            if (m117797j0 != null) {
                m117797j0.m37810c0((AbstractC24241h.c) abstractC24241h);
                m117797j0.setListener(this.f111821t);
                return;
            }
            return;
        }
        if (abstractC24241h instanceof AbstractC24241h.d) {
            ProfileSkeletonView m117798k0 = bVar.m117798k0();
            if (m117798k0 != null) {
                m117798k0.setSkeletonLayoutType(8);
                return;
            }
            return;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public b mo9992C(ViewGroup viewGroup, int i11) {
        View ringBackToneViewCell;
        AbstractC19074t.m100208f(viewGroup, "parent");
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    ringBackToneViewCell = new View(viewGroup.getContext());
                } else {
                    ringBackToneViewCell = new ProfileSkeletonView(viewGroup.getContext());
                }
            } else {
                ringBackToneViewCell = new RingBackToneErrorView(viewGroup.getContext());
            }
        } else {
            ringBackToneViewCell = new RingBackToneViewCell(viewGroup.getContext());
        }
        return new b(ringBackToneViewCell, i11);
    }

    /* renamed from: S */
    public final void m117793S(InterfaceC24235b interfaceC24235b) {
        this.f111821t = interfaceC24235b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: l */
    public long mo10004l(int i11) {
        try {
            AbstractC24241h abstractC24241h = (AbstractC24241h) m10633M(i11);
            if (abstractC24241h instanceof AbstractC24241h.b) {
                return 1L;
            }
            if (abstractC24241h instanceof AbstractC24241h.d) {
                return 2L;
            }
            if (abstractC24241h instanceof AbstractC24241h.c) {
                return Long.parseLong(((AbstractC24241h.c) abstractC24241h).m126548e());
            }
            throw new NoWhenBranchMatchedException();
        } catch (Exception e11) {
            e11.printStackTrace();
            return 0L;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        return ((AbstractC24241h) m10633M(i11)).m126543a();
    }
}
