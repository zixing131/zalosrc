package com.zing.zalo.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.adapters.C7145n;
import com.zing.zalo.p077ui.moduleview.privacy.PrivacyRowModuleView;
import com.zing.zalo.uidrawing.C16719g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd0.C21693c;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p262jb.AbstractC21196a;

/* renamed from: com.zing.zalo.adapters.x0 */
/* loaded from: classes3.dex */
public class C7256x0 extends BaseExpandableListAdapter {

    /* renamed from: a */
    List f39809a = new ArrayList();

    /* renamed from: b */
    LayoutInflater f39810b;

    /* renamed from: c */
    Context f39811c;

    /* renamed from: d */
    final int f39812d;

    /* renamed from: e */
    final int f39813e;

    /* renamed from: f */
    C7145n.a f39814f;

    /* renamed from: g */
    a f39815g;

    /* renamed from: com.zing.zalo.adapters.x0$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        void mo37014a(int i11);
    }

    /* renamed from: com.zing.zalo.adapters.x0$b */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: b */
        public final int f39817b;

        /* renamed from: c */
        public final int f39818c;

        /* renamed from: d */
        public String f39819d;

        /* renamed from: e */
        public String f39820e;

        /* renamed from: m */
        public int f39828m;

        /* renamed from: f */
        public boolean f39821f = true;

        /* renamed from: g */
        public boolean f39822g = false;

        /* renamed from: h */
        public boolean f39823h = false;

        /* renamed from: i */
        public boolean f39824i = false;

        /* renamed from: j */
        public boolean f39825j = false;

        /* renamed from: k */
        public boolean f39826k = true;

        /* renamed from: l */
        public boolean f39827l = false;

        /* renamed from: a */
        public List f39816a = new ArrayList();

        public b(int i11, int i12, String str, String str2) {
            this.f39817b = i11;
            this.f39818c = i12;
            this.f39819d = str;
            this.f39820e = str2;
        }

        /* renamed from: a */
        public static b m37015a(List list, int i11) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    b bVar = (b) it.next();
                    List list2 = bVar.f39816a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (b bVar2 : bVar.f39816a) {
                            int i12 = bVar2.f39818c;
                            if (i12 == i11 && i12 != -1) {
                                bVar.f39823h = true;
                                return bVar2;
                            }
                        }
                    } else {
                        int i13 = bVar.f39818c;
                        if (i13 == i11 && i13 != -1) {
                            return bVar;
                        }
                    }
                }
                return null;
            } catch (Exception e11) {
                e11.printStackTrace();
                return null;
            }
        }
    }

    /* renamed from: com.zing.zalo.adapters.x0$c */
    /* loaded from: classes3.dex */
    public static class c {

        /* renamed from: a */
        public PrivacyRowModuleView f39829a;
    }

    /* renamed from: com.zing.zalo.adapters.x0$d */
    /* loaded from: classes3.dex */
    public static class d {

        /* renamed from: a */
        public PrivacyRowModuleView f39830a;
    }

    public C7256x0(Context context, C7145n.a aVar, a aVar2) {
        this.f39811c = context;
        this.f39810b = LayoutInflater.from(context);
        this.f39814f = aVar;
        this.f39815g = aVar2;
        this.f39812d = C23212s8.m119607o(this.f39811c, AbstractC21196a.TextColor1);
        this.f39813e = C23212s8.m119607o(this.f39811c, AbstractC21196a.TextColor2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m37010d(b bVar, View view) {
        int i11;
        try {
            C7145n.a aVar = this.f39814f;
            if (aVar != null && (i11 = bVar.f39818c) != -1) {
                aVar.mo36357a(i11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m37011e(b bVar, C16719g c16719g) {
        try {
            C7145n.a aVar = this.f39814f;
            if (aVar != null) {
                aVar.mo36359c(bVar.f39818c);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m37012f(b bVar, int i11, View view) {
        try {
            int i12 = bVar.f39818c;
            if (i12 == -1) {
                a aVar = this.f39815g;
                if (aVar != null) {
                    aVar.mo37014a(i11);
                }
            } else {
                C7145n.a aVar2 = this.f39814f;
                if (aVar2 != null) {
                    aVar2.mo36357a(i12);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: g */
    public void m37013g(List list) {
        if (list != null) {
            try {
                this.f39809a = new ArrayList(list);
                notifyDataSetChanged();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // android.widget.ExpandableListAdapter
    public Object getChild(int i11, int i12) {
        List list = this.f39809a;
        if (list != null && ((b) list.get(i11)).f39816a != null) {
            return ((b) this.f39809a.get(i11)).f39816a.get(i12);
        }
        return null;
    }

    @Override // android.widget.ExpandableListAdapter
    public long getChildId(int i11, int i12) {
        return 0L;
    }

    @Override // android.widget.BaseExpandableListAdapter, android.widget.HeterogeneousExpandableList
    public int getChildType(int i11, int i12) {
        List list = this.f39809a;
        if (list != null && ((b) list.get(i11)).f39816a != null) {
            return ((b) ((b) this.f39809a.get(i11)).f39816a.get(i12)).f39817b;
        }
        return 0;
    }

    @Override // android.widget.BaseExpandableListAdapter, android.widget.HeterogeneousExpandableList
    public int getChildTypeCount() {
        return 2;
    }

    @Override // android.widget.ExpandableListAdapter
    public View getChildView(int i11, int i12, boolean z11, View view, ViewGroup viewGroup) {
        c cVar;
        int i13;
        int i14;
        int i15;
        int i16;
        try {
            final b bVar = (b) ((b) this.f39809a.get(i11)).f39816a.get(i12);
            if (getChildType(i11, i12) == 1) {
                if (view == null) {
                    view = this.f39810b.inflate(AbstractC7409c0.privacy_menu_popup_item_post_feed, (ViewGroup) null);
                    cVar = new c();
                    if (view instanceof PrivacyRowModuleView) {
                        cVar.f39829a = (PrivacyRowModuleView) view;
                    }
                    view.setTag(cVar);
                } else {
                    cVar = (c) view.getTag();
                }
                view.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.v0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        C7256x0.this.m37010d(bVar, view2);
                    }
                });
                int i17 = 0;
                view.setPadding(AbstractC23136l9.m118712h(this.f39811c, 36.0f), 0, 0, 0);
                cVar.f39829a.f65076N.m111959G1(bVar.f39819d);
                cVar.f39829a.f65076N.m111962J1(this.f39812d);
                cVar.f39829a.f65077O.m111959G1(bVar.f39820e);
                cVar.f39829a.f65077O.m111962J1(this.f39813e);
                C21693c c21693c = cVar.f39829a.f65079Q;
                if (bVar.f39822g) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
                c21693c.mo44614b1(i13);
                C21693c c21693c2 = cVar.f39829a.f65074L;
                if (bVar.f39823h) {
                    i14 = AbstractC16803z.btn_radio_on_holo_light;
                } else {
                    i14 = AbstractC16803z.btn_radio_off_holo_light;
                }
                c21693c2.mo111926w1(i14);
                C21693c c21693c3 = cVar.f39829a.f65074L;
                if (bVar.f39826k) {
                    i15 = 0;
                } else {
                    i15 = 8;
                }
                c21693c3.mo44614b1(i15);
                C21693c c21693c4 = cVar.f39829a.f65078P;
                if (bVar.f39824i) {
                    i16 = 0;
                } else {
                    i16 = 8;
                }
                c21693c4.mo44614b1(i16);
                cVar.f39829a.f65078P.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.adapters.w0
                    @Override // com.zing.zalo.uidrawing.C16719g.c
                    /* renamed from: y */
                    public final void mo929y(C16719g c16719g) {
                        C7256x0.this.m37011e(bVar, c16719g);
                    }
                });
                C16719g c16719g = cVar.f39829a.f65073K;
                if (!bVar.f39821f) {
                    i17 = 8;
                }
                c16719g.mo44614b1(i17);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return view;
    }

    @Override // android.widget.ExpandableListAdapter
    public int getChildrenCount(int i11) {
        List list = this.f39809a;
        if (list != null && ((b) list.get(i11)).f39816a != null) {
            return ((b) this.f39809a.get(i11)).f39816a.size();
        }
        return 0;
    }

    @Override // android.widget.ExpandableListAdapter
    public Object getGroup(int i11) {
        List list = this.f39809a;
        if (list != null) {
            return list.get(i11);
        }
        return null;
    }

    @Override // android.widget.ExpandableListAdapter
    public int getGroupCount() {
        List list = this.f39809a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.ExpandableListAdapter
    public long getGroupId(int i11) {
        return 0L;
    }

    @Override // android.widget.BaseExpandableListAdapter, android.widget.HeterogeneousExpandableList
    public int getGroupType(int i11) {
        List list = this.f39809a;
        if (list != null) {
            return ((b) list.get(i11)).f39817b;
        }
        return 0;
    }

    @Override // android.widget.BaseExpandableListAdapter, android.widget.HeterogeneousExpandableList
    public int getGroupTypeCount() {
        return 2;
    }

    @Override // android.widget.ExpandableListAdapter
    public View getGroupView(final int i11, boolean z11, View view, ViewGroup viewGroup) {
        d dVar;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        try {
            final b bVar = (b) this.f39809a.get(i11);
            if (getGroupType(i11) == 1) {
                if (view == null) {
                    view = this.f39810b.inflate(AbstractC7409c0.privacy_menu_popup_item_post_feed, (ViewGroup) null);
                    dVar = new d();
                    if (view instanceof PrivacyRowModuleView) {
                        dVar.f39830a = (PrivacyRowModuleView) view;
                    }
                    view.setTag(dVar);
                } else {
                    dVar = (d) view.getTag();
                }
                view.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.u0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        C7256x0.this.m37012f(bVar, i11, view2);
                    }
                });
                dVar.f39830a.f65076N.m111959G1(bVar.f39819d);
                dVar.f39830a.f65076N.m111962J1(this.f39812d);
                dVar.f39830a.f65077O.m111959G1(bVar.f39820e);
                dVar.f39830a.f65077O.m111962J1(this.f39813e);
                if (bVar.f39825j) {
                    C21693c c21693c = dVar.f39830a.f65079Q;
                    if (z11) {
                        i18 = AbstractC16803z.ic_group_privacy_up;
                    } else {
                        i18 = AbstractC16803z.ic_group_privacy_down;
                    }
                    c21693c.mo111926w1(i18);
                } else {
                    dVar.f39830a.f65079Q.mo111926w1(AbstractC16803z.icn_profile_postfeed_arrow);
                }
                C21693c c21693c2 = dVar.f39830a.f65079Q;
                int i19 = 8;
                if (bVar.f39822g) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                c21693c2.mo44614b1(i12);
                C21693c c21693c3 = dVar.f39830a.f65074L;
                if (bVar.f39823h) {
                    i13 = AbstractC16803z.btn_radio_on_holo_light;
                } else {
                    i13 = AbstractC16803z.btn_radio_off_holo_light;
                }
                c21693c3.mo111926w1(i13);
                C21693c c21693c4 = dVar.f39830a.f65074L;
                int i21 = 4;
                if (bVar.f39826k) {
                    i14 = 0;
                } else {
                    i14 = 4;
                }
                c21693c4.mo44614b1(i14);
                if (bVar.f39826k && bVar.f39825j) {
                    C21693c c21693c5 = dVar.f39830a.f65074L;
                    if (!z11) {
                        i21 = 0;
                    }
                    c21693c5.mo44614b1(i21);
                    C21693c c21693c6 = dVar.f39830a.f65079Q;
                    if (z11) {
                        i17 = 8;
                    } else {
                        i17 = 0;
                    }
                    c21693c6.mo44614b1(i17);
                }
                C21693c c21693c7 = dVar.f39830a.f65078P;
                if (bVar.f39824i) {
                    i15 = 0;
                } else {
                    i15 = 8;
                }
                c21693c7.mo44614b1(i15);
                C16719g c16719g = dVar.f39830a.f65073K;
                if (bVar.f39821f) {
                    i16 = 0;
                } else {
                    i16 = 8;
                }
                c16719g.mo44614b1(i16);
                C21693c c21693c8 = dVar.f39830a.f65075M;
                if (c21693c8 != null) {
                    if (bVar.f39827l) {
                        i19 = 0;
                    }
                    c21693c8.mo44614b1(i19);
                    dVar.f39830a.f65075M.mo111926w1(bVar.f39828m);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return view;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean isChildSelectable(int i11, int i12) {
        return true;
    }
}
