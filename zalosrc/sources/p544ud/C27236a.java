package p544ud;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.zing.p058v4.view.AbstractC6881a;
import com.zing.zalo.birthdayhub.view.widget.CalendarMonthModuleView;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import me0.AbstractC23160o0;
import p480rd.C25730a;

/* renamed from: ud.a */
/* loaded from: classes3.dex */
public final class C27236a extends AbstractC6881a {

    /* renamed from: r */
    private Context f128002r;

    /* renamed from: s */
    private a f128003s;

    /* renamed from: t */
    private final HashMap f128004t;

    /* renamed from: u */
    private Stack f128005u;

    /* renamed from: v */
    private CalendarMonthModuleView.InterfaceC7388b f128006v;

    /* renamed from: w */
    private final List f128007w;

    /* renamed from: x */
    private boolean f128008x;

    /* renamed from: y */
    private boolean f128009y;

    /* renamed from: ud.a$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        void mo37500a();
    }

    public C27236a(Context context, a aVar) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(aVar, "delegate");
        this.f128002r = context;
        this.f128003s = aVar;
        this.f128004t = new HashMap();
        this.f128005u = new Stack();
        this.f128007w = new ArrayList();
        this.f128009y = true;
    }

    /* renamed from: A */
    public final void m139350A(List list) {
        AbstractC19074t.m100208f(list, "listData");
        this.f128007w.clear();
        this.f128007w.addAll(list);
    }

    /* renamed from: B */
    public final void m139351B(CalendarMonthModuleView.InterfaceC7388b interfaceC7388b) {
        this.f128006v = interfaceC7388b;
    }

    /* renamed from: C */
    public final void m139352C(boolean z11) {
        this.f128008x = z11;
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: d */
    public void mo35332d(ViewGroup viewGroup, int i11, Object obj) {
        View view;
        AbstractC19074t.m100208f(viewGroup, "container");
        AbstractC19074t.m100208f(obj, "object");
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            view = null;
        }
        viewGroup.removeView(view);
        CalendarMonthModuleView calendarMonthModuleView = (CalendarMonthModuleView) this.f128004t.get(Integer.valueOf(i11));
        if (calendarMonthModuleView != null) {
        }
        this.f128004t.remove(Integer.valueOf(i11));
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: g */
    public int mo35335g() {
        return this.f128007w.size();
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: k */
    public Object mo35339k(ViewGroup viewGroup, int i11) {
        CalendarMonthModuleView calendarMonthModuleView;
        AbstractC19074t.m100208f(viewGroup, "container");
        if (!this.f128008x) {
            return new Object();
        }
        if (!this.f128005u.empty()) {
            calendarMonthModuleView = (CalendarMonthModuleView) this.f128005u.pop();
        } else {
            calendarMonthModuleView = null;
        }
        if (calendarMonthModuleView == null) {
            calendarMonthModuleView = new CalendarMonthModuleView(this.f128002r, null, 2, null);
        }
        calendarMonthModuleView.m37519W((C25730a) this.f128007w.get(i11));
        calendarMonthModuleView.setOnDayClickListener(this.f128006v);
        viewGroup.addView(calendarMonthModuleView);
        this.f128004t.put(Integer.valueOf(i11), calendarMonthModuleView);
        if (this.f128009y) {
            this.f128009y = false;
            this.f128003s.mo37500a();
        }
        return calendarMonthModuleView;
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: l */
    public boolean mo35340l(View view, Object obj) {
        AbstractC19074t.m100208f(view, "view");
        AbstractC19074t.m100208f(obj, "object");
        return view == obj;
    }

    /* renamed from: w */
    public final Stack m139353w() {
        return this.f128005u;
    }

    /* renamed from: x */
    public final C25730a m139354x(int i11) {
        return (C25730a) this.f128007w.get(i11);
    }

    /* renamed from: y */
    public final HashMap m139355y() {
        return this.f128004t;
    }

    /* renamed from: z */
    public final int m139356z(Calendar calendar) {
        int size = this.f128007w.size();
        for (int i11 = 0; i11 < size; i11++) {
            Calendar m132822a = ((C25730a) this.f128007w.get(i11)).m132822a();
            if (calendar != null && AbstractC23160o0.m119238b1(calendar, m132822a)) {
                return i11;
            }
        }
        return -1;
    }
}
