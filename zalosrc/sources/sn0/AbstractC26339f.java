package sn0;

import fn0.AbstractC19074t;
import gn0.InterfaceC19517a;
import java.util.Iterator;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: sn0.f */
/* loaded from: classes7.dex */
public abstract class AbstractC26339f {

    /* renamed from: sn0.f$a */
    /* loaded from: classes7.dex */
    public static final class a implements Iterator, InterfaceC19517a {

        /* renamed from: p */
        private int f125046p;

        /* renamed from: q */
        final /* synthetic */ SerialDescriptor f125047q;

        a(SerialDescriptor serialDescriptor) {
            this.f125047q = serialDescriptor;
            this.f125046p = serialDescriptor.mo113949e();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SerialDescriptor next() {
            SerialDescriptor serialDescriptor = this.f125047q;
            int mo113949e = serialDescriptor.mo113949e();
            int i11 = this.f125046p;
            this.f125046p = i11 - 1;
            return serialDescriptor.mo113952h(mo113949e - i11);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f125046p > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: sn0.f$b */
    /* loaded from: classes7.dex */
    public static final class b implements Iterator, InterfaceC19517a {

        /* renamed from: p */
        private int f125048p;

        /* renamed from: q */
        final /* synthetic */ SerialDescriptor f125049q;

        b(SerialDescriptor serialDescriptor) {
            this.f125049q = serialDescriptor;
            this.f125048p = serialDescriptor.mo113949e();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            SerialDescriptor serialDescriptor = this.f125049q;
            int mo113949e = serialDescriptor.mo113949e();
            int i11 = this.f125048p;
            this.f125048p = i11 - 1;
            return serialDescriptor.mo113950f(mo113949e - i11);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f125048p > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: sn0.f$c */
    /* loaded from: classes7.dex */
    public static final class c implements Iterable, InterfaceC19517a {

        /* renamed from: p */
        final /* synthetic */ SerialDescriptor f125050p;

        public c(SerialDescriptor serialDescriptor) {
            this.f125050p = serialDescriptor;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new a(this.f125050p);
        }
    }

    /* renamed from: sn0.f$d */
    /* loaded from: classes7.dex */
    public static final class d implements Iterable, InterfaceC19517a {

        /* renamed from: p */
        final /* synthetic */ SerialDescriptor f125051p;

        public d(SerialDescriptor serialDescriptor) {
            this.f125051p = serialDescriptor;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new b(this.f125051p);
        }
    }

    /* renamed from: a */
    public static final Iterable m135535a(SerialDescriptor serialDescriptor) {
        AbstractC19074t.m100208f(serialDescriptor, "<this>");
        return new c(serialDescriptor);
    }

    /* renamed from: b */
    public static final Iterable m135536b(SerialDescriptor serialDescriptor) {
        AbstractC19074t.m100208f(serialDescriptor, "<this>");
        return new d(serialDescriptor);
    }
}
