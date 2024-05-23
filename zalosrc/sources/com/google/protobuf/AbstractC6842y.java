package com.google.protobuf;

import com.google.protobuf.AbstractC6830s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.protobuf.y */
/* loaded from: classes3.dex */
abstract class AbstractC6842y {

    /* renamed from: a */
    private static final AbstractC6842y f37510a;

    /* renamed from: b */
    private static final AbstractC6842y f37511b;

    /* renamed from: com.google.protobuf.y$b */
    /* loaded from: classes3.dex */
    private static final class b extends AbstractC6842y {

        /* renamed from: c */
        private static final Class f37512c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private b() {
            super();
        }

        /* renamed from: e */
        static List m35164e(Object obj, long j11) {
            return (List) AbstractC6804g1.m34840C(obj, j11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: f */
        private static List m35165f(Object obj, long j11, int i11) {
            C6838w c6838w;
            List arrayList;
            List m35164e = m35164e(obj, j11);
            if (m35164e.isEmpty()) {
                if (m35164e instanceof InterfaceC6840x) {
                    arrayList = new C6838w(i11);
                } else if ((m35164e instanceof InterfaceC6829r0) && (m35164e instanceof AbstractC6830s.e)) {
                    arrayList = ((AbstractC6830s.e) m35164e).mo35124h(i11);
                } else {
                    arrayList = new ArrayList(i11);
                }
                AbstractC6804g1.m34855R(obj, j11, arrayList);
                return arrayList;
            }
            if (f37512c.isAssignableFrom(m35164e.getClass())) {
                ArrayList arrayList2 = new ArrayList(m35164e.size() + i11);
                arrayList2.addAll(m35164e);
                AbstractC6804g1.m34855R(obj, j11, arrayList2);
                c6838w = arrayList2;
            } else if (m35164e instanceof C6801f1) {
                C6838w c6838w2 = new C6838w(m35164e.size() + i11);
                c6838w2.addAll((C6801f1) m35164e);
                AbstractC6804g1.m34855R(obj, j11, c6838w2);
                c6838w = c6838w2;
            } else {
                if ((m35164e instanceof InterfaceC6829r0) && (m35164e instanceof AbstractC6830s.e)) {
                    AbstractC6830s.e eVar = (AbstractC6830s.e) m35164e;
                    if (!eVar.mo34738O()) {
                        AbstractC6830s.e mo35124h = eVar.mo35124h(m35164e.size() + i11);
                        AbstractC6804g1.m34855R(obj, j11, mo35124h);
                        return mo35124h;
                    }
                    return m35164e;
                }
                return m35164e;
            }
            return c6838w;
        }

        @Override // com.google.protobuf.AbstractC6842y
        /* renamed from: c */
        void mo35162c(Object obj, long j11) {
            Object unmodifiableList;
            List list = (List) AbstractC6804g1.m34840C(obj, j11);
            if (list instanceof InterfaceC6840x) {
                unmodifiableList = ((InterfaceC6840x) list).mo34821r0();
            } else {
                if (f37512c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof InterfaceC6829r0) && (list instanceof AbstractC6830s.e)) {
                    AbstractC6830s.e eVar = (AbstractC6830s.e) list;
                    if (eVar.mo34738O()) {
                        eVar.mo34740o();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            AbstractC6804g1.m34855R(obj, j11, unmodifiableList);
        }

        @Override // com.google.protobuf.AbstractC6842y
        /* renamed from: d */
        void mo35163d(Object obj, Object obj2, long j11) {
            List m35164e = m35164e(obj2, j11);
            List m35165f = m35165f(obj, j11, m35164e.size());
            int size = m35165f.size();
            int size2 = m35164e.size();
            if (size > 0 && size2 > 0) {
                m35165f.addAll(m35164e);
            }
            if (size > 0) {
                m35164e = m35165f;
            }
            AbstractC6804g1.m34855R(obj, j11, m35164e);
        }
    }

    /* renamed from: com.google.protobuf.y$c */
    /* loaded from: classes3.dex */
    private static final class c extends AbstractC6842y {
        private c() {
            super();
        }

        /* renamed from: e */
        static AbstractC6830s.e m35166e(Object obj, long j11) {
            return (AbstractC6830s.e) AbstractC6804g1.m34840C(obj, j11);
        }

        @Override // com.google.protobuf.AbstractC6842y
        /* renamed from: c */
        void mo35162c(Object obj, long j11) {
            m35166e(obj, j11).mo34740o();
        }

        @Override // com.google.protobuf.AbstractC6842y
        /* renamed from: d */
        void mo35163d(Object obj, Object obj2, long j11) {
            AbstractC6830s.e m35166e = m35166e(obj, j11);
            AbstractC6830s.e m35166e2 = m35166e(obj2, j11);
            int size = m35166e.size();
            int size2 = m35166e2.size();
            if (size > 0 && size2 > 0) {
                if (!m35166e.mo34738O()) {
                    m35166e = m35166e.mo35124h(size2 + size);
                }
                m35166e.addAll(m35166e2);
            }
            if (size > 0) {
                m35166e2 = m35166e;
            }
            AbstractC6804g1.m34855R(obj, j11, m35166e2);
        }
    }

    static {
        f37510a = new b();
        f37511b = new c();
    }

    private AbstractC6842y() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static AbstractC6842y m35160a() {
        return f37510a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static AbstractC6842y m35161b() {
        return f37511b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract void mo35162c(Object obj, long j11);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract void mo35163d(Object obj, Object obj2, long j11);
}
