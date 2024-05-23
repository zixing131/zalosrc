package bn0;

import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.io.AccessDeniedException;
import nn0.InterfaceC23898g;
import qm0.AbstractC25334b;

/* renamed from: bn0.e */
/* loaded from: classes7.dex */
public final class C2936e implements InterfaceC23898g {

    /* renamed from: a */
    private final File f11601a;

    /* renamed from: b */
    private final EnumC2937f f11602b;

    /* renamed from: c */
    private final InterfaceC18505l f11603c;

    /* renamed from: d */
    private final InterfaceC18505l f11604d;

    /* renamed from: e */
    private final InterfaceC18509p f11605e;

    /* renamed from: f */
    private final int f11606f;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bn0.e$a */
    /* loaded from: classes7.dex */
    public static abstract class a extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File file) {
            super(file);
            AbstractC19074t.m100208f(file, "rootDir");
        }
    }

    /* renamed from: bn0.e$b */
    /* loaded from: classes7.dex */
    private final class b extends AbstractC25334b {

        /* renamed from: r */
        private final ArrayDeque f11607r;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: bn0.e$b$a */
        /* loaded from: classes7.dex */
        public final class a extends a {

            /* renamed from: b */
            private boolean f11609b;

            /* renamed from: c */
            private File[] f11610c;

            /* renamed from: d */
            private int f11611d;

            /* renamed from: e */
            private boolean f11612e;

            /* renamed from: f */
            final /* synthetic */ b f11613f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, File file) {
                super(file);
                AbstractC19074t.m100208f(file, "rootDir");
                this.f11613f = bVar;
            }

            @Override // bn0.C2936e.c
            /* renamed from: b */
            public File mo13903b() {
                if (!this.f11612e && this.f11610c == null) {
                    InterfaceC18505l interfaceC18505l = C2936e.this.f11603c;
                    if (interfaceC18505l != null && !((Boolean) interfaceC18505l.mo205i9(m13904a())).booleanValue()) {
                        return null;
                    }
                    File[] listFiles = m13904a().listFiles();
                    this.f11610c = listFiles;
                    if (listFiles == null) {
                        InterfaceC18509p interfaceC18509p = C2936e.this.f11605e;
                        if (interfaceC18509p != null) {
                            interfaceC18509p.mo240pC(m13904a(), new AccessDeniedException(m13904a(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.f11612e = true;
                    }
                }
                File[] fileArr = this.f11610c;
                if (fileArr != null) {
                    int i11 = this.f11611d;
                    AbstractC19074t.m100205c(fileArr);
                    if (i11 < fileArr.length) {
                        File[] fileArr2 = this.f11610c;
                        AbstractC19074t.m100205c(fileArr2);
                        int i12 = this.f11611d;
                        this.f11611d = i12 + 1;
                        return fileArr2[i12];
                    }
                }
                if (this.f11609b) {
                    InterfaceC18505l interfaceC18505l2 = C2936e.this.f11604d;
                    if (interfaceC18505l2 != null) {
                        interfaceC18505l2.mo205i9(m13904a());
                    }
                    return null;
                }
                this.f11609b = true;
                return m13904a();
            }
        }

        /* renamed from: bn0.e$b$b, reason: collision with other inner class name */
        /* loaded from: classes7.dex */
        private final class C32651b extends c {

            /* renamed from: b */
            private boolean f11614b;

            /* renamed from: c */
            final /* synthetic */ b f11615c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C32651b(b bVar, File file) {
                super(file);
                AbstractC19074t.m100208f(file, "rootFile");
                this.f11615c = bVar;
            }

            @Override // bn0.C2936e.c
            /* renamed from: b */
            public File mo13903b() {
                if (this.f11614b) {
                    return null;
                }
                this.f11614b = true;
                return m13904a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: bn0.e$b$c */
        /* loaded from: classes7.dex */
        public final class c extends a {

            /* renamed from: b */
            private boolean f11616b;

            /* renamed from: c */
            private File[] f11617c;

            /* renamed from: d */
            private int f11618d;

            /* renamed from: e */
            final /* synthetic */ b f11619e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(b bVar, File file) {
                super(file);
                AbstractC19074t.m100208f(file, "rootDir");
                this.f11619e = bVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:            if (r0.length == 0) goto L31;     */
            @Override // bn0.C2936e.c
            /* renamed from: b */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public File mo13903b() {
                InterfaceC18509p interfaceC18509p;
                if (!this.f11616b) {
                    InterfaceC18505l interfaceC18505l = C2936e.this.f11603c;
                    if (interfaceC18505l != null && !((Boolean) interfaceC18505l.mo205i9(m13904a())).booleanValue()) {
                        return null;
                    }
                    this.f11616b = true;
                    return m13904a();
                }
                File[] fileArr = this.f11617c;
                if (fileArr != null) {
                    int i11 = this.f11618d;
                    AbstractC19074t.m100205c(fileArr);
                    if (i11 >= fileArr.length) {
                        InterfaceC18505l interfaceC18505l2 = C2936e.this.f11604d;
                        if (interfaceC18505l2 != null) {
                            interfaceC18505l2.mo205i9(m13904a());
                        }
                        return null;
                    }
                }
                if (this.f11617c == null) {
                    File[] listFiles = m13904a().listFiles();
                    this.f11617c = listFiles;
                    if (listFiles == null && (interfaceC18509p = C2936e.this.f11605e) != null) {
                        interfaceC18509p.mo240pC(m13904a(), new AccessDeniedException(m13904a(), null, "Cannot list files in a directory", 2, null));
                    }
                    File[] fileArr2 = this.f11617c;
                    if (fileArr2 != null) {
                        AbstractC19074t.m100205c(fileArr2);
                    }
                    InterfaceC18505l interfaceC18505l3 = C2936e.this.f11604d;
                    if (interfaceC18505l3 != null) {
                        interfaceC18505l3.mo205i9(m13904a());
                    }
                    return null;
                }
                File[] fileArr3 = this.f11617c;
                AbstractC19074t.m100205c(fileArr3);
                int i12 = this.f11618d;
                this.f11618d = i12 + 1;
                return fileArr3[i12];
            }
        }

        /* renamed from: bn0.e$b$d */
        /* loaded from: classes7.dex */
        public /* synthetic */ class d {

            /* renamed from: a */
            public static final /* synthetic */ int[] f11620a;

            static {
                int[] iArr = new int[EnumC2937f.values().length];
                try {
                    iArr[EnumC2937f.f11622p.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC2937f.f11623q.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f11620a = iArr;
            }
        }

        public b() {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f11607r = arrayDeque;
            if (C2936e.this.f11601a.isDirectory()) {
                arrayDeque.push(m13900f(C2936e.this.f11601a));
            } else if (C2936e.this.f11601a.isFile()) {
                arrayDeque.push(new C32651b(this, C2936e.this.f11601a));
            } else {
                m131231c();
            }
        }

        /* renamed from: f */
        private final a m13900f(File file) {
            int i11 = d.f11620a[C2936e.this.f11602b.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    return new a(this, file);
                }
                throw new NoWhenBranchMatchedException();
            }
            return new c(this, file);
        }

        /* renamed from: g */
        private final File m13901g() {
            File mo13903b;
            while (true) {
                c cVar = (c) this.f11607r.peek();
                if (cVar == null) {
                    return null;
                }
                mo13903b = cVar.mo13903b();
                if (mo13903b == null) {
                    this.f11607r.pop();
                } else {
                    if (AbstractC19074t.m100204b(mo13903b, cVar.m13904a()) || !mo13903b.isDirectory() || this.f11607r.size() >= C2936e.this.f11606f) {
                        break;
                    }
                    this.f11607r.push(m13900f(mo13903b));
                }
            }
            return mo13903b;
        }

        @Override // qm0.AbstractC25334b
        /* renamed from: a */
        protected void mo13902a() {
            File m13901g = m13901g();
            if (m13901g != null) {
                m131232d(m13901g);
            } else {
                m131231c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bn0.e$c */
    /* loaded from: classes7.dex */
    public static abstract class c {

        /* renamed from: a */
        private final File f11621a;

        public c(File file) {
            AbstractC19074t.m100208f(file, "root");
            this.f11621a = file;
        }

        /* renamed from: a */
        public final File m13904a() {
            return this.f11621a;
        }

        /* renamed from: b */
        public abstract File mo13903b();
    }

    private C2936e(File file, EnumC2937f enumC2937f, InterfaceC18505l interfaceC18505l, InterfaceC18505l interfaceC18505l2, InterfaceC18509p interfaceC18509p, int i11) {
        this.f11601a = file;
        this.f11602b = enumC2937f;
        this.f11603c = interfaceC18505l;
        this.f11604d = interfaceC18505l2;
        this.f11605e = interfaceC18509p;
        this.f11606f = i11;
    }

    @Override // nn0.InterfaceC23898g
    public Iterator iterator() {
        return new b();
    }

    /* synthetic */ C2936e(File file, EnumC2937f enumC2937f, InterfaceC18505l interfaceC18505l, InterfaceC18505l interfaceC18505l2, InterfaceC18509p interfaceC18509p, int i11, int i12, AbstractC19060k abstractC19060k) {
        this(file, (i12 & 2) != 0 ? EnumC2937f.f11622p : enumC2937f, interfaceC18505l, interfaceC18505l2, interfaceC18509p, (i12 & 32) != 0 ? Integer.MAX_VALUE : i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2936e(File file, EnumC2937f enumC2937f) {
        this(file, enumC2937f, null, null, null, 0, 32, null);
        AbstractC19074t.m100208f(file, "start");
        AbstractC19074t.m100208f(enumC2937f, "direction");
    }
}
