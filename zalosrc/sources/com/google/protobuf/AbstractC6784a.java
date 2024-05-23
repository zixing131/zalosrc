package com.google.protobuf;

import com.google.protobuf.InterfaceC6809i0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.protobuf.a */
/* loaded from: classes3.dex */
public abstract class AbstractC6784a implements InterfaceC6809i0 {
    protected int memoizedHashCode = 0;

    /* renamed from: com.google.protobuf.a$a */
    /* loaded from: classes3.dex */
    public static abstract class a implements InterfaceC6809i0.a {
        /* renamed from: l */
        protected static void m34716l(Iterable iterable, List list) {
            AbstractC6830s.m35129a(iterable);
            if (iterable instanceof InterfaceC6840x) {
                List mo34822y = ((InterfaceC6840x) iterable).mo34822y();
                InterfaceC6840x interfaceC6840x = (InterfaceC6840x) list;
                int size = list.size();
                for (Object obj : mo34822y) {
                    if (obj == null) {
                        String str = "Element at index " + (interfaceC6840x.size() - size) + " is null.";
                        for (int size2 = interfaceC6840x.size() - 1; size2 >= size; size2--) {
                            interfaceC6840x.remove(size2);
                        }
                        throw new NullPointerException(str);
                    }
                    if (obj instanceof AbstractC6799f) {
                        interfaceC6840x.mo34820q((AbstractC6799f) obj);
                    } else {
                        interfaceC6840x.add((String) obj);
                    }
                }
                return;
            }
            if (iterable instanceof InterfaceC6829r0) {
                list.addAll((Collection) iterable);
            } else {
                m34717m(iterable, list);
            }
        }

        /* renamed from: m */
        private static void m34717m(Iterable iterable, List list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (Object obj : iterable) {
                if (obj == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(obj);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: p */
        public static UninitializedMessageException m34718p(InterfaceC6809i0 interfaceC6809i0) {
            return new UninitializedMessageException(interfaceC6809i0);
        }

        /* renamed from: n */
        protected abstract a mo34720n(AbstractC6784a abstractC6784a);

        @Override // com.google.protobuf.InterfaceC6809i0.a
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public a mo34719F(InterfaceC6809i0 interfaceC6809i0) {
            if (mo34987g().getClass().isInstance(interfaceC6809i0)) {
                return mo34720n((AbstractC6784a) interfaceC6809i0);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public static void m34710d(Iterable iterable, List list) {
        a.m34716l(iterable, list);
    }

    /* renamed from: n */
    private String m34711n(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    /* renamed from: l */
    abstract int mo34712l();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public int m34713m(InterfaceC6839w0 interfaceC6839w0) {
        int mo34712l = mo34712l();
        if (mo34712l == -1) {
            int mo35049e = interfaceC6839w0.mo35049e(this);
            mo34714o(mo35049e);
            return mo35049e;
        }
        return mo34712l;
    }

    /* renamed from: o */
    abstract void mo34714o(int i11);

    /* renamed from: p */
    public byte[] m34715p() {
        try {
            byte[] bArr = new byte[mo34978f()];
            CodedOutputStream m34629Y = CodedOutputStream.m34629Y(bArr);
            mo34979h(m34629Y);
            m34629Y.m34679c();
            return bArr;
        } catch (IOException e11) {
            throw new RuntimeException(m34711n("byte array"), e11);
        }
    }
}
