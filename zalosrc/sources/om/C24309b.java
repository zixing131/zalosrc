package om;

import android.content.Context;
import hh0.AbstractC20065c;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p366nm.C23881a;
import p366nm.C23882b;

/* renamed from: om.b */
/* loaded from: classes.dex */
public class C24309b extends AbstractC20065c {

    /* renamed from: c */
    private List f117388c;

    /* renamed from: d */
    private List f117389d;

    /* renamed from: e */
    private List f117390e;

    /* renamed from: f */
    private C23882b f117391f;

    public C24309b(Context context) {
        super(context);
        this.f117388c = new LinkedList();
        this.f117389d = new CopyOnWriteArrayList();
        this.f117390e = new CopyOnWriteArrayList();
        this.f117391f = new C23882b(context);
    }

    /* renamed from: f */
    public void m126947f(C23881a c23881a) {
        this.f117388c.add(c23881a);
        this.f117389d.add(c23881a);
    }

    /* renamed from: g */
    public void m126948g() {
        this.f117388c.clear();
        this.f117389d.clear();
        this.f117390e.clear();
        this.f117391f.m124946c();
    }

    /* renamed from: h */
    public List m126949h() {
        return this.f117388c;
    }

    /* renamed from: i */
    public void m126950i() {
        this.f117391f.m124947d();
        this.f117388c = this.f117391f.m124950g();
    }

    /* renamed from: j */
    public void m126951j(C23881a c23881a) {
        this.f117388c.remove(c23881a);
        this.f117389d.remove(c23881a);
        this.f117390e.add(c23881a);
    }

    /* renamed from: k */
    public void m126952k() {
        this.f117391f.m124952i(this.f117390e);
        this.f117391f.m124945a(this.f117389d);
        this.f117389d.clear();
        this.f117390e.clear();
    }
}
