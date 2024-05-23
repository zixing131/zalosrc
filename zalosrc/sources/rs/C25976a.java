package rs;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.p077ui.moduleview.group.ContentFirstPanelModuleView;
import com.zing.zalo.p077ui.moduleview.group.GroupInCommonModuleView;
import com.zing.zalo.p077ui.moduleview.group.GroupInvitationBoxModuleView;
import com.zing.zalo.p077ui.moduleview.group.GroupLabelWithActionModuleView;
import com.zing.zalo.p077ui.moduleview.group.GroupSuggestItemModuleView;
import com.zing.zalo.p077ui.moduleview.group.StatementSuggestCreateGroupModuleView;
import com.zing.zalo.p077ui.moduleview.group.TabHeaderModuleView;
import com.zing.zalo.p077ui.moduleview.message.GroupInviteItemModuleView;
import com.zing.zalo.p077ui.moduleview.message.GroupSuggestInviteItemModuleView;
import com.zing.zalo.p077ui.moduleview.message.InterfaceC12430a;
import com.zing.zalo.p077ui.moduleview.message.MsgItemInfoModulesView;
import com.zing.zalo.p077ui.moduleview.message.NormalGroupItemModuleView;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import p354n3.C23528a;
import p692ys.C31070a;
import p716zh.C31973j5;
import p716zh.C32020m7;

/* renamed from: rs.a */
/* loaded from: classes4.dex */
public class C25976a extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    List f123934r = new ArrayList();

    /* renamed from: s */
    public boolean f123935s = false;

    /* renamed from: t */
    C23528a f123936t;

    /* renamed from: u */
    a f123937u;

    /* renamed from: rs.a$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: Gq */
        void mo67804Gq(String str, String str2);

        /* renamed from: Va */
        void mo67809Va(C31070a c31070a, String str, String str2, TrackingSource trackingSource);

        /* renamed from: tl */
        void mo67819tl(C31973j5 c31973j5);

        /* renamed from: uG */
        void mo67820uG(Rect rect);
    }

    /* renamed from: rs.a$b */
    /* loaded from: classes4.dex */
    public static class b extends d {

        /* renamed from: I */
        TextView f123938I;

        public b(View view) {
            super(view);
            TextView textView = (TextView) view.findViewById(AbstractC6918a0.num_friend);
            this.f123938I = textView;
            textView.setPadding(AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(0.0f), AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(50.0f));
        }
    }

    /* renamed from: rs.a$c */
    /* loaded from: classes4.dex */
    public static class c extends d {

        /* renamed from: I */
        MsgItemInfoModulesView f123939I;

        public c(MsgItemInfoModulesView msgItemInfoModulesView) {
            super(msgItemInfoModulesView);
            this.f123939I = msgItemInfoModulesView;
            if (msgItemInfoModulesView instanceof NormalGroupItemModuleView) {
                msgItemInfoModulesView.getRootView().setId(AbstractC6918a0.cel_contact_tab_group_cell);
            }
        }

        @Override // rs.C25976a.d, com.zing.zalo.p077ui.moduleview.message.InterfaceC12430a
        /* renamed from: w */
        public void mo35843w(C32020m7 c32020m7, int i11, boolean z11) {
            try {
                super.mo35843w(c32020m7, i11, z11);
                this.f123939I.mo35843w(c32020m7, i11, z11);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: rs.a$d */
    /* loaded from: classes4.dex */
    public static class d extends RecyclerView.AbstractC1876c0 implements InterfaceC12430a {
        public d(View view) {
            super(view);
        }

        /* renamed from: w */
        public void mo35843w(C32020m7 c32020m7, int i11, boolean z11) {
        }
    }

    public C25976a(C23528a c23528a, a aVar) {
        this.f123936t = c23528a;
        this.f123937u = aVar;
    }

    /* renamed from: L */
    public C32020m7 m133799L(int i11) {
        List list = this.f123934r;
        if (list != null && list.size() > i11) {
            return (C32020m7) this.f123934r.get(i11);
        }
        return null;
    }

    /* renamed from: M */
    public boolean m133800M() {
        return this.f123934r.isEmpty();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public void mo9990A(d dVar, int i11) {
        if (this.f123934r.size() > i11) {
            dVar.mo35843w((C32020m7) this.f123934r.get(i11), i11, this.f123935s);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public d mo9992C(ViewGroup viewGroup, int i11) {
        Context context = viewGroup.getContext();
        switch (i11) {
            case 1:
                return new c(new NormalGroupItemModuleView(context, this.f123936t));
            case 2:
                return new c(new GroupLabelWithActionModuleView(context, this.f123937u));
            case 3:
                return new c(new GroupSuggestItemModuleView(context, this.f123936t));
            case 4:
                return new c(new TabHeaderModuleView(context, this.f123936t));
            case 5:
                return new d(LayoutInflater.from(context).inflate(AbstractC7409c0.header_view_fake_subtab, viewGroup, false));
            case 6:
                return new c(new ContentFirstPanelModuleView(context, this.f123937u, this.f123936t));
            case 7:
                return new c(new StatementSuggestCreateGroupModuleView(context));
            case 8:
                return new c(new GroupInCommonModuleView(context));
            case 9:
                return new c(new GroupInviteItemModuleView(context, this.f123936t));
            case 10:
                return new b(LayoutInflater.from(context).inflate(AbstractC7409c0.count_num_friend_changable_height_view, viewGroup, false));
            case 11:
                return new c(new StatementSuggestCreateGroupModuleView(context));
            case 12:
                return new c(new GroupSuggestInviteItemModuleView(context, this.f123936t, this.f123937u));
            case 13:
                return new c(new GroupInvitationBoxModuleView(context, null));
            default:
                return new d(LayoutInflater.from(context).inflate(AbstractC7409c0.feed_item_unsupport, viewGroup, false));
        }
    }

    /* renamed from: P */
    public void m133803P(List list) {
        this.f123934r = new ArrayList(list);
        m10008p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f123934r.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: l */
    public long mo10004l(int i11) {
        if (!m10007o()) {
            return super.mo10004l(i11);
        }
        return i11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e A[RETURN] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int mo10005m(int i11) {
        C32020m7 m133799L = m133799L(i11);
        if (m133799L != null) {
            int i12 = m133799L.f147410a;
            if (i12 == 1) {
                return 1;
            }
            if (i12 != 6 && i12 != 7) {
                switch (i12) {
                    case 15:
                        return 3;
                    case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                    case 17:
                        return 4;
                    case 18:
                        return 5;
                    case 19:
                    case 20:
                        return 7;
                    case 21:
                        return 6;
                    default:
                        switch (i12) {
                            case 26:
                                break;
                            case 27:
                                return 8;
                            case 28:
                                return 9;
                            case 29:
                                return 10;
                            case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                                return 11;
                            case 31:
                                return 12;
                            case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                            case 33:
                                return 2;
                            default:
                                switch (i12) {
                                    case 35:
                                        return 13;
                                    case 36:
                                        return 4;
                                    case 37:
                                        return 2;
                                    default:
                                        return 0;
                                }
                        }
                }
            } else {
                return 2;
            }
        } else {
            return 0;
        }
    }
}
