import { registerPlugin } from '@capacitor/core';

import { ApplePayPlugin } from './definitions';

export * from './definitions';
export * from './web';

const ApplePay = registerPlugin<ApplePayPlugin>('ApplePay', {
    web: () => import('./web').then(m => new m.ApplePayWeb()),
});

export { ApplePay };
