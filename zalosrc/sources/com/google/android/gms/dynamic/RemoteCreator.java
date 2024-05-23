package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.AbstractC4150d;
import com.google.android.gms.common.internal.AbstractC4205o;

/* loaded from: classes2.dex */
public abstract class RemoteCreator {
    private final String zza;
    private Object zzb;

    /* loaded from: classes2.dex */
    public static class RemoteCreatorException extends Exception {
        public RemoteCreatorException(String str) {
            super(str);
        }

        public RemoteCreatorException(String str, Throwable th2) {
            super(str, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public RemoteCreator(String str) {
        this.zza = str;
    }

    protected abstract Object getRemoteCreator(IBinder iBinder);

    /* JADX INFO: Access modifiers changed from: protected */
    public final Object getRemoteCreatorInstance(Context context) throws RemoteCreatorException {
        if (this.zzb == null) {
            AbstractC4205o.m19722k(context);
            Context m19581e = AbstractC4150d.m19581e(context);
            if (m19581e != null) {
                try {
                    this.zzb = getRemoteCreator((IBinder) m19581e.getClassLoader().loadClass(this.zza).newInstance());
                } catch (ClassNotFoundException e11) {
                    throw new RemoteCreatorException("Could not load creator class.", e11);
                } catch (IllegalAccessException e12) {
                    throw new RemoteCreatorException("Could not access creator.", e12);
                } catch (InstantiationException e13) {
                    throw new RemoteCreatorException("Could not instantiate creator.", e13);
                }
            } else {
                throw new RemoteCreatorException("Could not get remote context.");
            }
        }
        return this.zzb;
    }
}
