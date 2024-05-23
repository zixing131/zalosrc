package p159fe;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.zing.p058v4.view.AbstractC6881a;
import com.zing.zalo.p077ui.moduleview.calendar.MonthModulesView;
import ge.C19413e;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import me0.AbstractC23160o0;

/* renamed from: fe.b */
/* loaded from: classes3.dex */
public class C18890b extends AbstractC6881a {

    /* renamed from: r */
    Context f94308r;

    /* renamed from: s */
    List f94309s;

    /* renamed from: v */
    public MonthModulesView.InterfaceC12405a f94312v;

    /* renamed from: w */
    public a f94313w;

    /* renamed from: t */
    public HashMap f94310t = new HashMap();

    /* renamed from: u */
    Stack f94311u = new Stack();

    /* renamed from: x */
    public boolean f94314x = false;

    /* renamed from: y */
    boolean f94315y = true;

    /* renamed from: fe.b$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        void mo87329a();
    }

    public C18890b(Context context, List list, a aVar) {
        this.f94308r = context;
        this.f94309s = list;
        this.f94313w = aVar;
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: d */
    public void mo35332d(ViewGroup viewGroup, int i11, Object obj) {
        viewGroup.removeView((View) obj);
        this.f94311u.push((MonthModulesView) this.f94310t.get(Integer.valueOf(i11)));
        this.f94310t.remove(Integer.valueOf(i11));
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: g */
    public int mo35335g() {
        return this.f94309s.size();
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: k */
    public Object mo35339k(ViewGroup viewGroup, int i11) {
        MonthModulesView monthModulesView = null;
        if (!this.f94314x) {
            return null;
        }
        if (!this.f94311u.empty()) {
            monthModulesView = (MonthModulesView) this.f94311u.pop();
        }
        if (monthModulesView == null) {
            monthModulesView = new MonthModulesView(this.f94308r);
        }
        monthModulesView.m69688W((C19413e) this.f94309s.get(i11));
        monthModulesView.f64516M = this.f94312v;
        viewGroup.addView(monthModulesView);
        this.f94310t.put(Integer.valueOf(i11), monthModulesView);
        if (this.f94315y) {
            this.f94315y = false;
            this.f94313w.mo87329a();
        }
        return monthModulesView;
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: l */
    public boolean mo35340l(View view, Object obj) {
        return view == obj;
    }

    /* renamed from: w */
    public C19413e m99044w(int i11) {
        return (C19413e) this.f94309s.get(i11);
    }

    /* renamed from: x */
    public int m99045x(Calendar calendar) {
        for (int i11 = 0; i11 < this.f94309s.size(); i11++) {
            Calendar calendar2 = ((C19413e) this.f94309s.get(i11)).f96321a;
            if (calendar != null && calendar2 != null && AbstractC23160o0.m119238b1(calendar, calendar2)) {
                return i11;
            }
        }
        return -1;
    }

    /* renamed from: y */
    public void m99046y(List list) {
        this.f94309s = list;
    }
}
