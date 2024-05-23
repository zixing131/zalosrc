package jo0;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import ep0.C18556p;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kg.AbstractC21705b;
import kg.C21709f;
import kg.C21715l;
import ko0.C21791f;
import p266jg.AbstractC21245c;
import zm.voip.p721ui.incall.GroupCallActivity;
import zm.voip.widgets.moduleviews.MemberGCallModuleView;

/* renamed from: jo0.g */
/* loaded from: classes7.dex */
public class C21329g extends RecyclerView.AbstractC1880g {

    /* renamed from: t */
    public GroupCallActivity f103848t;

    /* renamed from: u */
    private boolean f103849u = false;

    /* renamed from: v */
    public boolean f103850v = false;

    /* renamed from: w */
    private final AbstractC21705b f103851w = C21715l.m112062k();

    /* renamed from: r */
    private ArrayList f103846r = new ArrayList();

    /* renamed from: s */
    private HashSet f103847s = new HashSet();

    /* renamed from: jo0.g$a */
    /* loaded from: classes7.dex */
    public static abstract class a extends RecyclerView.AbstractC1876c0 {
        a(View view) {
            super(view);
        }

        /* renamed from: i0 */
        public abstract void mo110448i0(int i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jo0.g$b */
    /* loaded from: classes7.dex */
    public static class b implements View.OnTouchListener {

        /* renamed from: p */
        private final C21709f f103852p;

        /* renamed from: q */
        private boolean f103853q;

        b(C21709f c21709f) {
            this.f103852p = c21709f;
        }

        /* renamed from: a */
        void m110449a(View view) {
            this.f103853q = false;
            view.setPressed(false);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            try {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action == 3) {
                            this.f103852p.m112046s(0.0d);
                            if (this.f103853q) {
                                m110449a(view);
                            }
                        }
                    } else if (this.f103853q) {
                        view.performClick();
                        m110449a(view);
                        this.f103852p.m112046s(0.0d);
                    }
                } else {
                    this.f103853q = true;
                }
            } catch (Exception unused) {
            }
            return false;
        }
    }

    /* renamed from: jo0.g$c */
    /* loaded from: classes7.dex */
    public class c extends a {

        /* renamed from: I */
        public MemberGCallModuleView f103854I;

        /* renamed from: J */
        C21709f f103855J;

        c(MemberGCallModuleView memberGCallModuleView) {
            super(memberGCallModuleView);
            memberGCallModuleView.setId(AbstractC6918a0.call_memberGroupCallItem);
            this.f103854I = memberGCallModuleView;
            C21709f m112019d = C21329g.this.f103851w.m112019d();
            this.f103855J = m112019d;
            m112019d.m112048u(AbstractC21245c.f103555b);
        }

        @Override // jo0.C21329g.a
        /* renamed from: i0 */
        public void mo110448i0(int i11) {
            try {
                this.f103854I.m157449V(C21329g.this.m110440O(i11), C21329g.this.f103849u, i11);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public C21329g(GroupCallActivity groupCallActivity) {
        this.f103848t = groupCallActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public /* synthetic */ void m110439Q(int i11, View view) {
        if (this.f103848t.m156635q9()) {
            this.f103848t.mo138171hq();
        } else if (!this.f103848t.m156631i9()) {
            this.f103848t.m156624Uc(m110440O(i11).m112477l());
        }
    }

    /* renamed from: O */
    public C21791f m110440O(int i11) {
        ArrayList arrayList = this.f103846r;
        if (arrayList != null && i11 >= 0 && i11 < arrayList.size()) {
            return (C21791f) this.f103846r.get(i11);
        }
        return null;
    }

    /* renamed from: P */
    public HashSet m110441P() {
        return this.f103847s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public void mo9990A(a aVar, final int i11) {
        aVar.mo110448i0(i11);
        aVar.f7784p.setTag(Integer.valueOf(i11));
        if (aVar instanceof c) {
            c cVar = (c) aVar;
            cVar.f103855J.m112030a(new C18556p(aVar.f7784p, 1.15d));
            aVar.f7784p.setOnTouchListener(new b(cVar.f103855J));
            aVar.f7784p.setOnClickListener(new View.OnClickListener() { // from class: jo0.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C21329g.this.m110439Q(i11, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public a mo9992C(ViewGroup viewGroup, int i11) {
        return new c(new MemberGCallModuleView(this.f103848t, this));
    }

    /* renamed from: T */
    public void m110444T(boolean z11) {
        this.f103850v = z11;
        if (mo10003k() > 0) {
            m10008p();
        }
    }

    /* renamed from: U */
    public void m110445U(boolean z11) {
        this.f103849u = z11;
    }

    /* renamed from: V */
    public void m110446V(List list) {
        try {
            this.f103846r = new ArrayList(list);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: W */
    public void m110447W(HashSet hashSet) {
        try {
            this.f103847s = hashSet;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        ArrayList arrayList = this.f103846r;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: l */
    public long mo10004l(int i11) {
        return i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        return ((C21791f) this.f103846r.get(i11)).m112476k();
    }
}
