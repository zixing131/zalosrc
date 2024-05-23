package com.zing.zalo.adapters;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.p058v4.view.AbstractC6881a;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.EventAttendeeDetailRercyclerAdapter;
import com.zing.zalo.p077ui.widget.PagerSlidingTabStrip;
import ge.C19417i;
import java.util.ArrayList;
import java.util.Objects;
import me0.AbstractC23136l9;
import me0.AbstractC23184q2;
import vg.C28203u6;
import zl0.AbstractC32232i;

/* renamed from: com.zing.zalo.adapters.q0 */
/* loaded from: classes3.dex */
public class C7179q0 extends AbstractC6881a implements PagerSlidingTabStrip.InterfaceC13514b {

    /* renamed from: r */
    Context f39295r;

    /* renamed from: s */
    LayoutInflater f39296s;

    /* renamed from: t */
    ArrayList f39297t;

    /* renamed from: u */
    EventAttendeeDetailRercyclerAdapter.EventAttendeeDetailItemView.InterfaceC6924b f39298u;

    /* renamed from: com.zing.zalo.adapters.q0$a */
    /* loaded from: classes3.dex */
    class a extends RecyclerView.AbstractC1887n {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            if (c1899z.m10253b() <= 2) {
                rect.set(0, AbstractC32232i.m155453a(16.0f), 0, AbstractC32232i.m155453a(6.0f));
                return;
            }
            int m9817A0 = recyclerView.m9817A0(view);
            if (m9817A0 != 0 && m9817A0 != 1) {
                rect.set(0, AbstractC32232i.m155453a(0.0f), 0, AbstractC32232i.m155453a(16.0f));
            } else {
                rect.set(0, AbstractC32232i.m155453a(16.0f), 0, AbstractC32232i.m155453a(16.0f));
            }
        }
    }

    /* renamed from: com.zing.zalo.adapters.q0$b */
    /* loaded from: classes3.dex */
    class b extends RecyclerView.AbstractC1892s {

        /* renamed from: a */
        int f39300a = 0;

        /* renamed from: b */
        int f39301b = 20;

        /* renamed from: c */
        final /* synthetic */ LinearLayoutManager f39302c;

        /* renamed from: d */
        final /* synthetic */ C19417i f39303d;

        /* renamed from: e */
        final /* synthetic */ EventAttendeeDetailRercyclerAdapter f39304e;

        b(LinearLayoutManager linearLayoutManager, C19417i c19417i, EventAttendeeDetailRercyclerAdapter eventAttendeeDetailRercyclerAdapter) {
            this.f39302c = linearLayoutManager;
            this.f39303d = c19417i;
            this.f39304e = eventAttendeeDetailRercyclerAdapter;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            super.mo952b(recyclerView, i11);
            if (i11 != 2) {
                int m9740Y1 = this.f39302c.m9740Y1();
                int m9745c2 = this.f39302c.m9745c2();
                int i12 = 0;
                if (Math.max(m9740Y1 - 5, 0) < this.f39300a || Math.min(m9745c2 + 5, this.f39303d.f96340c.size() - 1) > this.f39301b) {
                    int i13 = m9740Y1 - 20;
                    int i14 = m9745c2 + 20;
                    if (i13 >= 0) {
                        i12 = i13;
                    }
                    if (i14 > this.f39303d.f96340c.size() - 1) {
                        i14 = this.f39303d.f96340c.size() - 1;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (int i15 = i12; i15 <= i14; i15++) {
                        String str = (String) this.f39303d.f96340c.get(i15);
                        if (C28203u6.f131407a.m141809c(str) == null) {
                            arrayList.add(str);
                        }
                    }
                    if (arrayList.size() > 0) {
                        EventAttendeeDetailRercyclerAdapter eventAttendeeDetailRercyclerAdapter = this.f39304e;
                        Objects.requireNonNull(eventAttendeeDetailRercyclerAdapter);
                        AbstractC23184q2.m119463u(arrayList, new RunnableC7168p0(eventAttendeeDetailRercyclerAdapter));
                    }
                    this.f39300a = i12;
                    this.f39301b = i14;
                }
            }
        }
    }

    public C7179q0(Context context, ArrayList arrayList, EventAttendeeDetailRercyclerAdapter.EventAttendeeDetailItemView.InterfaceC6924b interfaceC6924b) {
        this.f39295r = context;
        this.f39297t = arrayList;
        this.f39298u = interfaceC6924b;
        this.f39296s = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // com.zing.zalo.p077ui.widget.PagerSlidingTabStrip.InterfaceC13514b
    /* renamed from: b */
    public View mo36134b(int i11) {
        String m118743r0;
        C19417i m36477w = m36477w(i11);
        if (m36477w == null) {
            return null;
        }
        int i12 = m36477w.f96338a;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    m118743r0 = "";
                } else {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_attend_event_decline);
                }
            } else {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_attend_event_accept);
            }
        } else {
            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_attend_event_not_response);
        }
        View inflate = this.f39296s.inflate(AbstractC7409c0.event_attendee_detail_header, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(AbstractC6918a0.tv_option);
        TextView textView2 = (TextView) inflate.findViewById(AbstractC6918a0.tv_num_attendee);
        textView.setText(m118743r0);
        textView2.setText(m36477w.f96339b + "");
        return inflate;
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: d */
    public void mo35332d(ViewGroup viewGroup, int i11, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: g */
    public int mo35335g() {
        return this.f39297t.size();
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: k */
    public Object mo35339k(ViewGroup viewGroup, int i11) {
        LinearLayoutManager linearLayoutManager;
        C19417i m36477w = m36477w(i11);
        if (m36477w == null) {
            return null;
        }
        ArrayList arrayList = m36477w.f96340c;
        if (arrayList != null && arrayList.size() != 0) {
            RecyclerView recyclerView = new RecyclerView(this.f39295r);
            if (m36477w.f96340c.size() > 1) {
                linearLayoutManager = new GridLayoutManager(this.f39295r, 2);
            } else {
                linearLayoutManager = new LinearLayoutManager(this.f39295r, 1, false);
            }
            recyclerView.setLayoutManager(linearLayoutManager);
            recyclerView.m9816A(new a());
            EventAttendeeDetailRercyclerAdapter eventAttendeeDetailRercyclerAdapter = new EventAttendeeDetailRercyclerAdapter(this.f39295r, m36477w.f96340c, this.f39298u);
            recyclerView.setAdapter(eventAttendeeDetailRercyclerAdapter);
            recyclerView.m9826E(new b(linearLayoutManager, m36477w, eventAttendeeDetailRercyclerAdapter));
            int min = Math.min(20, m36477w.f96340c.size() - 1);
            ArrayList arrayList2 = new ArrayList();
            for (int i12 = 0; i12 <= min; i12++) {
                String str = (String) m36477w.f96340c.get(i12);
                if (C28203u6.f131407a.m141809c(str) == null) {
                    arrayList2.add(str);
                }
            }
            if (arrayList2.size() > 0) {
                AbstractC23184q2.m119463u(arrayList2, new RunnableC7168p0(eventAttendeeDetailRercyclerAdapter));
            }
            viewGroup.addView(recyclerView);
            return recyclerView;
        }
        View inflate = this.f39296s.inflate(AbstractC7409c0.blank_view_attend, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(AbstractC6918a0.text_no_vote);
        if (textView != null) {
            if (m36477w.f96338a == 0) {
                textView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_blank_noone_no_response_yet_text));
            } else {
                textView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_blank_no_response_text));
            }
        }
        viewGroup.addView(inflate);
        return inflate;
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: l */
    public boolean mo35340l(View view, Object obj) {
        return view == obj;
    }

    /* renamed from: w */
    public C19417i m36477w(int i11) {
        if (i11 < this.f39297t.size()) {
            return (C19417i) this.f39297t.get(i11);
        }
        return null;
    }
}
