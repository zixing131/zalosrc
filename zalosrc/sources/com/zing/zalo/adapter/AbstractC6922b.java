package com.zing.zalo.adapter;

import com.zing.zalo.exception.ZarcelDuplicateException;
import com.zing.zalo.exception.ZarcelNotFoundException;
import com.zing.zalo.exception.ZarcelRuntimeException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.TreeMap;
import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* renamed from: com.zing.zalo.adapter.b */
/* loaded from: classes3.dex */
public abstract class AbstractC6922b {
    private final TreeMap<Integer, a> children = new TreeMap<>();

    /* renamed from: com.zing.zalo.adapter.b$a */
    /* loaded from: classes3.dex */
    private static class a {

        /* renamed from: a */
        final int f37921a;

        /* renamed from: b */
        final Class f37922b;

        /* renamed from: c */
        final Class f37923c;

        /* renamed from: d */
        final AbstractC6921a f37924d;

        public a(int i11, Class cls, Class cls2, AbstractC6921a abstractC6921a) {
            this.f37921a = i11;
            this.f37922b = cls;
            this.f37923c = cls2;
            this.f37924d = abstractC6921a;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC6922b() {
        onRegisterChildClasses();
    }

    public Object createFromSerialized(InterfaceC29690f interfaceC29690f) throws NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        int mo147644d = interfaceC29690f.mo147644d();
        for (Map.Entry<Integer, a> entry : this.children.entrySet()) {
            if (entry.getKey().intValue() == mo147644d) {
                Object create = entry.getValue().f37924d.create();
                entry.getValue().f37923c.getMethod("createFromSerialized", entry.getValue().f37922b, InterfaceC29690f.class).invoke(null, create, interfaceC29690f);
                return create;
            }
        }
        return null;
    }

    protected boolean isRegistered(int i11) {
        return this.children.containsKey(Integer.valueOf(i11));
    }

    protected abstract void onRegisterChildClasses();

    /* JADX INFO: Access modifiers changed from: protected */
    public <S> void registryAdd(int i11, Class<?> cls, Class<?> cls2, AbstractC6921a abstractC6921a) throws ZarcelDuplicateException {
        if (!this.children.containsKey(Integer.valueOf(i11))) {
            this.children.put(Integer.valueOf(i11), new a(i11, cls, cls2, abstractC6921a));
            return;
        }
        throw new ZarcelDuplicateException("Class " + cls.getName() + " have already registered.");
    }

    protected void registryRemove(int i11) {
        this.children.remove(Integer.valueOf(i11));
    }

    protected void registryUpdate(int i11, Class<?> cls, Class<?> cls2, AbstractC6921a abstractC6921a) throws ZarcelNotFoundException {
        if (this.children.containsKey(Integer.valueOf(i11))) {
            this.children.put(Integer.valueOf(i11), new a(i11, cls, cls2, abstractC6921a));
            return;
        }
        throw new ZarcelNotFoundException("Class " + cls.getName() + " does not exist.");
    }

    public void serialize(Object obj, InterfaceC29691g interfaceC29691g) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        for (Map.Entry<Integer, a> entry : this.children.entrySet()) {
            if (entry.getValue().f37922b.isInstance(obj)) {
                interfaceC29691g.mo147652a(entry.getKey().intValue());
                entry.getValue().f37923c.getMethod("serialize", entry.getValue().f37922b, InterfaceC29691g.class).invoke(null, obj, interfaceC29691g);
                return;
            }
        }
        throw new ZarcelRuntimeException(obj.getClass().getName() + "does not exist in Polymorphism Adapter.");
    }
}
