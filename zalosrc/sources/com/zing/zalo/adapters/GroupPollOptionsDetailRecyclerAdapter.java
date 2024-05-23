package com.zing.zalo.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.adapters.GroupPollOptionsDetailRecyclerAdapter;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.moduleview.chatinfo.BaseMemberItemModuleView;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalocore.CoreUtility;
import java.util.ArrayList;
import me0.AbstractC23022b5;
import me0.AbstractC23028c0;
import me0.AbstractC23063f2;
import me0.AbstractC23136l9;
import me0.C23212s8;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p262jb.AbstractC21196a;
import p304ks.AbstractC21935u;
import p354n3.C23528a;
import vg.AbstractRunnableC28185s6;
import vg.C28203u6;

/* loaded from: classes3.dex */
public class GroupPollOptionsDetailRecyclerAdapter extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    Context f38090r;

    /* renamed from: s */
    ArrayList f38091s;

    /* renamed from: t */
    InterfaceC6959a f38092t;

    /* renamed from: u */
    C23528a f38093u;

    /* loaded from: classes3.dex */
    public class MemberVotingView extends BaseMemberItemModuleView implements AbstractRunnableC28185s6.b {

        /* renamed from: W */
        String f38094W;

        public MemberVotingView(Context context, C23528a c23528a) {
            super(context, c23528a);
            this.f38094W = "";
            this.f64555R.mo44614b1(8);
            this.f64555R.mo89109M0(null);
            this.f64553P.mo44614b1(8);
            this.f64550M.mo44614b1(0);
            this.f64551N.mo44614b1(8);
        }

        /* renamed from: Y */
        private void m35698Y(final ContactProfile contactProfile) {
            this.f64550M.m115407x1(C23212s8.m119607o(this.f84675p, AbstractC21196a.TextColor1));
            this.f64550M.m115406w1(AbstractC23028c0.m118085e(contactProfile, false, AbstractC8020f0.str_me));
            this.f64552O.m115439w1(C23278z2.m120143n());
            this.f64552O.m115429C1(false, false);
            this.f64552O.m115433q1(contactProfile);
            if (contactProfile.f42434r.equals(CoreUtility.f89233i)) {
                this.f64555R.mo44614b1(8);
                this.f64555R.mo89109M0(null);
            } else if (!AbstractC21935u.m114554u(contactProfile.f42434r) && contactProfile.f42352K0 <= 0) {
                this.f64555R.mo44614b1(0);
                if (AbstractC23063f2.m118359k(contactProfile.f42434r)) {
                    this.f64555R.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_sendmes_short));
                    AbstractC23022b5.m118023a(this.f64555R, AbstractC8915g0.btnType1_small);
                    this.f64555R.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.adapters.i2
                        @Override // com.zing.zalo.uidrawing.C16719g.c
                        /* renamed from: y */
                        public final void mo929y(C16719g c16719g) {
                            GroupPollOptionsDetailRecyclerAdapter.MemberVotingView.this.m35699b0(contactProfile, c16719g);
                        }
                    });
                } else {
                    this.f64555R.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.btn_func_Add));
                    AbstractC23022b5.m118023a(this.f64555R, AbstractC8915g0.btnType2_medium);
                    this.f64555R.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.adapters.j2
                        @Override // com.zing.zalo.uidrawing.C16719g.c
                        /* renamed from: y */
                        public final void mo929y(C16719g c16719g) {
                            GroupPollOptionsDetailRecyclerAdapter.MemberVotingView.this.m35700c0(contactProfile, c16719g);
                        }
                    });
                }
            } else {
                this.f64555R.mo44614b1(8);
                this.f64555R.mo89109M0(null);
            }
            setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.k2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GroupPollOptionsDetailRecyclerAdapter.MemberVotingView.this.m35701d0(contactProfile, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b0 */
        public /* synthetic */ void m35699b0(ContactProfile contactProfile, C16719g c16719g) {
            InterfaceC6959a interfaceC6959a = GroupPollOptionsDetailRecyclerAdapter.this.f38092t;
            if (interfaceC6959a != null) {
                interfaceC6959a.mo35705b(contactProfile);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c0 */
        public /* synthetic */ void m35700c0(ContactProfile contactProfile, C16719g c16719g) {
            InterfaceC6959a interfaceC6959a = GroupPollOptionsDetailRecyclerAdapter.this.f38092t;
            if (interfaceC6959a != null) {
                interfaceC6959a.mo35706c(contactProfile);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d0 */
        public /* synthetic */ void m35701d0(ContactProfile contactProfile, View view) {
            InterfaceC6959a interfaceC6959a = GroupPollOptionsDetailRecyclerAdapter.this.f38092t;
            if (interfaceC6959a != null) {
                interfaceC6959a.mo35704a(contactProfile);
            }
        }

        /* renamed from: e0 */
        private void m35702e0() {
            this.f64550M.m115406w1("");
            this.f64552O.m115441y1(C23212s8.m119609q(this.f84675p, AbstractC16781w.default_avatar));
            this.f64555R.mo44614b1(8);
            this.f64555R.mo89109M0(null);
            setOnClickListener(null);
        }

        /* renamed from: a0 */
        public void m35703a0(String str, int i11) {
            int i12;
            try {
                this.f38094W = str;
                C16719g c16719g = this.f64549L;
                if (i11 == 0) {
                    i12 = 8;
                } else {
                    i12 = 0;
                }
                c16719g.mo44614b1(i12);
                ContactProfile m141809c = C28203u6.f131407a.m141809c(str);
                if (m141809c == null) {
                    m35702e0();
                } else {
                    m35698Y(m141809c);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.adapters.GroupPollOptionsDetailRecyclerAdapter$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC6959a {
        /* renamed from: a */
        void mo35704a(ContactProfile contactProfile);

        /* renamed from: b */
        void mo35705b(ContactProfile contactProfile);

        /* renamed from: c */
        void mo35706c(ContactProfile contactProfile);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.adapters.GroupPollOptionsDetailRecyclerAdapter$b */
    /* loaded from: classes3.dex */
    public static class C6960b extends RecyclerView.AbstractC1876c0 {
        C6960b(View view) {
            super(view);
        }
    }

    public GroupPollOptionsDetailRecyclerAdapter(Context context, ArrayList arrayList, InterfaceC6959a interfaceC6959a) {
        this.f38090r = context;
        this.f38093u = new C23528a(context);
        this.f38091s = arrayList;
        this.f38092t = interfaceC6959a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo9990A(C6960b c6960b, int i11) {
        ((MemberVotingView) c6960b.f7784p).m35703a0((String) this.f38091s.get(i11), i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public C6960b mo9992C(ViewGroup viewGroup, int i11) {
        return new C6960b(new MemberVotingView(this.f38090r, this.f38093u));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f38091s.size();
    }
}
