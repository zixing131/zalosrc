package v20;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.p077ui.widget.GroupAvatarView;
import com.zing.zalo.social.controls.C10885x;
import com.zing.zalocore.CoreUtility;
import java.util.ArrayList;
import java.util.ListIterator;
import l30.AbstractC22055v0;
import mj0.AbstractC23322a;
import p461qu.AbstractC25495a;
import p691yr.C31060j;
import ui0.C27280g;
import vg.C28203u6;

/* renamed from: v20.j */
/* loaded from: classes5.dex */
public class C27482j extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    private ArrayList f129261r;

    /* renamed from: s */
    public LayoutInflater f129262s;

    /* renamed from: t */
    TrackingSource f129263t;

    /* renamed from: u */
    public boolean f129264u;

    /* renamed from: v */
    public boolean f129265v;

    /* renamed from: w */
    a f129266w;

    /* renamed from: v20.j$a */
    /* loaded from: classes5.dex */
    public interface a {
        /* renamed from: a */
        boolean mo42996a(String str);

        /* renamed from: b */
        void mo42997b();

        /* renamed from: c */
        void mo42998c(String str);

        /* renamed from: d */
        void mo42999d(String str, TrackingSource trackingSource);
    }

    /* renamed from: v20.j$b */
    /* loaded from: classes5.dex */
    public static class b extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        public GroupAvatarView f129267I;

        /* renamed from: J */
        public TextView f129268J;

        /* renamed from: K */
        public ImageView f129269K;

        /* renamed from: L */
        public AppCompatImageView f129270L;

        /* renamed from: M */
        public View f129271M;

        /* renamed from: N */
        public View f129272N;

        public b(View view, int i11) {
            super(view);
            m140569i0(view, i11);
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0045 -> B:10:0x0048). Please report as a decompilation issue!!! */
        /* renamed from: i0 */
        public void m140569i0(View view, int i11) {
            try {
                if (i11 != 0) {
                    if (i11 == 1 || i11 == 2) {
                        this.f129271M = view.findViewById(AbstractC6918a0.layoutFeedFooterLoading);
                        this.f129272N = view.findViewById(AbstractC6918a0.layoutFeedFooterError);
                    }
                } else {
                    this.f129267I = (GroupAvatarView) view.findViewById(AbstractC6918a0.likeContactAvatar);
                    this.f129268J = (TextView) view.findViewById(AbstractC6918a0.likeContactName);
                    this.f129269K = (ImageView) view.findViewById(AbstractC6918a0.ic_message);
                    this.f129270L = (AppCompatImageView) view.findViewById(AbstractC6918a0.likeContactReaction);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public C27482j(Context context) {
        this.f129262s = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public /* synthetic */ void m140559Q(C10885x c10885x, View view) {
        a aVar = this.f129266w;
        if (aVar != null) {
            aVar.mo42999d(c10885x.f54996b.m56333d(), this.f129263t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public /* synthetic */ void m140560R(C10885x c10885x, View view) {
        a aVar = this.f129266w;
        if (aVar != null && !aVar.mo42996a(c10885x.f54996b.m56333d())) {
            this.f129266w.mo42999d(c10885x.f54996b.m56333d(), this.f129263t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public /* synthetic */ void m140561S(C10885x c10885x, View view) {
        a aVar = this.f129266w;
        if (aVar != null) {
            aVar.mo42998c(c10885x.f54996b.m56333d());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public /* synthetic */ void m140562T(View view) {
        a aVar = this.f129266w;
        if (aVar != null) {
            aVar.mo42997b();
        }
    }

    /* renamed from: P */
    public C10885x m140563P(int i11) {
        ArrayList arrayList = this.f129261r;
        if (arrayList != null && i11 >= 0 && i11 < arrayList.size()) {
            return (C10885x) this.f129261r.get(i11);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public void mo9990A(b bVar, int i11) {
        boolean z11;
        int i12;
        final C10885x m140563P = m140563P(i11);
        if (m140563P == null) {
            return;
        }
        int mo10005m = mo10005m(i11);
        int i13 = 8;
        if (mo10005m != 0) {
            if (mo10005m != 1) {
                if (mo10005m == 2) {
                    bVar.f129272N.setVisibility(0);
                    bVar.f129271M.setVisibility(8);
                    bVar.f129272N.setOnClickListener(new View.OnClickListener() { // from class: v20.i
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C27482j.this.m140562T(view);
                        }
                    });
                    return;
                }
                return;
            }
            bVar.f129271M.setVisibility(0);
            bVar.f129272N.setVisibility(8);
            return;
        }
        bVar.f129267I.setImageResource(AbstractC16803z.default_avatar);
        bVar.f129267I.setUidForGenColor(m140563P.f54996b.m56333d());
        bVar.f129267I.setShortDpnAvt(m140563P.f54996b.m56331b());
        GroupAvatarView groupAvatarView = bVar.f129267I;
        groupAvatarView.setStrokeDisableColor(AbstractC22055v0.m115162v(groupAvatarView.getContext()));
        bVar.f129267I.setStateLoadingStory(AbstractC22055v0.m115112B(m140563P.f54996b.m56333d()));
        bVar.f129267I.m75736i(AbstractC22055v0.m115116F(m140563P.f54996b.m56333d(), false), AbstractC22055v0.m115115E(m140563P.f54996b.m56333d(), false));
        ContactProfile m141809c = C28203u6.f131407a.m141809c(m140563P.f54996b.m56333d());
        if (m141809c != null) {
            ContactProfile m40356w = ContactProfile.m40356w(m141809c);
            m40356w.f42446v = m140563P.f54996b.m56330a();
            bVar.f129267I.m75731c(m40356w);
        } else if (!TextUtils.isEmpty(m140563P.f54996b.m56330a())) {
            bVar.f129267I.m75732d(m140563P.f54996b.m56330a());
        }
        bVar.f129268J.setText(m140563P.f54996b.m56331b());
        if (!AbstractC25495a.m132077b(m140563P.f54996b.m56333d()) && !m140563P.f54996b.m56333d().equals("-1") && !m140563P.f54996b.m56333d().equals(CoreUtility.f89233i)) {
            z11 = true;
        } else {
            z11 = false;
        }
        ImageView imageView = bVar.f129269K;
        imageView.setBackground(C27280g.m139660c(imageView.getContext(), AbstractC23322a.zds_ic_chat_line_24, AbstractC2807a.icon_tertiary));
        ImageView imageView2 = bVar.f129269K;
        if (z11) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        imageView2.setVisibility(i12);
        bVar.f7784p.setOnClickListener(new View.OnClickListener() { // from class: v20.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C27482j.this.m140559Q(m140563P, view);
            }
        });
        bVar.f129267I.setOnClickListener(new View.OnClickListener() { // from class: v20.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C27482j.this.m140560R(m140563P, view);
            }
        });
        bVar.f129269K.setOnClickListener(new View.OnClickListener() { // from class: v20.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C27482j.this.m140561S(m140563P, view);
            }
        });
        boolean z12 = !AbstractC25495a.m132077b(m140563P.f54996b.m56333d());
        AppCompatImageView appCompatImageView = bVar.f129270L;
        if (z12) {
            i13 = 0;
        }
        appCompatImageView.setVisibility(i13);
        bVar.f129270L.setImageDrawable(C31060j.f143193a.m150928C(m140563P.f54996b.m56332c(), bVar.f129270L.getContext()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public b mo9992C(ViewGroup viewGroup, int i11) {
        LayoutInflater layoutInflater;
        View view = null;
        if (i11 != 0) {
            if ((i11 == 1 || i11 == 2) && (layoutInflater = this.f129262s) != null) {
                view = layoutInflater.inflate(AbstractC7409c0.footer_loading, viewGroup, false);
            }
        } else {
            LayoutInflater layoutInflater2 = this.f129262s;
            if (layoutInflater2 != null) {
                view = layoutInflater2.inflate(AbstractC7409c0.likecontact_row, (ViewGroup) null);
                view.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            }
        }
        return new b(view, i11);
    }

    /* renamed from: W */
    public void m140566W(a aVar) {
        this.f129266w = aVar;
    }

    /* renamed from: X */
    public void m140567X(boolean z11) {
        try {
            this.f129265v = z11;
            if (z11) {
                if (this.f129261r == null) {
                    this.f129261r = new ArrayList();
                }
                this.f129261r.add(new C10885x(2));
                m10011s(this.f129261r.size() - 1);
                return;
            }
            ArrayList arrayList = this.f129261r;
            if (arrayList != null) {
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (listIterator.hasPrevious()) {
                    if (((C10885x) listIterator.previous()).f54995a == 2) {
                        listIterator.remove();
                        m10017y(listIterator.previousIndex() + 1);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Y */
    public void m140568Y(boolean z11) {
        try {
            this.f129264u = z11;
            if (z11) {
                if (this.f129261r == null) {
                    this.f129261r = new ArrayList();
                }
                this.f129261r.add(new C10885x(1));
                m10011s(this.f129261r.size() - 1);
                return;
            }
            ArrayList arrayList = this.f129261r;
            if (arrayList != null) {
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (listIterator.hasPrevious()) {
                    if (((C10885x) listIterator.previous()).f54995a == 1) {
                        listIterator.remove();
                        m10017y(listIterator.previousIndex() + 1);
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
        ArrayList arrayList = this.f129261r;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000e, code lost:            if (r0 != 2) goto L14;     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int mo10005m(int i11) {
        C10885x m140563P = m140563P(i11);
        if (m140563P != null) {
            int i12 = m140563P.f54995a;
            if (i12 != 0) {
                int i13 = 1;
                if (i12 != 1) {
                    i13 = 2;
                }
                return i13;
            }
            return 0;
        }
        return super.mo10005m(i11);
    }
}
