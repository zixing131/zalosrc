package vc0;

import android.graphics.Rect;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: vc0.c */
/* loaded from: classes4.dex */
public abstract class AbstractC27964c {

    /* renamed from: b */
    int f130398b;

    /* renamed from: c */
    int f130399c;

    /* renamed from: d */
    int f130400d;

    /* renamed from: f */
    protected HashSet f130402f;

    /* renamed from: g */
    final a f130403g;

    /* renamed from: a */
    int f130397a = 0;

    /* renamed from: e */
    Map f130401e = new HashMap();

    /* renamed from: vc0.c$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: a */
        void mo69546a(InterfaceC27965d interfaceC27965d, int i11, boolean z11);
    }

    public AbstractC27964c(a aVar) {
        this.f130403g = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m140950a(InterfaceC27965d interfaceC27965d) {
        HashSet hashSet = this.f130402f;
        if (hashSet != null && hashSet.contains(interfaceC27965d)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m140951b(InterfaceC27968g interfaceC27968g, float f11, float f12) {
        boolean z11;
        List dragItems = interfaceC27968g.getDragItems();
        if (dragItems != null && !dragItems.isEmpty()) {
            int size = dragItems.size();
            int i11 = 0;
            int i12 = -2;
            int i13 = -2;
            while (true) {
                if (i11 < size) {
                    Rect mo69523J = interfaceC27968g.mo69523J(i11);
                    if (mo69523J != null) {
                        int i14 = mo69523J.left;
                        if (i14 <= f11 && mo69523J.right >= f11 && mo69523J.top <= f12 && mo69523J.bottom >= f12) {
                            if (this.f130398b == -1) {
                                this.f130398b = i11;
                            }
                            i13 = this.f130398b;
                            if (i13 == i11) {
                                i11 = i13;
                            } else {
                                int min = Math.min(i13, i11);
                                i13 = Math.max(this.f130398b, i11);
                                i11 = min;
                            }
                        } else {
                            int i15 = this.f130398b;
                            if (i11 < i15 && mo69523J.right >= f11 && mo69523J.top <= f12 && mo69523J.bottom >= f12) {
                                i13 = i15;
                                break;
                            } else if (i11 > i15 && i14 <= f11 && mo69523J.top <= f12 && mo69523J.bottom >= f12) {
                                i13 = i11;
                                i12 = i15;
                            }
                        }
                    }
                    i11++;
                } else {
                    i11 = i12;
                    break;
                }
            }
            if (i11 == -2) {
                return;
            }
            for (int i16 = 0; i16 < size; i16++) {
                if (i16 >= i11 && i16 <= i13) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                InterfaceC27965d interfaceC27965d = (InterfaceC27965d) dragItems.get(i16);
                if (interfaceC27965d.mo40584b() != z11 && (z11 || this.f130401e.containsKey(interfaceC27965d.mo40586c()) || !m140950a(interfaceC27965d))) {
                    m140955f(interfaceC27965d, interfaceC27968g.getDragPosition(), z11);
                } else if (z11 && m140950a(interfaceC27965d)) {
                    this.f130401e.put(interfaceC27965d.mo40586c(), Boolean.TRUE);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:            if (r4.bottom < r12) goto L25;     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m140952c(InterfaceC27968g interfaceC27968g, boolean z11, float f11, float f12) {
        List dragItems = interfaceC27968g.getDragItems();
        if (dragItems != null && !dragItems.isEmpty()) {
            int size = dragItems.size();
            boolean z12 = z11;
            for (int i11 = 0; i11 < size; i11++) {
                Rect mo69523J = interfaceC27968g.mo69523J(i11);
                if (mo69523J != null) {
                    int i12 = mo69523J.left;
                    if (i12 <= f11) {
                        int i13 = mo69523J.top;
                        if (i13 <= f12) {
                            if (!z11) {
                                if (i12 <= f11) {
                                    if (mo69523J.right >= f11) {
                                        if (i13 <= f12) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    z12 = !z11;
                }
                InterfaceC27965d interfaceC27965d = (InterfaceC27965d) dragItems.get(i11);
                if (interfaceC27965d.mo40584b() != z12 && (z12 || this.f130401e.containsKey(interfaceC27965d.mo40586c()) || !m140950a(interfaceC27965d))) {
                    m140955f(interfaceC27965d, interfaceC27968g.getDragPosition(), z12);
                } else if (z12 && m140950a(interfaceC27965d)) {
                    this.f130401e.put(interfaceC27965d.mo40586c(), Boolean.TRUE);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:            if (r4 < r11) goto L25;     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m140953d(InterfaceC27968g interfaceC27968g, boolean z11, float f11, float f12) {
        List dragItems = interfaceC27968g.getDragItems();
        if (dragItems != null && !dragItems.isEmpty()) {
            boolean z12 = z11;
            for (int size = dragItems.size() - 1; size >= 0; size--) {
                Rect mo69523J = interfaceC27968g.mo69523J(size);
                if (mo69523J != null) {
                    int i11 = mo69523J.bottom;
                    if (i11 >= f12) {
                        int i12 = mo69523J.right;
                        if (i12 >= f11) {
                            if (!z11) {
                                if (mo69523J.left <= f11) {
                                    if (i12 >= f11) {
                                        if (mo69523J.top <= f12) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    z12 = !z11;
                }
                InterfaceC27965d interfaceC27965d = (InterfaceC27965d) dragItems.get(size);
                if (interfaceC27965d.mo40584b() != z12 && (z12 || this.f130401e.containsKey(interfaceC27965d.mo40586c()) || !m140950a(interfaceC27965d))) {
                    m140955f(interfaceC27965d, interfaceC27968g.getDragPosition(), z12);
                } else if (z12 && m140950a(interfaceC27965d)) {
                    this.f130401e.put(interfaceC27965d.mo40586c(), Boolean.TRUE);
                }
            }
        }
    }

    /* renamed from: e */
    public int m140954e() {
        return this.f130401e.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m140955f(InterfaceC27965d interfaceC27965d, int i11, boolean z11) {
        a aVar = this.f130403g;
        if (aVar != null) {
            aVar.mo69546a(interfaceC27965d, i11, z11);
        }
    }

    /* renamed from: g */
    public abstract void mo140956g(int i11, int i12, int i13, float f11, float f12, boolean z11);

    /* renamed from: h */
    public void m140957h() {
        this.f130402f = null;
    }

    /* renamed from: i */
    public void m140958i(List list) {
        HashSet hashSet = new HashSet();
        this.f130402f = hashSet;
        if (list != null) {
            hashSet.addAll(list);
        }
    }

    /* renamed from: j */
    public void m140959j(int i11) {
        this.f130397a = i11;
        this.f130399c = i11;
        this.f130400d = i11;
        this.f130398b = -1;
        this.f130401e = new HashMap();
    }

    /* renamed from: k */
    public void m140960k(int i11, int i12, float f11, float f12, boolean z11) {
        for (int i13 = i11; i13 <= i12; i13++) {
            mo140956g(i13, i11, i12, f11, f12, z11);
        }
    }

    /* renamed from: l */
    public void m140961l(String str, boolean z11) {
        if (z11) {
            this.f130401e.put(str, Boolean.TRUE);
        } else {
            this.f130401e.remove(str);
        }
    }
}
