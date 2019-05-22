package fr.coppernic.app.myntp.di.components

import dagger.Component
import fr.coppernic.app.myntp.di.modules.ContextModule
import fr.coppernic.app.myntp.home.HomeActivity
import javax.inject.Singleton

@Singleton
@Component(modules = [(ContextModule::class)])
interface AppComponents {

    fun inject(homeActivity: HomeActivity)
}
