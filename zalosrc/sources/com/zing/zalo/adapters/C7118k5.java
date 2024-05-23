package com.zing.zalo.adapters;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.p077ui.zviews.ProfileCardLoadingError;
import com.zing.zalo.p077ui.zviews.ProfileCardView;
import com.zing.zalo.zview.animation.AnimationTarget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23144m6;
import p354n3.C23528a;
import p716zh.C31900e7;
import p716zh.C32006l8;

/* renamed from: com.zing.zalo.adapters.k5 */
/* loaded from: classes3.dex */
public class C7118k5 extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    Context f38929r;

    /* renamed from: s */
    int f38930s;

    /* renamed from: t */
    int f38931t;

    /* renamed from: u */
    List f38932u;

    /* renamed from: w */
    c f38934w;

    /* renamed from: x */
    C23528a f38935x;

    /* renamed from: v */
    boolean f38933v = false;

    /* renamed from: y */
    public boolean f38936y = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.adapters.k5$a */
    /* loaded from: classes3.dex */
    public class a implements ProfileCardView.InterfaceC14801d {
        a() {
        }

        @Override // com.zing.zalo.p077ui.zviews.ProfileCardView.InterfaceC14801d
        /* renamed from: I3 */
        public void mo36283I3(C32006l8 c32006l8) {
            c cVar = C7118k5.this.f38934w;
            if (cVar != null) {
                cVar.mo36290I3(c32006l8);
            }
        }

        @Override // com.zing.zalo.p077ui.zviews.ProfileCardView.InterfaceC14801d
        /* renamed from: a */
        public void mo36284a(C32006l8 c32006l8) {
            c cVar = C7118k5.this.f38934w;
            if (cVar != null) {
                cVar.mo36297uC(c32006l8);
            }
        }

        @Override // com.zing.zalo.p077ui.zviews.ProfileCardView.InterfaceC14801d
        /* renamed from: b */
        public void mo36285b(C32006l8 c32006l8) {
            c cVar = C7118k5.this.f38934w;
            if (cVar != null) {
                cVar.mo36292Lj(c32006l8);
            }
        }

        @Override // com.zing.zalo.p077ui.zviews.ProfileCardView.InterfaceC14801d
        /* renamed from: c */
        public void mo36286c(View view, List list, int i11, AnimationTarget animationTarget) {
            C7118k5.this.m36281W(view, list, i11, animationTarget);
        }

        @Override // com.zing.zalo.p077ui.zviews.ProfileCardView.InterfaceC14801d
        /* renamed from: d */
        public void mo36287d(C32006l8 c32006l8, int i11) {
            c cVar = C7118k5.this.f38934w;
            if (cVar != null) {
                cVar.mo36291J7(c32006l8, i11);
            }
        }

        @Override // com.zing.zalo.p077ui.zviews.ProfileCardView.InterfaceC14801d
        /* renamed from: d3 */
        public void mo36288d3(int i11) {
            c cVar = C7118k5.this.f38934w;
            if (cVar != null) {
                cVar.mo36293d3(i11);
            }
        }

        @Override // com.zing.zalo.p077ui.zviews.ProfileCardView.InterfaceC14801d
        /* renamed from: t4 */
        public void mo36289t4(C32006l8 c32006l8) {
            C7118k5.this.m36282X(c32006l8);
            c cVar = C7118k5.this.f38934w;
            if (cVar != null) {
                cVar.mo36296t4(c32006l8);
            }
        }
    }

    /* renamed from: com.zing.zalo.adapters.k5$b */
    /* loaded from: classes3.dex */
    public static class b extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        public ProfileCardView f38938I;

        /* renamed from: J */
        public ProfileCardLoadingError f38939J;

        public b(View view, int i11) {
            super(view);
            if (i11 != 1) {
                if (i11 == 2 || i11 == 3) {
                    this.f38939J = (ProfileCardLoadingError) view;
                    return;
                }
                return;
            }
            this.f38938I = (ProfileCardView) view;
        }
    }

    /* renamed from: com.zing.zalo.adapters.k5$c */
    /* loaded from: classes3.dex */
    public interface c {
        /* renamed from: I3 */
        void mo36290I3(C32006l8 c32006l8);

        /* renamed from: J7 */
        void mo36291J7(C32006l8 c32006l8, int i11);

        /* renamed from: Lj */
        void mo36292Lj(C32006l8 c32006l8);

        /* renamed from: d3 */
        void mo36293d3(int i11);

        /* renamed from: nw */
        void mo36294nw(View view, C23528a c23528a, String str, Bundle bundle, int i11, int i12, AnimationTarget animationTarget);

        /* renamed from: sH */
        void mo36295sH();

        /* renamed from: t4 */
        void mo36296t4(C32006l8 c32006l8);

        /* renamed from: uC */
        void mo36297uC(C32006l8 c32006l8);
    }

    public C7118k5(Context context, int i11, int i12) {
        this.f38929r = context;
        this.f38930s = i11;
        this.f38931t = i12;
        this.f38935x = new C23528a(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public /* synthetic */ void m36271O() {
        c cVar = this.f38934w;
        if (cVar != null) {
            cVar.mo36295sH();
        }
    }

    /* renamed from: M */
    List m36272M(List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C31900e7(0, (C32006l8) it.next()));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return arrayList;
    }

    /* renamed from: N */
    public C31900e7 m36273N(int i11) {
        List list = this.f38932u;
        if (list != null && i11 >= 0 && i11 < list.size()) {
            return (C31900e7) this.f38932u.get(i11);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo9990A(b bVar, int i11) {
        try {
            C31900e7 m36273N = m36273N(i11);
            if (m36273N != null) {
                int m9931C = bVar.m9931C();
                if (m9931C != 1) {
                    if (m9931C != 2) {
                        if (m9931C == 3) {
                            bVar.f38939J.setState(1);
                            bVar.f38939J.setProfileCardErrorListener(new ProfileCardLoadingError.InterfaceC14797b() { // from class: com.zing.zalo.adapters.j5
                                @Override // com.zing.zalo.p077ui.zviews.ProfileCardLoadingError.InterfaceC14797b
                                /* renamed from: a */
                                public final void mo36200a() {
                                    C7118k5.this.m36271O();
                                }
                            });
                        }
                    } else {
                        bVar.f38939J.setState(0);
                    }
                } else {
                    ProfileCardView profileCardView = bVar.f38938I;
                    profileCardView.m83015A(m36273N.f146548b, this.f38933v);
                    profileCardView.setListener(new a());
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public b mo9992C(ViewGroup viewGroup, int i11) {
        View profileCardView;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    profileCardView = null;
                } else {
                    profileCardView = new ProfileCardLoadingError(this.f38929r, this.f38930s, this.f38931t);
                }
            } else {
                profileCardView = new ProfileCardLoadingError(this.f38929r, this.f38930s, this.f38931t);
            }
        } else {
            profileCardView = new ProfileCardView(this.f38929r, this.f38930s, this.f38931t);
        }
        return new b(profileCardView, i11);
    }

    /* renamed from: R */
    public void m36276R(List list) {
        this.f38932u = m36272M(list);
    }

    /* renamed from: S */
    public void m36277S(c cVar) {
        this.f38934w = cVar;
    }

    /* renamed from: T */
    public void m36278T(boolean z11) {
        this.f38933v = z11;
    }

    /* renamed from: U */
    public void m36279U(boolean z11) {
        try {
            List list = this.f38932u;
            if (list != null && !list.isEmpty()) {
                if (z11) {
                    Iterator it = this.f38932u.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((C31900e7) it.next()).f146547a == 2) {
                                break;
                            }
                        } else {
                            this.f38932u.add(new C31900e7(2, null));
                            break;
                        }
                    }
                } else {
                    int mo10003k = mo10003k();
                    int i11 = 0;
                    while (true) {
                        if (i11 < mo10003k) {
                            if (((C31900e7) this.f38932u.get(i11)).f146547a == 2) {
                                break;
                            } else {
                                i11++;
                            }
                        } else {
                            i11 = -1;
                            break;
                        }
                    }
                    if (i11 != -1) {
                        this.f38932u.remove(i11);
                    }
                }
                this.f38936y = z11;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: V */
    public void m36280V(boolean z11) {
        try {
            List list = this.f38932u;
            if (list != null && !list.isEmpty()) {
                if (z11) {
                    Iterator it = this.f38932u.iterator();
                    while (it.hasNext()) {
                        if (((C31900e7) it.next()).f146547a == 1) {
                            return;
                        }
                    }
                    this.f38932u.add(new C31900e7(1, null));
                    return;
                }
                int mo10003k = mo10003k();
                int i11 = 0;
                while (true) {
                    if (i11 < mo10003k) {
                        if (((C31900e7) this.f38932u.get(i11)).f146547a == 1) {
                            break;
                        } else {
                            i11++;
                        }
                    } else {
                        i11 = -1;
                        break;
                    }
                }
                if (i11 != -1) {
                    this.f38932u.remove(i11);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: W */
    void m36281W(View view, List list, int i11, AnimationTarget animationTarget) {
        try {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            for (int i12 = 0; i12 < list.size(); i12++) {
                arrayList.add(new ItemAlbumMobile((ItemAlbumMobile) list.get(i12)));
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("medialist", arrayList);
            bundle.putInt("currentIndex", i11);
            bundle.putBoolean("showLimitMenu", true);
            bundle.putBoolean("hideImageFunction", false);
            bundle.putInt("EXTRA_INT_SUB_TITLE_MODE", 2);
            bundle.putInt("EXTRA_INT_IMAGE_VIEWER_TYPE", 4);
            c cVar = this.f38934w;
            if (cVar != null) {
                cVar.mo36294nw(view, this.f38935x, ((ItemAlbumMobile) list.get(i11)).m40504N(), bundle, i11, 0, animationTarget);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: X */
    void m36282X(C32006l8 c32006l8) {
        try {
            List list = this.f38932u;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C32006l8 c32006l82 = ((C31900e7) it.next()).f146548b;
                    if (c32006l82 != null && c32006l82.f147278e.equals(c32006l8.f147278e)) {
                        AbstractC23144m6.m118823d(c32006l82, c32006l8);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        List list = this.f38932u;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        C31900e7 m36273N;
        if (this.f38932u != null && (m36273N = m36273N(i11)) != null) {
            int i12 = m36273N.f146547a;
            if (i12 == 0) {
                return 1;
            }
            if (i12 != 1) {
                if (i12 == 2) {
                    return 3;
                }
            } else {
                return 2;
            }
        }
        return 0;
    }
}
