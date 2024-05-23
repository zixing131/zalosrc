package androidx.fragment.app;

import androidx.core.util.C1481c;
import androidx.fragment.app.AbstractC1736j;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.LayoutInflaterFactory2C1734h;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.a */
/* loaded from: classes2.dex */
public final class C1727a extends AbstractC1736j implements LayoutInflaterFactory2C1734h.k {

    /* renamed from: s */
    final LayoutInflaterFactory2C1734h f7024s;

    /* renamed from: t */
    boolean f7025t;

    /* renamed from: u */
    int f7026u = -1;

    public C1727a(LayoutInflaterFactory2C1734h layoutInflaterFactory2C1734h) {
        this.f7024s = layoutInflaterFactory2C1734h;
    }

    /* renamed from: r */
    private static boolean m8932r(AbstractC1736j.a aVar) {
        Fragment fragment = aVar.f7140b;
        if (fragment != null && fragment.f6965z && fragment.f6938V != null && !fragment.f6931O && !fragment.f6930N && fragment.m8809N()) {
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.LayoutInflaterFactory2C1734h.k
    /* renamed from: a */
    public boolean mo8933a(ArrayList arrayList, ArrayList arrayList2) {
        if (LayoutInflaterFactory2C1734h.f7048W) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Run: ");
            sb2.append(this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.f7128h) {
            this.f7024s.m9105m(this);
            return true;
        }
        return true;
    }

    @Override // androidx.fragment.app.AbstractC1736j
    /* renamed from: d */
    public int mo8934d() {
        return m8939i(false);
    }

    @Override // androidx.fragment.app.AbstractC1736j
    /* renamed from: e */
    public int mo8935e() {
        return m8939i(true);
    }

    @Override // androidx.fragment.app.AbstractC1736j
    /* renamed from: f */
    public void mo8936f(int i11, Fragment fragment, String str, int i12) {
        super.mo8936f(i11, fragment, str, i12);
        fragment.f6923G = this.f7024s;
    }

    @Override // androidx.fragment.app.AbstractC1736j
    /* renamed from: g */
    public AbstractC1736j mo8937g(Fragment fragment) {
        LayoutInflaterFactory2C1734h layoutInflaterFactory2C1734h = fragment.f6923G;
        if (layoutInflaterFactory2C1734h != null && layoutInflaterFactory2C1734h != this.f7024s) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.mo8937g(fragment);
    }

    /* renamed from: h */
    public void m8938h(int i11) {
        if (!this.f7128h) {
            return;
        }
        if (LayoutInflaterFactory2C1734h.f7048W) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Bump nesting in ");
            sb2.append(this);
            sb2.append(" by ");
            sb2.append(i11);
        }
        int size = this.f7121a.size();
        for (int i12 = 0; i12 < size; i12++) {
            AbstractC1736j.a aVar = (AbstractC1736j.a) this.f7121a.get(i12);
            Fragment fragment = aVar.f7140b;
            if (fragment != null) {
                fragment.f6922F += i11;
                if (LayoutInflaterFactory2C1734h.f7048W) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Bump nesting of ");
                    sb3.append(aVar.f7140b);
                    sb3.append(" to ");
                    sb3.append(aVar.f7140b.f6922F);
                }
            }
        }
    }

    /* renamed from: i */
    int m8939i(boolean z11) {
        if (!this.f7025t) {
            if (LayoutInflaterFactory2C1734h.f7048W) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Commit: ");
                sb2.append(this);
                PrintWriter printWriter = new PrintWriter(new C1481c("FragmentManager"));
                m8940j("  ", printWriter);
                printWriter.close();
            }
            this.f7025t = true;
            if (this.f7128h) {
                this.f7026u = this.f7024s.m9113p(this);
            } else {
                this.f7026u = -1;
            }
            this.f7024s.m9102k0(this, z11);
            return this.f7026u;
        }
        throw new IllegalStateException("commit already called");
    }

    /* renamed from: j */
    public void m8940j(String str, PrintWriter printWriter) {
        m8941k(str, printWriter, true);
    }

    /* renamed from: k */
    public void m8941k(String str, PrintWriter printWriter, boolean z11) {
        String str2;
        if (z11) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f7130j);
            printWriter.print(" mIndex=");
            printWriter.print(this.f7026u);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f7025t);
            if (this.f7126f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f7126f));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f7127g));
            }
            if (this.f7122b != 0 || this.f7123c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f7122b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f7123c));
            }
            if (this.f7124d != 0 || this.f7125e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f7124d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f7125e));
            }
            if (this.f7131k != 0 || this.f7132l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f7131k));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f7132l);
            }
            if (this.f7133m != 0 || this.f7134n != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f7133m));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f7134n);
            }
        }
        if (!this.f7121a.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f7121a.size();
            for (int i11 = 0; i11 < size; i11++) {
                AbstractC1736j.a aVar = (AbstractC1736j.a) this.f7121a.get(i11);
                switch (aVar.f7139a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f7139a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f7140b);
                if (z11) {
                    if (aVar.f7141c != 0 || aVar.f7142d != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f7141c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f7142d));
                    }
                    if (aVar.f7143e != 0 || aVar.f7144f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f7143e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f7144f));
                    }
                }
            }
        }
    }

    /* renamed from: l */
    public void m8942l() {
        int size = this.f7121a.size();
        for (int i11 = 0; i11 < size; i11++) {
            AbstractC1736j.a aVar = (AbstractC1736j.a) this.f7121a.get(i11);
            Fragment fragment = aVar.f7140b;
            if (fragment != null) {
                fragment.m8851g1(this.f7126f, this.f7127g);
            }
            switch (aVar.f7139a) {
                case 1:
                    fragment.m8848f1(aVar.f7141c);
                    this.f7024s.m9108n(fragment, false);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f7139a);
                case 3:
                    fragment.m8848f1(aVar.f7142d);
                    this.f7024s.m9087a1(fragment);
                    break;
                case 4:
                    fragment.m8848f1(aVar.f7142d);
                    this.f7024s.m9050E0(fragment);
                    break;
                case 5:
                    fragment.m8848f1(aVar.f7141c);
                    this.f7024s.m9110n1(fragment);
                    break;
                case 6:
                    fragment.m8848f1(aVar.f7142d);
                    this.f7024s.m9124z(fragment);
                    break;
                case 7:
                    fragment.m8848f1(aVar.f7141c);
                    this.f7024s.m9116s(fragment);
                    break;
                case 8:
                    this.f7024s.m9107m1(fragment);
                    break;
                case 9:
                    this.f7024s.m9107m1(null);
                    break;
                case 10:
                    this.f7024s.m9104l1(fragment, aVar.f7146h);
                    break;
            }
            if (!this.f7137q && aVar.f7139a != 1 && fragment != null) {
                this.f7024s.m9070Q0(fragment);
            }
        }
        if (!this.f7137q) {
            LayoutInflaterFactory2C1734h layoutInflaterFactory2C1734h = this.f7024s;
            layoutInflaterFactory2C1734h.m9072R0(layoutInflaterFactory2C1734h.f7055E, true);
        }
    }

    /* renamed from: m */
    public void m8943m(boolean z11) {
        for (int size = this.f7121a.size() - 1; size >= 0; size--) {
            AbstractC1736j.a aVar = (AbstractC1736j.a) this.f7121a.get(size);
            Fragment fragment = aVar.f7140b;
            if (fragment != null) {
                fragment.m8851g1(LayoutInflaterFactory2C1734h.m9023f1(this.f7126f), this.f7127g);
            }
            switch (aVar.f7139a) {
                case 1:
                    fragment.m8848f1(aVar.f7144f);
                    this.f7024s.m9087a1(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f7139a);
                case 3:
                    fragment.m8848f1(aVar.f7143e);
                    this.f7024s.m9108n(fragment, false);
                    break;
                case 4:
                    fragment.m8848f1(aVar.f7143e);
                    this.f7024s.m9110n1(fragment);
                    break;
                case 5:
                    fragment.m8848f1(aVar.f7144f);
                    this.f7024s.m9050E0(fragment);
                    break;
                case 6:
                    fragment.m8848f1(aVar.f7143e);
                    this.f7024s.m9116s(fragment);
                    break;
                case 7:
                    fragment.m8848f1(aVar.f7144f);
                    this.f7024s.m9124z(fragment);
                    break;
                case 8:
                    this.f7024s.m9107m1(null);
                    break;
                case 9:
                    this.f7024s.m9107m1(fragment);
                    break;
                case 10:
                    this.f7024s.m9104l1(fragment, aVar.f7145g);
                    break;
            }
            if (!this.f7137q && aVar.f7139a != 3 && fragment != null) {
                this.f7024s.m9070Q0(fragment);
            }
        }
        if (!this.f7137q && z11) {
            LayoutInflaterFactory2C1734h layoutInflaterFactory2C1734h = this.f7024s;
            layoutInflaterFactory2C1734h.m9072R0(layoutInflaterFactory2C1734h.f7055E, true);
        }
    }

    /* renamed from: n */
    public Fragment m8944n(ArrayList arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i11 = 0;
        while (i11 < this.f7121a.size()) {
            AbstractC1736j.a aVar = (AbstractC1736j.a) this.f7121a.get(i11);
            int i12 = aVar.f7139a;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3 && i12 != 6) {
                        if (i12 != 7) {
                            if (i12 == 8) {
                                this.f7121a.add(i11, new AbstractC1736j.a(9, fragment2));
                                i11++;
                                fragment2 = aVar.f7140b;
                            }
                        }
                    } else {
                        arrayList.remove(aVar.f7140b);
                        Fragment fragment3 = aVar.f7140b;
                        if (fragment3 == fragment2) {
                            this.f7121a.add(i11, new AbstractC1736j.a(9, fragment3));
                            i11++;
                            fragment2 = null;
                        }
                    }
                } else {
                    Fragment fragment4 = aVar.f7140b;
                    int i13 = fragment4.f6928L;
                    boolean z11 = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment5 = (Fragment) arrayList.get(size);
                        if (fragment5.f6928L == i13) {
                            if (fragment5 == fragment4) {
                                z11 = true;
                            } else {
                                if (fragment5 == fragment2) {
                                    this.f7121a.add(i11, new AbstractC1736j.a(9, fragment5));
                                    i11++;
                                    fragment2 = null;
                                }
                                AbstractC1736j.a aVar2 = new AbstractC1736j.a(3, fragment5);
                                aVar2.f7141c = aVar.f7141c;
                                aVar2.f7143e = aVar.f7143e;
                                aVar2.f7142d = aVar.f7142d;
                                aVar2.f7144f = aVar.f7144f;
                                this.f7121a.add(i11, aVar2);
                                arrayList.remove(fragment5);
                                i11++;
                            }
                        }
                    }
                    if (z11) {
                        this.f7121a.remove(i11);
                        i11--;
                    } else {
                        aVar.f7139a = 1;
                        arrayList.add(fragment4);
                    }
                }
                i11++;
            }
            arrayList.add(aVar.f7140b);
            i11++;
        }
        return fragment2;
    }

    /* renamed from: o */
    public String m8945o() {
        return this.f7130j;
    }

    /* renamed from: p */
    public boolean m8946p(int i11) {
        int i12;
        int size = this.f7121a.size();
        for (int i13 = 0; i13 < size; i13++) {
            Fragment fragment = ((AbstractC1736j.a) this.f7121a.get(i13)).f7140b;
            if (fragment != null) {
                i12 = fragment.f6928L;
            } else {
                i12 = 0;
            }
            if (i12 != 0 && i12 == i11) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    public boolean m8947q(ArrayList arrayList, int i11, int i12) {
        int i13;
        int i14;
        if (i12 == i11) {
            return false;
        }
        int size = this.f7121a.size();
        int i15 = -1;
        for (int i16 = 0; i16 < size; i16++) {
            Fragment fragment = ((AbstractC1736j.a) this.f7121a.get(i16)).f7140b;
            if (fragment != null) {
                i13 = fragment.f6928L;
            } else {
                i13 = 0;
            }
            if (i13 != 0 && i13 != i15) {
                for (int i17 = i11; i17 < i12; i17++) {
                    C1727a c1727a = (C1727a) arrayList.get(i17);
                    int size2 = c1727a.f7121a.size();
                    for (int i18 = 0; i18 < size2; i18++) {
                        Fragment fragment2 = ((AbstractC1736j.a) c1727a.f7121a.get(i18)).f7140b;
                        if (fragment2 != null) {
                            i14 = fragment2.f6928L;
                        } else {
                            i14 = 0;
                        }
                        if (i14 == i13) {
                            return true;
                        }
                    }
                }
                i15 = i13;
            }
        }
        return false;
    }

    /* renamed from: s */
    public boolean m8948s() {
        for (int i11 = 0; i11 < this.f7121a.size(); i11++) {
            if (m8932r((AbstractC1736j.a) this.f7121a.get(i11))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: t */
    public void m8949t() {
        if (this.f7138r != null) {
            for (int i11 = 0; i11 < this.f7138r.size(); i11++) {
                ((Runnable) this.f7138r.get(i11)).run();
            }
            this.f7138r = null;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f7026u >= 0) {
            sb2.append(" #");
            sb2.append(this.f7026u);
        }
        if (this.f7130j != null) {
            sb2.append(" ");
            sb2.append(this.f7130j);
        }
        sb2.append("}");
        return sb2.toString();
    }

    /* renamed from: u */
    public void m8950u(Fragment.InterfaceC1721e interfaceC1721e) {
        for (int i11 = 0; i11 < this.f7121a.size(); i11++) {
            AbstractC1736j.a aVar = (AbstractC1736j.a) this.f7121a.get(i11);
            if (m8932r(aVar)) {
                aVar.f7140b.m8854h1(interfaceC1721e);
            }
        }
    }

    /* renamed from: v */
    public Fragment m8951v(ArrayList arrayList, Fragment fragment) {
        for (int size = this.f7121a.size() - 1; size >= 0; size--) {
            AbstractC1736j.a aVar = (AbstractC1736j.a) this.f7121a.get(size);
            int i11 = aVar.f7139a;
            if (i11 != 1) {
                if (i11 != 3) {
                    switch (i11) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f7140b;
                            break;
                        case 10:
                            aVar.f7146h = aVar.f7145g;
                            break;
                    }
                }
                arrayList.add(aVar.f7140b);
            }
            arrayList.remove(aVar.f7140b);
        }
        return fragment;
    }
}
