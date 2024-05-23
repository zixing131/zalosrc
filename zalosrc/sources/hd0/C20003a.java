package hd0;

import com.zing.zalo.uidrawing.C16719g;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: hd0.a */
/* loaded from: classes4.dex */
public class C20003a {

    /* renamed from: a */
    private List f98345a;

    /* renamed from: b */
    private boolean f98346b;

    public C20003a(C16719g... c16719gArr) {
        LinkedList linkedList = new LinkedList();
        this.f98345a = linkedList;
        this.f98346b = false;
        if (c16719gArr != null) {
            Collections.addAll(linkedList, c16719gArr);
        }
    }

    /* renamed from: a */
    public List m103808a() {
        return this.f98345a;
    }

    /* renamed from: b */
    public boolean m103809b() {
        return this.f98346b;
    }

    public C20003a(boolean z11, C16719g... c16719gArr) {
        this(c16719gArr);
        this.f98346b = z11;
    }
}
